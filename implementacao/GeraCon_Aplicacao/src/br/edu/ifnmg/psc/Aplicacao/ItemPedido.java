/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.Objects;

/**
 *
 * @author thais
 */
public class ItemPedido implements Entidade {

    private int codigo;
    private int quantidade;
    private Produto produto;
    private Transacao transacao;

    public ItemPedido() {
        
    }

    public ItemPedido(int codigo, int quantidade, Produto produto, Transacao transacao) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.produto = produto;
        this.transacao = transacao;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }
    
    @Override
    public int getId() {
        return codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo=codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        hash = 53 * hash + this.quantidade;
        hash = 53 * hash + Objects.hashCode(this.produto);
        hash = 53 * hash + Objects.hashCode(this.transacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemPedido other = (ItemPedido) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.transacao, other.transacao)) {
            return false;
        }
        return true;
    }
    
    
}
