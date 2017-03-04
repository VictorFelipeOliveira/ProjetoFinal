/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.util.Objects;

/**
 *
 * @author thais
 */
public class Fornecedor extends Pessoa implements Entidade{

    private String cnpj;
    private int codigo;

    
    public Fornecedor(){
    
    } 
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws ErroValidacao {
        if(cnpj.length()>18)
            throw new ErroValidacao("O atributo CNPJ deve ter no máximo 10 caracteres!");
        this.cnpj = cnpj.replace(".","").replace("/","").replace("-","");
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
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cnpj);
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
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }    
}
