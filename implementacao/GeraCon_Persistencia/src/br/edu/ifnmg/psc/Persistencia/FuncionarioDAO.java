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
       
       return funcionario;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario funcionario) {
            
        try {
            sql.setString(1,  funcionario.getNome() );
            sql.setString(2,  funcionario.getCpf());
            sql.setString(3,  funcionario.getCargo());
            sql.setString(4,  funcionario.getCarteiraTrabalho());
            sql.setString(5,  funcionario.getEmail());
            sql.setString(6,  funcionario.getTelefone());
            sql.setString(7,  funcionario.getBairro());
            sql.setString(8,  funcionario.getCidade());
            sql.setString(9,  funcionario.getComplemento());
            sql.setString(10, funcionario.getRua());
            sql.setInt(11, funcionario.getNumero());
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getId()>0) 
            adicionarFiltro("id", "=");
        if(filtro.getNome() != null)
            adicionarFiltro("nome", " like ");
        if(filtro.getCpf()!=null)
            adicionarFiltro("cpf", "=");
        
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        try{
            int cont = 1;
            if(filtro.getId() > 0)
                sql.setInt(cont, filtro.getId());
            cont++;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Funcionario Abrir(String cpf) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo, nome, telefone, email, cpf, cargo, "
                    + "carteiraTrabalho, rua, bairro, cidade, complemento from Funcionarios where cpf = ? ");
            sql.setString(1, cpf);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next())
                return preencheObjeto(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
 
}
