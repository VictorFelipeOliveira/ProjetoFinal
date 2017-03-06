/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Funcionario;
import br.edu.ifnmg.psc.Aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thais
 */
public class FuncionarioDAO extends DAOGenerico<Funcionario> implements FuncionarioRepositorio {

    public FuncionarioDAO(){
         setConsultaAbrir("select codigo, nome, telefone, email, rua, bairro, cidade, "
                 + "complemento, numero, carteiraTrabalho, cargo, cpf, rg, dataNascimento , sexo from Funcionarios where codigo = ?");
        setConsultaApagar("DELETE from Funcionarios where codigo = ?");
        setConsultaInserir("insert into Funcionarios (nome, telefone, email, rua, bairro, cidade, complemento, "
                + "numero, carteiraTrabalho, cargo, cpf, rg, dataNascimento, sexo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Funcionarios set nome = ?, telefone = ?, email = ?, rua = ?, "
                + "bairro = ?, cidade = ?, complemento = ?, numero = ?, carteiraTrabalho = ?, cargo = ?, cpf = ?, rg = ?, "
                + "dataNascimento = ?, sexo = ? where codigo = ?");
        setConsultaBusca("select codigo, nome, telefone, email, rua, bairro, cidade, "
                 + "complemento, numero, carteiraTrabalho, cargo, cpf, rg, dataNascimento, sexo from Funcionarios");
        setConsultaUltimoId("select max(codigo) from Funcionarios where nome = ? and telefone = ? and email = ? and rua = ? "
                + "and bairro = ? and cidade = ? and complemento = ? and numero = ? and carteiraTrabalho = ? and cargo = ? "
                + "and cpf = ? and rg = ? and dataNascimento = ? and sexo = ?");
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        Funcionario funcionario = new Funcionario();
        
       try{
            funcionario.setId(resultado.getInt(1));
            funcionario.setNome(resultado.getString(2));
            funcionario.setTelefone(resultado.getString(3));
            funcionario.setEmail(resultado.getString(4));
            funcionario.setRua(resultado.getString(5));
            funcionario.setBairro(resultado.getString(6));
            funcionario.setCidade(resultado.getString(7));
            funcionario.setComplemento(resultado.getString(8));
            funcionario.setNumero(Integer.parseInt(resultado.getString(9)));
            funcionario.setCarteiraTrabalho(resultado.getString(10));
            funcionario.setCargo(resultado.getString(11));
            funcionario.setCpf(resultado.getString(12));
            funcionario.setRg(resultado.getString(13));
            funcionario.setDataNascimento(resultado.getDate(14));
            funcionario.setSexo(resultado.getString(15));
            
        }catch(SQLException ex){
           System.out.println(ex);
       } catch (ErroValidacao ex) {
           ex.printStackTrace();
        }

       return funcionario;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario funcionario) {
            
        try {
            sql.setString(1, funcionario.getNome());
            sql.setString(2, funcionario.getTelefone());
            sql.setString(3, funcionario.getEmail());
            sql.setString(4, funcionario.getRua());
            sql.setString(5, funcionario.getBairro());
            sql.setString(6, funcionario.getCidade());
            sql.setString(7, funcionario.getComplemento());
            sql.setInt(8, funcionario.getNumero());
            sql.setString(9,  funcionario.getCarteiraTrabalho());
            sql.setString(10, funcionario.getCargo());
            sql.setString(11, funcionario.getCpf());
            sql.setString(12, funcionario.getRg());
            sql.setDate(13, funcionario.getDataNascimento());
            sql.setString(14, funcionario.getSexo());
            
            if(funcionario.getId()> 0) 
                sql.setInt(14,funcionario.getId());
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        //System.out.println("Consulta no funcionario: "+sql);
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getId()>0) 
            adicionarFiltro("id", " = ");
        if(filtro.getNome() != null)
            adicionarFiltro("nome", " like ");
        if(filtro.getCpf()!=null)
            adicionarFiltro("cpf", " = ");
        
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
            PreparedStatement sql = conn.prepareStatement("select codigo, nome, telefone, email, rua, bairro, cidade, "
                 + "complemento, numero, carteiraTrabalho, cargo, cpf, rg, dataNascimento, sexo from Funcionarios where cpf = ?");
            sql.setString(1, cpf);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next())
                return preencheObjeto(resultado);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }

    @Override
    public boolean VerificaFuncionario(String cpf, String rg) {
         try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Funcionarios where cpf = ? and rg = ?");
            sql.setString(1, cpf);
            sql.setString(2, rg);
            ResultSet resultado = sql.executeQuery();
            return resultado.next();    //Retirada do IF aki
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return false;
    }
 
}
