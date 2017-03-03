/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author victor
 */
public class ClienteDAO extends DAOGenerico <Cliente> implements ClienteRepositorio{

    public ClienteDAO(){
      
        setConsultaAbrir("select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, descricao, cpf, rg from Clientes where codigo = ?");
        
        setConsultaApagar("DELETE from Clientes where codigo = ?");
        
        setConsultaInserir("INSERT INTO Clientes (nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, descricao, cpf, rg) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        setConsultaAlterar("UPDATE Clientes SET nome = ?, telefone = ?, email = ?, rua = ?, bairro = ?, cidade = ?, "
                + "complemento = ?, numero = ?, descricao = ?, cpf = ?, rg = ? where codigo = ?");
        
        setConsultaBusca("select codigo, nome, telefone, email, rua, bairro, cidade, complemento,"
                + "numero, descricao, cpf, rg from Clientes");
        
        setConsultaUltimoId("select max(codigo) from Clientes where nome = ? and telefone = ? "
                + "and email = ? and rua = ? and bairro = ? and cidade = ? and complemento = ? and numero = ? "
                + "and descricao = ? and cpf = ? and rg = ?");
    }
    
    @Override
    protected Cliente preencheObjeto(ResultSet resultado) {
        Cliente cliente = new Cliente();
        
        try{
            cliente.setId(resultado.getInt(1));
            cliente.setNome(resultado.getString(2));
            cliente.setTelefone(resultado.getString(3));
            cliente.setEmail(resultado.getString(4));
            cliente.setRua(resultado.getString(5));
            cliente.setBairro(resultado.getString(6));
            cliente.setCidade(resultado.getString(7));
            cliente.setComplemento(resultado.getString(8));
            cliente.setNumero(resultado.getInt(9));
            cliente.setDescricao(resultado.getString(10));
            cliente.setCpf(resultado.getString(11));
            cliente.setRg(resultado.getString(12));
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return cliente;
        
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Cliente cliente) {
        try{
            //sql.setInt(1, cliente.getId());
            sql.setString(1, cliente.getNome());
            sql.setString(2, cliente.getTelefone());
            sql.setString(3, cliente.getEmail());
            sql.setString(4, cliente.getRua());
            sql.setString(5, cliente.getBairro());
            sql.setString(6, cliente.getCidade());
            sql.setString(7, cliente.getComplemento());
            sql.setInt(8, cliente.getNumero());
            sql.setString(9, cliente.getDescricao());
            sql.setString(10, cliente.getCpf());
            sql.setString(11, cliente.getRg());
        
            if(cliente.getId()>0)
                sql.setInt(12, cliente.getId());
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Cliente filtro) {
        if(filtro.getId() > 0) 
            adicionarFiltro("id", "=");
        if(filtro.getNome() != null) 
            adicionarFiltro("nome", " like ");
        if(filtro.getCpf() != null) 
            adicionarFiltro("cpf", "=");    
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Cliente filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ 
                sql.setInt(cont, filtro.getId()); 
                cont++; 
            }
            
            if(filtro.getNome() != null ){
                sql.setString(cont, filtro.getNome() +" % ");
                cont++;
            }
            
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
            
            PreparedStatement sql = conn.prepareStatement("select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, descricao, cpf, rg from Clientes where cpf = ?");
            
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
    public boolean VerificaCliente(String cpf, String rg) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Clientes where cpf = ? and rg = ?");
            sql.setString(1, cpf);
            sql.setString(2, rg);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                return true;
            }else
                return false;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return false;
    }

}
