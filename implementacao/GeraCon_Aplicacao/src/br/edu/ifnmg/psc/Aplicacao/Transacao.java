/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author thais
 */
public class Transacao implements Entidade{
    
    private int codigo;
    private Date data;
    private float valorTotal;
    private Funcionario funcionario;
    private Fornecedor fornecedor;
    private List<ItemPedido> itens;

    public Transacao() {
         itens=new ArrayList<>();
    }

    public Transacao(int codigo, Date data, float valorTotal, Funcionario funcionario, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.data = data;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.fornecedor = fornecedor;
        itens=new ArrayList<>();
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
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
        hash = 41 * hash + this.codigo;
        hash = 41 * hash + Objects.hashCode(this.data);
        hash = 41 * hash + Float.floatToIntBits(this.valorTotal);
        hash = 41 * hash + Objects.hashCode(this.funcionario);
        hash = 41 * hash + Objects.hashCode(this.fornecedor);
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
        final Transacao other = (Transacao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (Float.floatToIntBits(this.valorTotal) != Float.floatToIntBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    }
    
}
