/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Venda;
import br.edu.ifnmg.psc.Aplicacao.VendaItem;
import br.edu.ifnmg.psc.Aplicacao.VendaRepositorio;
import java.math.BigDecimal;
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
    private TransacaoDAO transacao;
    private ProdutoDAO produto;

    public VendaDAO() {
        setConsultaAbrir("select codigo,valorTotal,desconto,formaPagamento, fk_clientes, fk_transacoes from Vendas where codigo = ?");
        setConsultaApagar("DELETE FROM Vendas WHERE id = ? ");
        setConsultaInserir("INSERT INTO Vendas(valorTotal,desconto,formaPagamento, fk_clientes, fk_transacoes)"
                + " VALUES(?,?,?,?,?)");
        setConsultaAlterar("UPDATE Vendas SET valorTotal = ?, desconto = ?, formaPagamento = ?, fk_clientes = ?,"
                + " fk_transacoes = ? where codigo = ? ");
        setConsultaBusca("select codigo, valorTotal, desconto, formaPagamento, fk_clientes, fk_transacoes from Vendas ");
        setConsultaUltimoId("select max(codigo) from Vendas where valorTotal = ? and desconto = ? and formaPagamento = ? "
                + "and fk_clientes = ? and fk_transacoes = ?");
        clientes = new ClienteDAO();
        transacao = new TransacaoDAO();
        produto = new ProdutoDAO();
    }

    @Override
    protected Venda preencheObjeto(ResultSet resultado) {
        try {
            Venda venda = new Venda();
            venda.setId(resultado.getInt(1) );
            venda.setValorTotal(resultado.getBigDecimal(2));
            venda.setDesconto(resultado.getBigDecimal(3));
            venda.setFormaPagamento(resultado.getString(4));
            venda.setCliente(clientes.Abrir( resultado.getInt(5)));
            venda.setTransacao(transacao.Abrir(resultado.getInt(6)));
            venda.setItens(carregaItens(venda));
            
            return venda;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Venda obj) {
         try {
            sql.setBigDecimal(1, obj.getValorTotal());
            sql.setBigDecimal(2, obj.getDesconto());
            sql.setString(3, obj.getFormaPagamento());
            sql.setInt(4, obj.getCliente().getId());
            sql.setInt(5, obj.getTransacao().getId());
            
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
    
    private List<VendaItem> carregaItens(Venda obj){
        List<VendaItem> ret = new ArrayList<>();
        String consulta = "SELECT codigo, quantidade, fk_transacoes, fk_produtos from ItensPedidos where codigo = ?";
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement(consulta);
            
            sql.setInt(1, obj.getId());
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                VendaItem item = new VendaItem();
                
                item.setId(resultado.getInt(1));
                item.setQuantidade(resultado.getInt(2));
                item.setTransacao(transacao.Abrir(resultado.getInt(3)));
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
            for(VendaItem item : obj.getItens()){
                if(item.getId() == 0){
                    try {
                        String consulta = "INSERT INTO ItensPedidos (quantidade, fk_transacoes, fk_produtos) values(?,?,?)";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, item.getQuantidade());
                        sql.setInt(2, obj.getTransacao().getId());
                        sql.setInt(3, item.getProduto().getId());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        return false;
                    }
                }
                else {
                    try {
                        String consulta = "UPDATE ItensPedidos set quantidade = ?, fk_transacoes = ?,f k_produtos = ? where codigo = ?";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, item.getQuantidade());
                        sql.setInt(2, obj.getTransacao().getId());
                        sql.setInt(3, item.getProduto().getId());
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
