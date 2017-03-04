/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Veiculo;
import br.edu.ifnmg.psc.Aplicacao.VeiculoRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
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
        setConsultaAbrir("select codigo, placa, tipo, ano, observacoes, combustivel, marca, modelo"
                + " from Veiculos where codigo = ?");
        setConsultaApagar("delete from Veiculos where codigo = ?");
        setConsultaInserir("insert into Veiculos(placa, tipo, ano, observacoes, combustivel, marca,"
                + "modelo) values (?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Veiculos set placa = ?, tipo = ?, ano = ?, observacoes = ?, "
                + "combustivel = ?, marca = ?, modelo = ? where codigo = ?");
        setConsultaBusca("select codigo, placa, tipo, ano, observacoes, combustivel, marca, modelo"
                + " from Veiculos");
        setConsultaUltimoId("select max(codigo) from Veiculos where placa = ? and tipo = ? and ano = ?"
                + " and observacoes = ? and combustivel = ? and marca = ? and modelo = ?");
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
                veiculo.setCombustivel(resultado.getString(6));
                veiculo.setMarca(resultado.getString(7));
                veiculo.setModelo(resultado.getString(8));
        } catch (SQLException ex) {
             ex.printStackTrace();
        } catch (ErroValidacao ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            sql.setString(5, veiculo.getCombustivel());
            sql.setString(6, veiculo.getMarca());
            sql.setString(7, veiculo.getModelo());
            
            if(veiculo.getId() > 0) 
                sql.setInt(8,veiculo.getId());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void preencheFiltros(Veiculo filtro) {
        if(filtro.getId() > 0) 
            adicionarFiltro("id", "=");
        if(filtro.getPlaca() != null) 
            adicionarFiltro("placa", " like ");
        if(filtro.getTipo()!= null) 
            adicionarFiltro("tipo", " like ");
        if(filtro.getAno()!= 0) 
            adicionarFiltro("ano", " = ");
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
            PreparedStatement sql = conn.prepareStatement("select codigo, placa, tipo, ano, observacoes, combustivel, marca, modelo"
                    + " from Veiculos where placa = ?");
            
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

    @Override
    public boolean verificaVeiculo(String placa, int ano) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Veiculos where placa = ? AND ano = ?");
            sql.setString(1, placa);
            sql.setInt(2, ano);
            ResultSet resultado = sql.executeQuery();
            return resultado.next();
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return false;
    }
    
}
