/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Fornecedor;
import br.edu.ifnmg.psc.Aplicacao.FornecedorRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thais
 */
public class FornecedorDAO extends DAOGenerico<Fornecedor> implements FornecedorRepositorio{

    public FornecedorDAO() {
        setConsultaAbrir("select codigo, nome, cnpj, telefone, email, rua, numero, complemento, "
                + "bairro, cidade from Fornecedores where codigo = ?");
        setConsultaApagar("delete from Fornecedores where codigo = ?");
        setConsultaInserir("insert into Fornecedores (nome, cnpj, telefone, email, rua, numero, "
                + "complemento, bairro, cidade) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Fornecedores set nome = ?, cnpj = ?, telefone = ?, email = ?, "
                + "rua = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?  where codigo = ?");
        setConsultaBusca("select codigo, nome, cnpj, telefone, email, rua, numero, complemento, "
                + "bairro, cidade from Fornecedores");
        setConsultaUltimoId("select max(codigo) from Fornecedores where nome = ? and cnpj =?");
    }

    @Override
    protected Fornecedor preencheObjeto(ResultSet resultado) {
        Fornecedor fornecedor = new Fornecedor();
        
        try{
            fornecedor.setId(resultado.getInt(1));
            fornecedor.setNome(resultado.getString(2));
            fornecedor.setCnpj(resultado.getString(3));
            fornecedor.setTelefone(resultado.getString(4));
            fornecedor.setEmail(resultado.getString(5));
            fornecedor.setRua(resultado.getString(6));
            fornecedor.setNumero(resultado.getInt(7));
            fornecedor.setComplemento(resultado.getString(8));
            fornecedor.setBairro(resultado.getString(9));
            fornecedor.setCidade(resultado.getString(10));
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return fornecedor;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Fornecedor fornecedor) {
        try{
            sql.setString(1, fornecedor.getNome());
            sql.setString(2, fornecedor.getCnpj());
            sql.setString(3, fornecedor.getTelefone());
            sql.setString(4, fornecedor.getEmail());
            sql.setString(5, fornecedor.getRua());
            sql.setInt(6, fornecedor.getNumero());
            sql.setString(7, fornecedor.getComplemento());
            sql.setString(8, fornecedor.getBairro());
            sql.setString(9, fornecedor.getCidade());
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
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome() +"%"); cont++; }
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
            
            PreparedStatement sql = conn.prepareStatement("select id, nome, cpf, dataNascimento "
                    + "from clientes where cpf = ?");
            
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
}
