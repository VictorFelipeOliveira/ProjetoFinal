/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Veiculo;
import br.edu.ifnmg.psc.Aplicacao.VeiculoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor
 */
public class VeiculoDAO extends DAOGenerico<Veiculo> implements VeiculoRepositorio{

    public VeiculoDAO() {
        setConsultaAbrir("select codigo, placa, tipo, ano, observacao from Veiculos where codigo = ?");
        setConsultaApagar("delete from veiculos where codigo = ?");
        setConsultaInserir("insert into veiculos(placa, tipo, ano, observacao) values (?, ?, ?, ?)");
        setConsultaAlterar("update veiculos set placa = ?, tipo = ?, ano = ?, observacao = ? where codigo = ?");
        setConsultaBusca("select codigo, placa, tipo, ano, observacao from veiculos");
        setConsultaUltimoId("select max(codigo) from veiculos  where placa = ? and tipo = ? and ano = ?");
    }
    
    
    @Override
    protected Veiculo preencheObjeto(ResultSet resultado) {
        Veiculo veiculo = new Veiculo();
        
        try{
                veiculo.setId(resultado.getInt(1));
                veiculo.setPlaca(resultado.getString(2));
                veiculo.setTipo(resultado.getString(3));
                veiculo.setAno(resultado.getInt(4));
                veiculo.setObservacoes(resultado.getString(5));
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        
        return veiculo;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Veiculo veiculo) {
          try {
           
            sql.setString(1, veiculo.getPlaca());
            sql.setString(2, veiculo.getTipo());
            sql.setInt(3, veiculo.getAno());
            sql.setString(4, veiculo.getObservacoes());
            
            //if(usuario.getId() > 0) 
                //sql.setInt(4,usuario.getId());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Veiculo filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getPlaca() != null) adicionarFiltro("placa", " like ");
        if(filtro.getTipo()!= null) adicionarFiltro("tipo", " like ");
        if(filtro.getAno()!= 0) adicionarFiltro("ano", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Veiculo filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getPlaca()!= null ){ sql.setString(cont, filtro.getPlaca()+"%"); cont++; }
            if(filtro.getAno()!= 0){ 
                sql.setInt(cont, filtro.getAno()); 
                cont++; 
            }
                   
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

   
    @Override
    public Veiculo Abrir(String placa) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo, placa, tipo, ano, observacao from Veiculos where codigo = ?");
            
            sql.setString(1,placa);
            
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next()){
            
                return preencheObjeto(resultado);
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
