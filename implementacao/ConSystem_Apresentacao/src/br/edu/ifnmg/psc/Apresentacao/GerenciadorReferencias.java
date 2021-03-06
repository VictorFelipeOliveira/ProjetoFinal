/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Aplicacao.CompraRepositorio;
import br.edu.ifnmg.psc.Aplicacao.EntregaRepositorio;
import br.edu.ifnmg.psc.Aplicacao.FornecedorRepositorio;
import br.edu.ifnmg.psc.Aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.psc.Aplicacao.ProdutoRepositorio;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import br.edu.ifnmg.psc.Aplicacao.VeiculoRepositorio;
import br.edu.ifnmg.psc.Aplicacao.VendaRepositorio;
import br.edu.ifnmg.psc.Persistencia.ClienteDAO;
import br.edu.ifnmg.psc.Persistencia.CompraDAO;
import br.edu.ifnmg.psc.Persistencia.EntregaDAO;
import br.edu.ifnmg.psc.Persistencia.FornecedorDAO;
import br.edu.ifnmg.psc.Persistencia.FuncionarioDAO;
import br.edu.ifnmg.psc.Persistencia.ProdutoDAO;
import br.edu.ifnmg.psc.Persistencia.UsuarioDAO;
import br.edu.ifnmg.psc.Persistencia.VeiculoDAO;
import br.edu.ifnmg.psc.Persistencia.VendaDAO;

/**
 *
 * @author victor
 */
public class GerenciadorReferencias {

    private static UsuarioRepositorio daoUsuario;
       
    public static UsuarioRepositorio getUsuario(){
        if(daoUsuario == null)
            daoUsuario = new UsuarioDAO();
        return daoUsuario;
    }
    
    private static CompraRepositorio daoCompra;
    
    public static CompraRepositorio getCompra(){
        if(daoCompra == null)
            daoCompra = new CompraDAO();
        return daoCompra;
    }
    
    private static ClienteRepositorio daoCliente;

    public static ClienteRepositorio getCliente() {
        if(daoCliente == null)
            daoCliente = new ClienteDAO();
        return daoCliente;
    }
    
    private static FornecedorRepositorio daoFornecedor;
    
    public static FornecedorRepositorio getFornecedor(){
        if(daoFornecedor == null)
            daoFornecedor = new FornecedorDAO();
        return daoFornecedor;
    }
    
    private static FuncionarioRepositorio daoFuncionario;
    
    public static FuncionarioRepositorio getFuncionario(){
        if(daoFuncionario == null)
            daoFuncionario = new FuncionarioDAO();
        return daoFuncionario;
                
    }

    private static VeiculoRepositorio daoVeiculo;
    public static VeiculoRepositorio getVeiculo() {
        if(daoVeiculo == null)
            daoVeiculo = new VeiculoDAO();
        return daoVeiculo;
    }
    
    private static ProdutoRepositorio daoProduto;
    public static ProdutoRepositorio getProduto(){
        if(daoProduto == null)
            daoProduto = new ProdutoDAO();
        return daoProduto;
    }
    
    private static VendaRepositorio daoVenda;

    public static VendaRepositorio getVenda() {
        if(daoVenda == null)
            daoVenda = new VendaDAO();
        return daoVenda;
    }
    
    private static EntregaRepositorio daoEntrega;
    
    public static EntregaRepositorio getEntrega(){
        if(daoEntrega == null)
            daoEntrega = new EntregaDAO();
        return daoEntrega;
    }
    
}
