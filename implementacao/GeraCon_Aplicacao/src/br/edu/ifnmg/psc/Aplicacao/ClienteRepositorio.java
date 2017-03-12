/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.ArrayList;

/**
 *
 * @author victor
 */
public interface ClienteRepositorio extends Repositorio<Cliente>{
    public Cliente Abrir(String cpf);
    public boolean VerificaCliente(String cpf, String rg);
    ArrayList<Cliente> listarClientes();
}
