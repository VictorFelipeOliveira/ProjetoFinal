/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.ItensVenda;
import br.edu.ifnmg.psc.Aplicacao.Venda;
import br.edu.ifnmg.psc.Aplicacao.VendaRepositorio;
import java.math.BigDecimal;
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
public class VendaDAO extends DAOGenerico<Venda> implements VendaRepositorio{
    private ClienteDAO clientes;
    private ProdutoDAO produto;

    public VendaDAO() {
        setConsultaAbrir("select codigo, valorTotal, desconto, formaPagamento, fk_clientes, data from Vendas where codigo = ?");
        setConsultaApagar("DELETE FROM Vendas WHERE id = ? ");
        setConsultaInserir("INSERT INTO Vendas(valorTotal, desconto, formaPagamento, fk_clientes, data)"
                + " VALUES(?, ?, ?, ?, ?)");
        setConsultaAlterar("UPDATE Vendas SET valorTotal = ?, desconto = ?, formaPagamento = ?, fk_clientes = ?,"
                + " data = ? where codigo = ? ");
        setConsultaBusca("select codigo, valorTotal, desconto, formaPagamento, fk_clientes, data from Vendas ");
        setConsultaUltimoId("select max(codigo) from Vendas where valorTotal = ? and desconto = ? and formaPagamento = ? "
                + "and fk_clientes = ? and data = ?");
        clientes = new ClienteDAO();
        produto = new ProdutoDAO();
    }

    @Override
    protected Venda preencheObjeto(ResultSet resultado) {
        try {
            Venda venda = new Venda();
            venda.setId(resultado.getInt(1));
            venda.setValorTotal(resultado.getBigDecimal(2));
            venda.setDesconto(resultado.getBigDecimal(3));
            venda.setFormaPagamento(resultado.getString(4));
            venda.setCliente(clientes.Abrir( resultado.getInt(5)));
            venda.setData(new java.sql.Date(resultado.getDate(6).getTime()));
            venda.setItens((ArrayList<ItensVenda>) carregaItens(venda));
            
            return venda;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Venda obj) {
         try {
           // sql.setInt(1, obj.getId());
            sql.setBigDecimal(1, obj.getValorTotal());
            sql.setBigDecimal(2, obj.getDesconto());
            sql.setString(3, obj.getFormaPagamento());
            sql.setInt(4, obj.getCliente().getId());
            sql.setDate(5, new java.sql.Date(obj.getData().getTime()));
            
            if(obj.getId() > 0) 
                sql.setInt(6, obj.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Venda filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Venda filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<ItensVenda> carregaItens(Venda obj){
        List<ItensVenda> ret = new ArrayList<>();
        String consulta = "SELECT codigo, quantidade, fk_vendas, fk_produtos from ItensVendas where codigo = ?";
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(consulta);
            
            sql.setInt(1, obj.getId());
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                ItensVenda item = new ItensVenda();
                
                item.setId(resultado.getInt(1));
                item.setQuantidade(resultado.getInt(2));
                item.setVenda(obj);
                item.setProduto(produto.Abrir(resultado.getInt(4)));
                
                
                // Adiciona o objeto à lista
                ret.add(item);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return ret;
    }
    
    public boolean Salvar(Venda obj){
        if(!super.Salvar(obj))
            return false;
        
        if(obj.getId() > 0 ){
            for(ItensVenda item : obj.getItens()){
                if(item.getId() == 0){
                    try {
                        String consulta = "INSERT INTO ItensVendas (quantidade, fk_vendas, fk_produtos) values(?,?,?)";
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
                        String consulta = "UPDATE ItensVendas set quantidade = ?, fk_Vendas = ?,fk_produtos = ? where codigo = ?";
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

    @Override
    public ArrayList<Venda> listarVendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
