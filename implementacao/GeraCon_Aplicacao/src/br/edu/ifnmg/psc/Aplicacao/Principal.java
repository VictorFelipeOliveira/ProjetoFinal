/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Aplicacao;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Principal {
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      Cliente cliente = new Cliente();
      cliente.setId(0);
      cliente.setCpf(input.nextLine());
      System.out.println(cliente.toString());
  }  
}
