/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thais
 */
public class TelaGerenciarClientes extends javax.swing.JInternalFrame{
    /**
     * Creates new form TelaGerenciarClientes
     */
    ClienteRepositorio dao = GerenciadorReferencias.getCliente();
    TelaCadastroClientes telaClientes;
    
    public TelaGerenciarClientes(){
        initComponents();
        
        List<Cliente> busca = dao.Buscar(null);
        
        preencheTabela(busca);
        
        //PrincipalDesktop.DesktopPrincipal.setVisible(false);
        
    }
    
     private void preencheTabela(List<Cliente> lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Data de Nascimento");
        
        for(Cliente c : lista){
            Vector linha = new Vector();
            linha.add(c.getNome());
            linha.add(c.getTelefone());
            linha.add(c.getEmail());
            linha.add(c.getCpf());
            linha.add(c.getRg());
            linha.add(c.getDataNascimento());
            modelo.addRow(linha);
        }
        
        tblClientes.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void buscar(String nome){
        Cliente filtro = new Cliente(0, nome, null, null);
        
        List<Cliente> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelClientesCadastrados = new javax.swing.JPanel();
        scrollPaneClientesCadastrados = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        PanelFuncionalidades = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setVisible(true);

        PanelClientesCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes cadastrados"));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        scrollPaneClientesCadastrados.add(jScrollPane1);

        javax.swing.GroupLayout PanelClientesCadastradosLayout = new javax.swing.GroupLayout(PanelClientesCadastrados);
        PanelClientesCadastrados.setLayout(PanelClientesCadastradosLayout);
        PanelClientesCadastradosLayout.setHorizontalGroup(
            PanelClientesCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneClientesCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
        );
        PanelClientesCadastradosLayout.setVerticalGroup(
            PanelClientesCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClientesCadastradosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollPaneClientesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBusca.setName(""); // NOI18N

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtBusca.getAccessibleContext().setAccessibleDescription("");

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnExcluir.setText("Excluir");

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelFuncionalidadesLayout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelClientesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelClientesCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaPrincipal.PainelInternoPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        this.doDefaultCloseAction();
        TelaCadastroClientes telaClientes = new TelaCadastroClientes();
        telaClientes.setVisible(true);
        TelaPrincipal.DesktopPrincipal.add(telaClientes);
        try {
            telaClientes.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaGerenciarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        TelaPrincipal.DesktopPrincipal.setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        try {
            int selecionada = tblClientes.getSelectedRow();
            int id = Integer.parseInt( tblClientes.getModel().getValueAt(selecionada, 0).toString() );
            editarCliente(id);
        } catch (ParseException ex) {
            Logger.getLogger(TelaGerenciarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tblClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelClientesCadastrados;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPaneClientesCadastrados;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

    private void editarCliente(int id) throws ParseException {
        Cliente entidade;
        if(id == 0)
            entidade = new Cliente(0, "", "000.000.000-00", null);
        else
            entidade = dao.Abrir(id);
        
        telaClientes = new TelaCadastroClientes();
        
        telaClientes.setEntidade(entidade);
        
        telaClientes.setListagem(this);
        
        this.getParent().add(telaClientes);
        telaClientes.setVisible(true);
        this.setVisible(false);
    }
}
