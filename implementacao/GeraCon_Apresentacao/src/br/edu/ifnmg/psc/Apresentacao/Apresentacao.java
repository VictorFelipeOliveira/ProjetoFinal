package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Persistencia.ClienteDAO;
import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import java.util.Date;
import java.util.List;

public class Apresentacao {

    public static void main(String[] args) {
         buscar();  
    }
    
     public static void buscar() {
        Cliente filtro = new Cliente();
        
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        List<Cliente> resultadobusca = bd_cliente.Buscar(filtro);
        
        for(Cliente c : resultadobusca)
            System.out.println(c);
        
    }
    
    
    public static void atualizar() {
        Cliente c;
        
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        
        c = bd_cliente.Abrir(1);
        
        bd_cliente.Salvar(c);
        
    }
    
     public static void apagar() {
        Cliente c;
        
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        
        c = bd_cliente.Abrir(2);
        
        System.out.println(c);
        
        bd_cliente.Apagar(c);
        
    }
    
    public static void abrir() {
        Cliente c;
        
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        
        c = bd_cliente.Abrir(1);
        
        System.out.println(c);
        
    }
    
    public static void criar() {
        Cliente cliente = new Cliente();
       
        ClienteRepositorio bd_cliente = new ClienteDAO();
        bd_cliente.Salvar(cliente);
        System.out.print(cliente); 
    }
}
