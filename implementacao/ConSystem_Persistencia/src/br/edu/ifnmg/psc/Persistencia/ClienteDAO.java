/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor
 */
public class ClienteDAO extends DAOGenerico <Cliente> implements ClienteRepositorio{

    public ClienteDAO(){
      
        setConsultaAbrir("select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cpf, rg, dataNascimento, sexo from Clientes where codigo = ?");
        
        setConsultaApagar("DELETE from Clientes where codigo = ?");
        
        setConsultaInserir("INSERT INTO Clientes (nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cpf, rg, dataNascimento, sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        setConsultaAlterar("UPDATE Clientes SET nome = ?, telefone = ?, email = ?, rua = ?, bairro = ?, cidade = ?, "
                + "complemento = ?, numero = ?, cpf = ?, rg = ?, dataNascimento = ?, sexo = ? where codigo = ?");
        
        setConsultaBusca("select codigo, nome, telefone, email, rua, bairro, cidade, complemento,"
                + "numero, cpf, rg, dataNascimento, sexo from Clientes");
        
        setConsultaUltimoId("select max(codigo) from Clientes where nome = ? and telefone = ? "
                + "and email = ? and rua = ? and bairro = ? and cidade = ? and complemento = ? and numero = ? "
                + "and cpf = ? and rg = ? and dataNascimento = ? and sexo = ?");
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
            cliente.setCpf(resultado.getString(10));
            cliente.setRg(resultado.getString(11));
            cliente.setDataNascimento(resultado.getDate(12));
            cliente.setSexo(resultado.getString(13));
            
        } catch(SQLException | ErroValidacao | ParseException ex){
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
            sql.setString(9, cliente.getCpf());
            sql.setString(10, cliente.getRg());
            sql.setDate(11, cliente.getDataNascimento());
            sql.setString(12, cliente.getSexo());
        
            if(cliente.getId()>0)
                sql.setInt(12, cliente.getId());
        } catch(SQLException | ParseException ex){
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Cliente filtro) {
        if(filtro.getId()> 0) 
            adicionarFiltro("codigo", "=");
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
                + "numero, cpf, rg, dataNascimento, sexo from Clientes where cpf = ?");
            
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

    @Override
    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        String consulta = "select codigo, nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, cpf, rg, dataNascimento from Clientes";
       
        try{
            PreparedStatement sql = conn.prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
                        
            // Verifica se algum registro foi retornado na consulta
            while(resultado.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(resultado.getInt(1));
                cliente.setNome(resultado.getString(2));
                cliente.setTelefone(resultado.getString(3));
                cliente.setEmail(resultado.getString(4));
                cliente.setRua(resultado.getString(5));
                cliente.setBairro(resultado.getString(6));
                cliente.setCidade(resultado.getString(7));
                cliente.setComplemento(resultado.getString(8));
                cliente.setNumero(resultado.getInt(9));
                cliente.setCpf(resultado.getString(10));
                cliente.setRg(resultado.getString(11));
                cliente.setDataNascimento(resultado.getDate(12));
                
                // Adiciona o objeto à lista
                listaClientes.add(cliente);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        } catch (ErroValidacao ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaClientes;
    }
}