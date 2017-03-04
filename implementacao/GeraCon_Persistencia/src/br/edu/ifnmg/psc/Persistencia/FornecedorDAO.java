/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Fornecedor;
import br.edu.ifnmg.psc.Aplicacao.FornecedorRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thais
 */
public class FornecedorDAO extends DAOGenerico<Fornecedor> implements FornecedorRepositorio{

    public FornecedorDAO() {
        setConsultaAbrir("select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cnpj from Fornecedores where codigo = ?");
        setConsultaApagar("delete from Fornecedores where codigo = ?");
        setConsultaInserir("insert into Fornecedores (nome, telefone, email, rua, bairro, cidade, complemento,"
                + " numero, cnpj) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Fornecedores set nome = ?, telefone = ?, email = ?, rua = ?, "
                + "bairro = ?, cidade = ?, complemento = ?, numero = ?, cnpj = ?  where codigo = ?");
        setConsultaBusca("select codigo, nome, telefone, email, rua, bairro, cidade, "
                + "complemento, numero, cnpj from Fornecedores");
        setConsultaUltimoId("select max(codigo) from Fornecedores where nome = ? and telefone = ? and email = ? and rua = ? "
                + "and bairro = ? and cidade = ? and complemento = ? and numero = ? and cnpj = ?");
    }

    @Override
    protected Fornecedor preencheObjeto(ResultSet resultado) {
        Fornecedor fornecedor = new Fornecedor();
        
        try{
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
        }catch(SQLException | ErroValidacao ex){
            ex.printStackTrace();
        }
        return fornecedor;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Fornecedor fornecedor) {
        try{
            sql.setString(1, fornecedor.getNome());
            sql.setString(2, fornecedor.getTelefone());
            sql.setString(3, fornecedor.getEmail());
            sql.setString(4, fornecedor.getRua());
            sql.setString(5, fornecedor.getBairro());
            sql.setString(6, fornecedor.getCidade());
            sql.setString(7, fornecedor.getComplemento());
            sql.setInt(8, fornecedor.getNumero());
            sql.setString(9, fornecedor.getCnpj());
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Fornecedor filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCnpj()!= null) adicionarFiltro("cnpj", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Fornecedor filtro) {
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
            
            if(filtro.getCnpj()!= null){ 
                sql.setString(cont, filtro.getCnpj()); 
                cont++; 
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Fornecedor Abrir(String cpf) {
          try {
            
            PreparedStatement sql = conn.prepareStatement("select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cnpj from Fornecedores where cnpj = ?");
            
            sql.setString(1, cpf);
            
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
    public boolean VerificaFornecedor(String cnpj) {
         try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Fornecedores where cnpj = ?");
            sql.setString(1, cnpj);
            ResultSet resultado = sql.executeQuery();
            return resultado.next();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
    }
}
