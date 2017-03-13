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
public class ItensVenda implements Entidade {

    private int codigo;
    private int quantidade;
    private Venda venda;
    private Produto produto;


    public ItensVenda() {
        
    }

    public ItensVenda(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
   
    public ItensVenda(Venda venda, Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.venda = venda;
        this.produto = produto;
    }
    
    public ItensVenda(int codigo, int quantidade, Produto produto, Venda venda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.produto = produto;
        this.venda = venda;
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

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        int hash = 3;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + this.quantidade;
        hash = 67 * hash + Objects.hashCode(this.venda);
        hash = 67 * hash + Objects.hashCode(this.produto);
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
        final ItensVenda other = (ItensVenda) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }
}
