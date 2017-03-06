/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Transacao;
import br.edu.ifnmg.psc.Aplicacao.TransacaoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author victor
 */
public class TransacaoDAO extends DAOGenerico <Transacao> implements TransacaoRepositorio{

    public TransacaoDAO(){
        setConsultaAbrir("select codigo, data, fk_funcionarios from Transacoes where codigo = ?");
        
        setConsultaApagar("DELETE from Transacoes where codigo = ?");
        
        setConsultaInserir("INSERT INTO Transacoes (data, fk_funcionarios) values (?, ?)");
        
        setConsultaAlterar("UPDATE Transacoes SET data = ?, fk_funcionarios = ? where codigo = ?");
        
        setConsultaBusca("select codigo, data, fk_funcionarios from Transacoes");
        
        setConsultaUltimoId("select max(codigo) from Transacoes where codigo = ? and data = ? and fk_funcionarios = ?");
    }
    
    @Override
    protected Transacao preencheObjeto(ResultSet resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Transacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(Transacao filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Transacao filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transacao Abrir(int codigo) {
        try {
            
            PreparedStatement sql = conn.prepareStatement("select codigo, data, fk_funcionarios from Transacoes where codigo = ?");
            
            sql.setInt(1, codigo);
            
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
