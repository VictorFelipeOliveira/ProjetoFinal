package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Persistencia.ClienteDAO;
import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Aplicacao.Usuario;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import br.edu.ifnmg.psc.Persistencia.UsuarioDAO;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Apresentacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Cadastrar\n2 - Apagar\n3 - Atualizar\n4 - Buscar\n");
        System.out.println("Informe a opção desejada: ");
        int opcao = entrada.nextInt();
        switch(opcao){
            case 1: criar();
                    break;
            case 2: apagar();
                    break;
            case 3: atualizar();
                    break;
            case 4: buscar();
                    break;
            default: return;
        }
    }
    
    public static void buscar() {
        Usuario filtro = new Usuario();
        UsuarioRepositorio bd_usuario = new UsuarioDAO();
        
        List<Usuario> resultadobusca = bd_usuario.Buscar(filtro);
        
        for(Usuario usuario : resultadobusca)
            System.out.println(usuario);
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
        Usuario usuario = new Usuario();
       
        UsuarioRepositorio bd_usuario = new UsuarioDAO();
        bd_usuario.Salvar(usuario);
        System.out.print(usuario); 
    }
}
