/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.math.BigDecimal;

/**
 *
 * @author thais
 */
public class Produto implements Entidade{
    Fornecedor fornecedor = new Fornecedor();
    private int codigo;
    private String nome;
    private String categoria;
    private String descricao;
    private BigDecimal precoUnitario;
    private int quantidade;
   // private String unidadeMedida;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto() {
        this.codigo = 0;
    }

    public Produto(int codigo, String nome, String categoria, String descricao, BigDecimal precoUnitario, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @Override
    public int getId() {
        return  codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo = id;
    }
    
}
