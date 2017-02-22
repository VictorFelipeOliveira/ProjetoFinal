package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Persistencia.ClienteDAO;
import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Aplicacao.Usuario;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import br.edu.ifnmg.psc.Persistencia.UsuarioDAO;
import javax.swing.JOptionPane;

public class Apresentacao {

    public static void main(String[] args) {
      criar();
    }
    
     public static void criar() {
        Cliente cliente = new Cliente();
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        cliente.setNome("Victor");
        cliente.setEmail("victorfelipe1608@gmail.com");
        cliente.setCpf("12686566663");
        cliente.setRg("MG-19.024.107");
        cliente.setDescricao("Filho de Armando");
        cliente.setTelefone("38998570754");
        cliente.setBairro("São Lucas");
        cliente.setCidade("São Francisco");
        cliente.setRua("AV. Oscar Caetano");
        cliente.setNumero(2917);
        cliente.setComplemento("nenhum");
        
        if(bd_cliente.Salvar(cliente))
         JOptionPane.showMessageDialog(null,"Cliente: "+cliente.getNome()+" cadastrado"
                 + " com sucesso!!! ");
        else System.out.println("Nao salvo");
    }
    
    public static void buscar() {
        Usuario filtro = new Usuario();
        UsuarioRepositorio bd_usuario = new UsuarioDAO();
        
       // List<Usuario> resultadobusca = bd_usuario.Buscar(filtro);
        
   //     for(Usuario usuario : resultadobusca)
   //         System.out.println(usuario);
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
}
