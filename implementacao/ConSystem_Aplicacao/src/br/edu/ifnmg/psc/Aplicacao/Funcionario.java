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
 * @author thais
 */
public class Funcionario  extends Pessoa implements Entidade {
    private int codigo;
    private String carteiraTrabalho;
    private String cargo;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String sexo;
    private String habilitacao;

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public Funcionario(int codigo, String carteiraTrabalho, String cargo, String cpf, String rg, Date dataNascimento, String sexo) {
        this.codigo = codigo;
        this.carteiraTrabalho = carteiraTrabalho;
        this.cargo = cargo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws ErroValidacao {
        if(rg.length()>13)
            throw new ErroValidacao("O atributo rg deve ter no máximo 10 caracteres!");
        this.rg = rg.replace("-","").replace(".","");
    }
    
    public Funcionario(){
        this.codigo = 0;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws ErroValidacao {
        if(cpf.length() > 14)
            throw new ErroValidacao("O atributo cpf deve ter no máximo 14 caracteres!");
        this.cpf = cpf.replace("-", "").replace(".", "");
    }
    
    @Override
    public int getId() {
        return this.codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.carteiraTrabalho);
        hash = 53 * hash + Objects.hashCode(this.cargo);
        hash = 53 * hash + Objects.hashCode(this.cpf);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.carteiraTrabalho, other.carteiraTrabalho)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
}
