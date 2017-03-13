/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Persistencia;

import br.edu.ifnmg.psc.Aplicacao.Entrega;
import br.edu.ifnmg.psc.Aplicacao.EntregaRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author victor
 */
public class EntregaDAO extends DAOGenerico<Entrega> implements EntregaRepositorio{

    VendaDAO venda;
    FuncionarioDAO funcionario;
    VeiculoDAO veiculo;
    
     public EntregaDAO(){
        setConsultaAbrir("select codigo, data, fk_vendas, fk_veiculos, fk_funcionarios, rua, numero, cidade"
                + "complemento from Entregas where codigo = ?");
        setConsultaApagar("DELETE from Entregas where codigo = ?");
        setConsultaInserir("insert into Entregas (data, fk_vendas, fk_veiculos, fk_funcionarios, rua, numero, cidade, complemento)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?)");
        setConsultaAlterar("update Entregas set data = ?, fk_vendas = ?, fk_veiculos = ?, fk_funcionarios = ?, "
                + "rua = ?, numero = ?, cidade = ?, complemento = ? where codigo = ?");
        setConsultaBusca("select codigo, data, fk_vendas, fk_veiculos, fk_funcionarios, rua, numero, cidade, complemento from Entregas");
        setConsultaUltimoId("select max(codigo) from Entregas where data = ? and fk_vendas = ? and fk_veiculos = ? and "
                + "fk_funcionarios = ? and rua = ? and numero = ? and cidade = ? and complemento = ?");
        venda = new VendaDAO();
        funcionario = new FuncionarioDAO();
        veiculo = new VeiculoDAO();
    }

    @Override
    protected Entrega preencheObjeto(ResultSet resultado) {
        Entrega entrega = new Entrega();
        
       try{
            entrega.setId(resultado.getInt(1));
            entrega.setData(resultado.getDate(2));
            entrega.setVenda(venda.Abrir(resultado.getInt(3)));
            entrega.setVeiculo(veiculo.Abrir(resultado.getString(4)));
            entrega.setFuncionario(funcionario.Abrir(resultado.getString(5)));
            entrega.setRua(resultado.getString(6));
            entrega.setNumero(resultado.getInt(7));
            entrega.setCidade(resultado.getString(8));
                   
        }catch(SQLException ex){
           System.out.println(ex);
       }

       return entrega;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Entrega entrega) {
     try{
            sql.setDate(1, (Date) entrega.getData());
            sql.setInt(2, entrega.getVenda().getId());
            sql.setString(3, entrega.getVeiculo().getPlaca());
            sql.setInt(4, entrega.getFuncionario().getId());
            sql.setString(5, entrega.getRua());
            sql.setInt(6, entrega.getNumero());
            sql.setString(7, entrega.getCidade());
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }}

    @Override
    protected void preencheFiltros(Entrega filtro) {
        if(filtro.getId() > 0) 
            adicionarFiltro("id", "=");
        if(filtro.getVenda().getId()!= 0) 
            adicionarFiltro("fk_vendas", "=");
        if(filtro.getFuncionario().getId()!= 0) 
            adicionarFiltro("fk_funcionarios", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Entrega filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){
                sql.setInt(cont, filtro.getId());
                cont++; 
            }
            
            if(filtro.getVenda().getId()!= 0 ){
                sql.setInt(cont, filtro.getVenda().getId());
                cont++; 
            }
            
            if(filtro.getFuncionario().getId()!= 0){ 
                sql.setInt(cont, filtro.getFuncionario().getId()); 
                cont++; 
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Entrega Abrir(int id) {
        try {
            
            PreparedStatement sql = conn.prepareStatement("select codigo, data, fk_vendas, fk_veiculos, fk_funcionarios, rua, numero, cidade"
                + "complemento from Entregas where codigo = ?");
            
            sql.setInt(1,id );
            
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
    public boolean verificaEntrega(int id, java.util.Date data) {
        try {
            PreparedStatement sql = conn.prepareStatement("select codigo from Entregas where data = ? and codigo = ?");
            sql.setDate(1, (Date) data);
            sql.setInt(2, id);
            ResultSet resultado = sql.executeQuery();
            return resultado.next();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return false;
    }
    
}
