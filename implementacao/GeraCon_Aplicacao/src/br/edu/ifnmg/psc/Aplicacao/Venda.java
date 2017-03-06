/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author victor
 */
public class Venda implements Entidade{
    private int id;
    private Cliente cliente;
    private Date data;
    private BigDecimal valorTotal;
    private String formaPagamento;
    private Transacao transacao;
    private BigDecimal desconto;

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }
    
    private List<VendaItem> itens;

    public Venda() {
    
    }

    public Venda(int id, Cliente cliente, Date data, BigDecimal valorTotal, List<VendaItem> itens) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        itens = new ArrayList<>();
    }
    
    public void addItem(VendaItem item){
        if(!itens.contains(item)) {
            itens.add(item);
            this.valorTotal = this.valorTotal.add( 
                    item.getProduto().getPrecoUnitario().multiply(new BigDecimal( item.getQuantidade())));
        }
    }
    
    public void removeItem(VendaItem item){
        if(itens.contains(item)){
            itens.remove(item);
        this.valorTotal = this.valorTotal.subtract(
                    item.getProduto().getPrecoUnitario().multiply(new BigDecimal( item.getQuantidade())));
        }
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<VendaItem> getItens() {
        return itens;
    }

    public void setItens(List<VendaItem> itens) {
        this.itens = itens;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    
}
