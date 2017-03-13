/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Compra;
import br.edu.ifnmg.psc.Aplicacao.CompraRepositorio;
import br.edu.ifnmg.psc.Aplicacao.ItensCompra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor
 */
public class CompraDAO extends DAOGenerico<Compra> implements CompraRepositorio{

    private FornecedorDAO fornecedor;
    private ProdutoDAO produto;

    public CompraDAO() {
        setConsultaAbrir("select codigo, data, fk_fornecedores from Compras where codigo = ?");
        setConsultaApagar("DELETE FROM Compras WHERE codigo = ? ");
        setConsultaInserir("INSERT INTO Compras(data, fk_fornecedores) VALUES(?, ?)");
        setConsultaAlterar("UPDATE Compras SET data = ?, fk_fornecedores = ? where codigo = ? ");
        setConsultaBusca("select codigo, data, fk_fornecedores from Compras ");
        setConsultaUltimoId("select max(codigo) from Compras where data = ? and fk_fornecedores = ?");
        fornecedor = new FornecedorDAO();
        produto = new ProdutoDAO();
    }
    
    @Override
    protected Compra preencheObjeto(ResultSet resultado) {
        try {
            Compra compra = new Compra();
            compra.setId(resultado.getInt(1));
            compra.setData(resultado.getDate(2));
            compra.setFornecedor(fornecedor.Abrir(resultado.getString(3)));
            
            return compra;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Compra obj) {
        try {
           // sql.setInt(1, obj.getId());
            sql.setDate(1, new java.sql.Date(obj.getData().getTime()));
            sql.setInt(2, obj.getFornecedor().getId());
            
            if(obj.getId() > 0) 
                sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Compra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Compra filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra Abrir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<ItensCompra> carregaItens(Compra obj){
        List<ItensCompra> ret = new ArrayList<>();
        String consulta = "SELECT codigo, quantidade, fk_compras, fk_produtos from ItensCompras where codigo = ?";
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(consulta);
            
            sql.setInt(1, obj.getId());
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                ItensCompra item = new ItensCompra();
                
                item.setId(resultado.getInt(1));
                item.setQuantidade(resultado.getInt(2));
                item.setCompra(obj);
                item.setProduto(produto.Abrir(resultado.getInt(4)));
                
                
                // Adiciona o objeto à lista
                ret.add(item);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return ret;
    }
    
    public boolean Salvar(Compra obj){
        if(!super.Salvar(obj))
            return false;
        
        if(obj.getId() > 0 ){
            for(ItensCompra item : obj.getItens()){
                if(item.getId() == 0){
                    try {
                        String consulta = "INSERT INTO ItensCompras (quantidade, fk_compras, fk_produtos) values(?,?,?)";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, item.getQuantidade());
                        sql.setInt(2, obj.getId());
                        sql.setInt(3, item.getProduto().getId());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        return false;
                    }
                }
                else {
                    try {
                        String consulta = "UPDATE ItensCompras set quantidade = ?, fk_compras = ?,fk_produtos = ? where codigo = ?";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, item.getQuantidade());
                        sql.setInt(2, obj.getId());
                        sql.setInt(3, item.getProduto().getId());
                        sql.setInt(4, item.getId());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        return false;
                    }
                }
            }
            
        }
        
        return true;
    }
    
}
