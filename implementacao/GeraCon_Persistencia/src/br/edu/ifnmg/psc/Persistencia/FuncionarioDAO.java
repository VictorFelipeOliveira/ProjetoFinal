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
         setConsultaAbrir("select codigo, nome, telefone, email, cpf, cargo, "
                + "carteiraTrabalho, rua, bairro, cidade, complemento from Funcionarios where codigo = ?");
        setConsultaApagar("delete from Funcionarios where codigo = ?");
        setConsultaInserir("insert into Funcionarios (nome, telefone, email, cpf, cargo, "
                + "carteiraTrabalho, rua, bairro, cidade, complemento) values (?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Funcionarios set nome = ?, telefone = ?, email = ?, cpf = ?, "
                + "cargo = ?, carteiraTrabalho = ?, rua = ?, bairro = ?, cidade = ?, complemento = ? "
                + "where codigo = ?");
        setConsultaBusca("select codigo, nome, telefone, email, cpf, cargo, carteiraTrabalho, "
                + "rua, bairro, cidade, complemento from Funcionarios");
        setConsultaUltimoId("select max(codigo) from Funcionarios where nome = ?, and cpf = ? and carteiraTrabalho = ?");
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        Funcionario funcionario = new Funcionario();
        
       try{
            funcionario.setId(resultado.getInt(1));
            funcionario.setNome(resultado.getString(2));
            funcionario.setTelefone(resultado.getString(3));
            funcionario.setEmail(resultado.getString(4));
            funcionario.setCpf(resultado.getString(6));
            funcionario.setCargo(resultado.getString(7));
            funcionario.setCarteiraTrabalho(resultado.getString(8));
            funcionario.setRua(resultado.getString(9));
            funcionario.setBairro(resultado.getString(10));
            funcionario.setCidade(resultado.getString(11));
            funcionario.setComplemento(resultado.getString(12));
        
        }catch(SQLException ex){
           ex.printStackTrace();
       }
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario funcionario) {
            
        try {
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
