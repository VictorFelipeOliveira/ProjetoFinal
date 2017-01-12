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
        setConsultaAbrir(null);
        setConsultaApagar(null);
        setConsultaInserir(null);
        setConsultaAlterar(null);
        setConsultaBusca(null);
        setConsultaUltimoId(null);
        
    }
    @Override
    protected Cliente preencheObjeto(ResultSet resultado) {
        Cliente cliente = new Cliente();
        
        try{
            
            cliente.setId(id);
            cliente.setCpf(null);
            cliente.setDescricao(null);
            cliente.setRg(null);
            cliente.setNome(null);
            cliente.setTelefone(null);
            cliente.setEmail(null);
        } catch(SQLException ex){
            
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
            System.out.println(ex);
            
        }
    }

    @Override
    protected void preencheFiltros(Cliente filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Cliente filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
}
