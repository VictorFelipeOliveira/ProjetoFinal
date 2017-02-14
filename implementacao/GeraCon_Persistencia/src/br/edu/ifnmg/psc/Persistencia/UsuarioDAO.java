package br.edu.ifnmg.psc.Persistencia;
        
import br.edu.ifnmg.psc.Aplicacao.Usuario;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class UsuarioDAO extends DAOGenerico<Usuario> implements UsuarioRepositorio{

    public UsuarioDAO() {
        setConsultaAbrir("select id, login, senha from Usuario where id = ?");
        setConsultaApagar("delete from usuario where id = ?");
        setConsultaInserir("insert into usuario(login, senha) values (?, ?)");
        setConsultaAlterar("update usuario set login = ?, senha = ? where id = ?");
        setConsultaBusca("select id, login, senha from usuarios");
        setConsultaUltimoId("select max(id) from usuarios  where login = ? and senha = ?");
    }

    @Override
    protected Usuario preencheObjeto(ResultSet resultado) {
        Usuario usuario = new Usuario();
        
        try{
                usuario.setId(resultado.getInt(1));
                usuario.setLogin(resultado.getString(2));
                usuario.setSenha(resultado.getString(3));
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        
        return usuario;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Usuario usuario) {
         try {
           
            sql.setString(1, usuario.getLogin());
            sql.setString(2, usuario.getSenha());
            
            //if(usuario.getId() > 0) 
                //sql.setInt(4,usuario.getId());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Usuario filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getLogin() != null) adicionarFiltro("login", " like ");
        if(filtro.getSenha()!= null) adicionarFiltro("senha", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Usuario filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getLogin() != null ){ sql.setString(cont, filtro.getLogin() +"%"); cont++; }
            if(filtro.getSenha() != null){ 
                sql.setString(cont, filtro.getSenha()); 
                cont++; 
            }
                   
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Usuario Abrir(String login) {
        try {
            
            PreparedStatement sql = conn.prepareStatement("select id,login,senha from usuarios where login = ?");
           
            sql.setString(1,login);
            
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
    


