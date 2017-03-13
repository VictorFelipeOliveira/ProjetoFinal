/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.Date;

/**
 *
 * @author thais
 */
public interface EntregaRepositorio extends Repositorio<Entrega> {
    public Entrega Abrir(int id); 
    public boolean verificaEntrega(int id, Date data);
    
}
