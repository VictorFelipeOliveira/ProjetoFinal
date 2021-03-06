/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author thais
 */
public interface ProdutoRepositorio extends Repositorio<Produto> {
     public Produto Abrir(String nome);
     public boolean verificaProduto(String nome, BigDecimal preco);
     ArrayList<Fornecedor> listarFornecedores();
     public int BuscaProduto(String nome);
     public ArrayList<Produto> listarProdutos();
}
