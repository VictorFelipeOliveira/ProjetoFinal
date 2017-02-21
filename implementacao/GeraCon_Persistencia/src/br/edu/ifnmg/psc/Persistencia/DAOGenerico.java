/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Entidade;
import br.edu.ifnmg.psc.Aplicacao.Repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thais
 */
public abstract class DAOGenerico<T extends Entidade> implements Repositorio<T> {
    
    protected Connection conn;

    private String consultaAbrir;
    private String consultaApagar;
    private String consultaInserir;
    private String consultaAlterar;
    private String consultaBusca;
    private String consultaUltimoId;

    private String where = "";
    
    public DAOGenerico() {
        try {
            DB.Iniciar();
            conn = DB.criarConexao();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        } catch (SQLException ex) {
            System.out.println("Usuário/senha errados!");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    protected abstract T preencheObjeto(ResultSet resultado);

    protected abstract void preencheConsulta(PreparedStatement sql, T obj);

    protected abstract void preencheFiltros(T filtro);

    protected abstract void preencheParametros(PreparedStatement sql, T filtro);

    @Override
    public boolean Salvar(T obj) {
        try {
            if (obj.getId() == 0) {
               
                PreparedStatement sql = conn.prepareStatement(getConsultaInserir());
                preencheConsulta(sql, obj);
                sql.executeUpdate();
                PreparedStatement sql2 = conn.prepareStatement(getConsultaUltimoId());
                preencheConsulta(sql2, obj);
                ResultSet resultado = sql2.executeQuery();

                if (resultado.next()) {
                    obj.setId( resultado.getInt(1) );
                }

            }else{
                
                PreparedStatement sql = conn.prepareStatement(getConsultaAlterar());
                preencheConsulta(sql, obj);
                sql.executeUpdate();

            }
            return true;
            } catch (SQLException e) {
                e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Apagar(T obj) {
        try {
            if (obj.getId() > 0) {
                
                PreparedStatement sql = conn.prepareStatement(getConsultaApagar());

                sql.setInt(1, obj.getId());

                sql.executeUpdate();

            }

    return true;

        } catch (SQLException e) {
            System.out.print(e);

        }
        return false;
    }
    
    @Override
    public T Abrir(int id) {
        try {

            
            PreparedStatement sql = conn.prepareStatement(getConsultaAbrir());

            
            sql.setInt(1, id);

            
            ResultSet resultado = sql.executeQuery();

            
            if (resultado.next()) {
                return preencheObjeto(resultado);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
    @Override
    public List<T> Buscar(T filtro) {
        List<T> listaRetorno = new ArrayList<>();

        preencheFiltros(filtro);

        if (where.length() > 0) {
            where = "WHERE " + where;
        }

        try {

            PreparedStatement sql = conn.prepareStatement(getConsultaBusca() + where);

            preencheParametros(sql, filtro);

            ResultSet resultado = sql.executeQuery();

            while (resultado.next()) {

                T objeto = preencheObjeto(resultado);

                listaRetorno.add(objeto);
            }
        } catch (SQLException ex) {
        
        }

        return listaRetorno;
    }

    protected void adicionarFiltro(String campo, String operador) {
        if (where.length() > 0) {
            where = where + " and ";
        }

        where = where + campo + " " + operador + " ?";
    }

    public String getConsultaAbrir() {
        return consultaAbrir;
    }

    public void setConsultaAbrir(String consultaAbrir) {
        this.consultaAbrir = consultaAbrir;
    }

    public String getConsultaApagar() {
        return consultaApagar;
    }

    public void setConsultaApagar(String consultaApagar) {
        this.consultaApagar = consultaApagar;
    }
    
    public String getConsultaInserir() {
        return consultaInserir;
    }

    public void setConsultaInserir(String consultaInserir) {
        this.consultaInserir = consultaInserir;
    }

    public String getConsultaAlterar() {
        return consultaAlterar;
    }

    public void setConsultaAlterar(String consultaAlterar) {
        this.consultaAlterar = consultaAlterar;
    }

    public String getConsultaBusca() {
        return consultaBusca;
    }

    public void setConsultaBusca(String consultaBusca) {
        this.consultaBusca = consultaBusca;
    }

    public String getConsultaUltimoId() {
        return consultaUltimoId;
    }
    public void setConsultaUltimoId(String consultaUltimoId) {
        this.consultaUltimoId = consultaUltimoId;
    }
    
}
