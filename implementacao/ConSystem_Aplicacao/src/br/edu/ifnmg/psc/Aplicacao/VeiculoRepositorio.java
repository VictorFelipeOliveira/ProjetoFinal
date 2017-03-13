/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.ArrayList;

/**
 *
 * @author thais
 */
public interface VeiculoRepositorio extends Repositorio<Veiculo> {
    public Veiculo Abrir(String placa);
    public boolean verificaVeiculo(String placa,int ano);
    public ArrayList<Veiculo> listarVeiculos();
    
}
