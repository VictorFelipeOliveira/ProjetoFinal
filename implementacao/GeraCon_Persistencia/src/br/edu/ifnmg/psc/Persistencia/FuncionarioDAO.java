/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Funcionario;
import br.edu.ifnmg.psc.Aplicacao.FuncionarioRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thais
 */
public class FuncionarioDAO extends DAOGenerico<Funcionario> implements FuncionarioRepositorio {

    public FuncionarioDAO(){
        setConsultaAbrir(null);
        setConsultaApagar(null);
        setConsultaInserir(null);
        setConsultaBusca(null);
        setConsultaUltimoId(null);
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        Funcionario funcionario = new Funcionario();
        
       try{
            funcionario.setId(id);
            funcionario.setCpf(null);
            funcionario.setCargo(null);
            funcionario.setNome(null);
            funcionario.setTelefone(null);
            funcionario.setEmail(null);
            funcionario.setCarteiraTrabalho(null);
            funcionario.setCidade(null);
            funcionario.setComplemento(null);
            funcionario.setRua(null);
            funcionario.setNumero(0);
        
        }catch(SQLException ex){
           System.out.println(ex);
       }
       return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario funcionario) {
            
        try {
            sql.setString(1,  funcionario.getNome() );
            sql.setString(2,  funcionario.getCpf());
            sql.setString(3, funcionario.getCarteiraTrabalho());
            sql.setString(4, funcionario.getCargo());
            sql.setString(5,  funcionario.getEmail());
            sql.setString(6,  funcionario.getTelefone());
            sql.setString(7,  funcionario.getBairro());
            sql.setString(8,  funcionario.getCidade());
            sql.setString(9,  funcionario.getComplemento());
            sql.setString(10, funcionario.getRua());
            sql.setInt(11, funcionario.getNumero());
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
    
}
