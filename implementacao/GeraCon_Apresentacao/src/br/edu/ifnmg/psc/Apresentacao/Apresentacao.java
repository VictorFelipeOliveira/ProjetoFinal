package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Persistencia.ClienteDAO;
import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import br.edu.ifnmg.psc.Aplicacao.Funcionario;
import br.edu.ifnmg.psc.Aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.psc.Aplicacao.Usuario;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import br.edu.ifnmg.psc.Persistencia.FuncionarioDAO;
import br.edu.ifnmg.psc.Persistencia.UsuarioDAO;
import javax.swing.JOptionPane;

public class Apresentacao {

    public static void main(String[] args) {
      criarFuncionario();
    }
    
     public static void criarCliente() {
        Cliente cliente = new Cliente();
        ClienteRepositorio bd_cliente = new ClienteDAO();
        
        cliente.setNome("Victor");
        cliente.setEmail("victorfelipe1608@gmail.com");
        cliente.setCpf("12686566663");
        cliente.setRg("MG19024107");
        cliente.setDescricao("Filho de Armando");
        cliente.setTelefone("38998570754");
        cliente.setBairro("São Lucas");
        cliente.setCidade("São Francisco");
        cliente.setRua("Oscar Caetano");
        cliente.setNumero(2917);
        cliente.setComplemento("nenhum");
        System.out.println(bd_cliente.Salvar(cliente));
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

    private static void criarFuncionario() {
        Funcionario funcionario = new Funcionario();
        FuncionarioRepositorio bd_Funcionario = new FuncionarioDAO();
        
        funcionario.setNome("Felipe");
        funcionario.setTelefone("38991892729");
        funcionario.setBairro("São Lucas");
        funcionario.setCidade("Januária");
        funcionario.setComplemento("A");
        funcionario.setEmail("felipe.tads@gmail.com");
        funcionario.setRua("Rua 10");
        funcionario.setNumero(285);
        funcionario.setCargo("Gerente");
        funcionario.setCarteiraTrabalho("123123123");
        funcionario.setCpf("11111111111");
        
        if(bd_Funcionario.Salvar(funcionario)){
             JOptionPane.showMessageDialog(null,"Funcionário: "+funcionario.getNome()+" cadastrado"
                 + " com sucesso!!! ");
        }
        else System.out.println("Nao salvo");
        
    }
}
