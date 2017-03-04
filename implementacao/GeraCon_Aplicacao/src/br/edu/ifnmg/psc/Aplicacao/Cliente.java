/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author victor
 */
public class Cliente extends Pessoa implements Entidade{
    private int codigo;
    private String cpf;
    private String rg;
    private String sexo;
    private Date dataNascimento;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cliente() {
        this.codigo=0;
    }

    public Cliente(int codigo, String cpf, String rg, String sexo) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    @Override
    public int getId() {
        return codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo=id;
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ErroValidacao {
        if(cpf.length() > 14)
            throw new ErroValidacao("O atributo cpf deve ter no máximo 14 caracteres!");
        this.cpf = cpf.replace("-", "").replace(".", "");
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws ErroValidacao {
        if(rg.length()>13)
            throw new ErroValidacao("O atributo rg deve ter no máximo 10 caracteres!");
        this.rg = rg.replace("-","").replace(".","");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + Objects.hashCode(this.cpf);
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
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + '}';
    } 
}
