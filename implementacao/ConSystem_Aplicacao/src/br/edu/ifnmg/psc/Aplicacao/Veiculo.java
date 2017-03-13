/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import br.edu.ifnmg.psc.Excecao.ErroValidacao;

/**
 *
 * @author thais
 */
public class Veiculo implements Entidade {

    private int codigo;
    private String placa;
    private String tipo;
    private int ano;
    private String observacoes;
    private String combustivel;
    private String marca;
    private String modelo;

    public Veiculo(int codigo, String placa, String tipo, int ano, String observacoes, String combustivel, String marca, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.tipo = tipo;
        this.ano = ano;
        this.observacoes = observacoes;
        this.combustivel = combustivel;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Veiculo() {
        this.codigo = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws ErroValidacao {
        if(placa.length()>8)
            throw new ErroValidacao("O atributo 'Placa' deve ter no máximo 10 caracteres!");
        this.placa = placa.replace("-","");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    @Override
    public int getId() {
        return codigo;
    }

    @Override
    public void setId(int id) {
        this.codigo = id;
    }
    
}
