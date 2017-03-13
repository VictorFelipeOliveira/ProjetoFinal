/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.Objects;

/**
 *
 * @author victor
 */
public class ItensCompra implements Entidade{
    private int codigo;
    private int quantidade;
    private Compra compra;
    private Produto produto;

    public ItensCompra() {
    }

    public ItensCompra(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    public ItensCompra(int codigo, int quantidade, Compra compra, Produto produto) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.compra = compra;
        this.produto = produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public int getId() {
        return codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo = id;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codigo;
        hash = 71 * hash + this.quantidade;
        hash = 71 * hash + Objects.hashCode(this.compra);
        hash = 71 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItensCompra other = (ItensCompra) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.compra, other.compra)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

}
