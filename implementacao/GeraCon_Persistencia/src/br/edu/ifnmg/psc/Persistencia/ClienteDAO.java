/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author victor
 */
public class ClienteDAO extends DAOGenerico <Cliente> implements ClienteRepositorio{

    public ClienteDAO(){
        setConsultaAbrir("select codigo, nome, telefone, email, descricao, cpf, rg, rua, bairro,"
                + " cidade, complemento from Clientes where codigo = ?");
        setConsultaApagar("delete from clientes where codigo = ?");
        setConsultaInserir("insert into clientes (nome, telefone, email, descricao, cpf, rg, rua, bairro,"
                + " cidade, complemento) values (?, ?, ? , ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update clientes set nome = ?, telefone = ?, email = ?, descricao = ?, cpf = ?, "
                + "rg = ?, rua = ?, bairro = ?, cidade = ?, complemento = ? where codigo = ?");
        setConsultaBusca("select codigo, nome, telefone, email, descricao, cpf, rg, rua, bairro,"
                + " cidade, complemento from Clientes");
        setConsultaUltimoId("select max(codigo) from Clientes where nome = ?, and cpf = ? and rg = ?");
    }
    
    @Override
    protected Cliente preencheObjeto(ResultSet resultado) {
        Cliente cliente = new Cliente();
        
        try{
            cliente.setId(resultado.getInt(1));
            cliente.setNome(resultado.getString(2));
            cliente.setTelefone(resultado.getString(3));
            cliente.setEmail(resultado.getString(4));
            cliente.setDescricao(resultado.getString(5));
            cliente.setCpf(resultado.getString(6));
            cliente.setRg(resultado.getString(7));
            cliente.setRua(resultado.getString(8));
            cliente.setBairro(resultado.getString(9));
            cliente.setCidade(resultado.getString(10));
            cliente.setComplemento(resultado.getString(11));
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return cliente;
        
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Cliente cliente) {
        try{
            
            sql.setString(1,  cliente.getNome() );
            sql.setString(2,  cliente.getCpf());
            sql.setString(3,  cliente.getDescricao());
            sql.setString(4,  cliente.getRg());
            sql.setString(5,  cliente.getEmail());
            sql.setString(6,  cliente.getTelefone());
            sql.setString(7,  cliente.getBairro());
            sql.setString(8,  cliente.getCidade());
            sql.setString(9,  cliente.getComplemento());
            sql.setString(10, cliente.getRua());
            sql.setInt(11, cliente.getNumero());
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Cliente filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCpf() != null) adicionarFiltro("cpf", "=");    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Cliente filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome() +"%"); cont++; }
            if(filtro.getCpf() != null){ 
                sql.setString(cont, filtro.getCpf()); 
                cont++; 
            }
            
        
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public Cliente Abrir(String cpf) {
        try {
            
            PreparedStatement sql = conn.prepareStatement("select codigo, nome, telefone, email, descricao, cpf, rg, rua, bairro,"
                + " cidade, complemento from Clientes where codigo = ?");
            
            
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
