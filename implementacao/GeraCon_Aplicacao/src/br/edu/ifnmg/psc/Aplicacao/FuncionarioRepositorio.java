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
 
    public interface FuncionarioRepositorio extends Repositorio<Funcionario>{
        public Funcionario Abrir(String cpf);
        public boolean VerificaFuncionario(String cpf, String rg);
    }
    

