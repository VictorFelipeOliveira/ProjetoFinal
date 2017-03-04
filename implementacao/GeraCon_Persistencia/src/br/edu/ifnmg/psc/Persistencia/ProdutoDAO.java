/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Fornecedor;
import br.edu.ifnmg.psc.Aplicacao.Produto;
import br.edu.ifnmg.psc.Aplicacao.ProdutoRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thais
 */
public class ProdutoDAO extends DAOGenerico<Produto> implements ProdutoRepositorio {

    public ProdutoDAO() {
        setConsultaAbrir("select codigo, descricao, precoUnitario, fk_fornecedores, categoria, "
                + "nome, quantidade from Produtos where codigo = ?");
        setConsultaApagar("delete from Produtos where codigo = ?");
        setConsultaInserir("insert into Produtos (descricao, precoUnitario, fk_fornecedores, categoria, nome, quantidade)"
                + " values (?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Produtos set descricao = ?, preocUnitario = ?, fk_fornecedores = ?,"
                + "categoria = ?, nome = ?, quantidade = ? where codigo = ?");
        setConsultaBusca("select codigo, descricao, precoUnitario, fk_fornecedores, categoria,"
                + "nome, quantidade from Produtos");
        setConsultaUltimoId("select max(codigo) from Produtos where descricao = ? and precoUnitario = ?"
                + " and fk_fornecedores = ? and categoria = ? and nome = ? and quantidade = ?");
    }

    @Override
    protected Produto preencheObjeto(ResultSet resultado) {
        Produto produto = new Produto();
        try{
            produto.setId(resultado.getInt(1));
            produto.setDescricao(resultado.getString(2));
            produto.setPrecoUnitario(resultado.getFloat(3));
            produto.setFornecedor_fk(resultado.getInt(4));
            produto.setCategoria(resultado.getString(5));
            produto.setNome(resultado.getString(6));
            produto.setQuantidade(resultado.getInt(7));
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produto;
    } 

    @Override
    protected void preencheConsulta(PreparedStatement sql, Produto produto) {
        try{
            sql.setString(1, produto.getDescricao());
            sql.setFloat(2, produto.getPrecoUnitario());
            sql.setInt(3, produto.getFornecedor_fk());
            sql.setString(4, produto.getCategoria());
            sql.setString(5, produto.getNome());
            sql.setInt(6, produto.getQuantidade());
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Produto filtro) {
        if(filtro.getId() > 0) 
            adicionarFiltro("id", "=");
        if(filtro.getNome() != null) 
            adicionarFiltro("categoria", " like ");
        if(filtro.getPrecoUnitario()!= 0) 
            adicionarFiltro("precoUnitario", "=");
        
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Produto filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){
                sql.setInt(cont, filtro.getId());
                cont++; 
            }
            
            if(filtro.getNome() != null ){
                sql.setString(cont, filtro.getNome() +"%");
                cont++; 
            }
            
            if(filtro.getPrecoUnitario()!= 0){ 
                sql.setFloat(cont, filtro.getPrecoUnitario()); 
                cont++; 
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public Produto Abrir(String nome) {
        try {
            
            PreparedStatement sql = conn.prepareStatement("select codigo, descricao, precoUnitario, fk_fornecedores, "
                    + "categoria, nome, quantidade from Produtos where nome = ?");
            
            sql.setString(1, nome);
            
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next()){
                
                return preencheObjeto(resultado);
            }            
        }  catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return null;
    }

    @Override
    public boolean verificaProduto(String nome, float preco) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Produtos where nome = ? and precoUnitario = ?");
            sql.setString(1, nome);
            sql.setFloat(2, preco);
            ResultSet resultado = sql.executeQuery();
            return resultado.next();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Fornecedor> listarFornecedores() {
       ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
        String consulta = "select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cnpj from Fornecedores";
       
        try{
            PreparedStatement sql = conn.prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                Fornecedor fornecedor = new Fornecedor();
                
                fornecedor.setId(resultado.getInt(1));
                fornecedor.setNome(resultado.getString(2));
                fornecedor.setTelefone(resultado.getString(3));
                fornecedor.setEmail(resultado.getString(4));
                fornecedor.setRua(resultado.getString(5));
                fornecedor.setBairro(resultado.getString(6));
                fornecedor.setCidade(resultado.getString(7));
                fornecedor.setComplemento(resultado.getString(8));
                fornecedor.setNumero(resultado.getInt(9));
                fornecedor.setCnpj(resultado.getString(10));
                
                // Adiciona o objeto à lista
                listaFornecedores.add(fornecedor);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        } catch (ErroValidacao ex) {
            ex.printStackTrace();
        }
        
        return listaFornecedores;
    }    

    @Override
    public int BuscaProduto(String nome) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo, descricao, precoUnitario, fk_fornecedores, categoria, "
                + "nome, quantidade from Produtos where nome = ?");
            sql.setString(1, nome);
            ResultSet resultado = sql.executeQuery();
            
            while(resultado.next()){
                Produto produto = new Produto();
                
                produto.setId(resultado.getInt(1));
                produto.setDescricao(resultado.getString(2));
                produto.setPrecoUnitario(resultado.getFloat(3));
                produto.setFornecedor_fk(resultado.getInt(4));
                produto.setCategoria(resultado.getString(5));
                produto.setNome(resultado.getString(6));
                produto.setQuantidade(resultado.getInt(7));
                
                // Adiciona o objeto à lista
                return produto.getId();
            }
        }catch (SQLException ex) { 
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return 0;
    }
}