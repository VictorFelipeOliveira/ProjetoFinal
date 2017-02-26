/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Usuario;
import br.edu.ifnmg.psc.Aplicacao.UsuarioRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author thais
 */
public class TelaLogin extends javax.swing.JFrame {

    UsuarioRepositorio dao = GerenciadorReferencias.getUsuario();
    Usuario novo = new Usuario();
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(260, 170, 110, 50);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(150, 170, 100, 50);

        lblLogin.setText("Login:");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(100, 100, 49, 17);

        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(100, 130, 47, 17);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(150, 100, 220, 27);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(150, 130, 220, 27);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telaLogin.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 470, 300);

        setSize(new java.awt.Dimension(475, 331));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       this.extrairCampos();
       
       if(dao.VerificaLogin(novo.getLogin(), novo.getSenha())){
            JOptionPane.showMessageDialog(rootPane,"Usuário: "+novo.getLogin()+""
                    + " logado com sucesso");
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
            this.dispose();
        }else JOptionPane.showMessageDialog(this,"O Usuário ou senha incorretos\nInforme os campos novamente");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    
    private void extrairCampos() {
       String login = txtLogin.getText().trim();
       String senha = new String( txtSenha.getPassword());
        
        if( !login.equals("")){
            novo.setLogin(login);
        }
      
        if( !senha.equals("")){
             novo.setSenha(senha);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    
}
