/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

/**
 *
 * @author thais
 */
public class Estoque implements Entidade{
    private int codigo;
    private int estoqueMinimo;
    private int estoqueTotal;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueTotal() {
        return estoqueTotal;
    }

    public void setEstoqueTotal(int estoqueTotal) {
        this.estoqueTotal = estoqueTotal;
    }
    
    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + this.estoqueMinimo;
        hash = 47 * hash + this.estoqueTotal;
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
        final Estoque other = (Estoque) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.estoqueMinimo != other.estoqueMinimo) {
            return false;
        }
        if (this.estoqueTotal != other.estoqueTotal) {
            return false;
        }
        return true;
    }
    
    
}
