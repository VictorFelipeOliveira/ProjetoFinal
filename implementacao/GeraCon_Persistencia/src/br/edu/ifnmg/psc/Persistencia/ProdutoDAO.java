/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Produto;
import br.edu.ifnmg.psc.Aplicacao.ProdutoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author thais
 */
public class ProdutoDAO extends DAOGenerico<Produto> implements ProdutoRepositorio {

    public ProdutoDAO() {
        setConsultaAbrir(null);
        setConsultaApagar(null);
        setConsultaInserir(null);
        setConsultaAlterar(null);
        setConsultaBusca(null);
        setConsultaUltimoId(null);
    }

    public Produto Abrir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Salvar(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Apagar(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto Abrir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> Buscar(Produto filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Produto preencheObjeto(ResultSet resultado) {
        Produto produto = new Produto();
        produto.setId(0);
        produto.setDescricao(null);
        produto.setPrecoUnitario(0);
        produto.setUnidadeMedida(null);
        return produto;

    
    } 

    @Override
    protected void preencheConsulta(PreparedStatement sql, Produto produto) {
        try{
            sql.setString(1, produto.getDescricao());
            sql.setFloat(2, produto.getPrecoUnitario());
            sql.setString(3, produto.getUnidadeMedida());
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Produto filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Produto filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}