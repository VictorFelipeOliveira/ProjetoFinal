/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Excecao;

/**
 *
 * @author victor
 */
public class ErroValidacao extends Exception{
    
    public ErroValidacao(String message) {
        super(message);
    }
    
}
