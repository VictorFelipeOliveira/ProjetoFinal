/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Cliente;
import br.edu.ifnmg.psc.Aplicacao.ClienteRepositorio;
import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
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
    int idTabela;
    
    public TelaGerenciarClientes() throws ParseException{
        initComponents();
        
        List<Cliente> busca = dao.Buscar(null);
        preencheTabela(busca);
    }
    
    private void preencheTabela(List<Cliente> lista) throws ParseException{
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Data de Nascimento");
        
        for(Cliente c : lista){
            Vector linha = new Vector();
            linha.add(c.getId());
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

    public void buscar(String cpf) throws ParseException{
        Cliente filtro = new Cliente(0,cpf,null,null,null);
        
        List<Cliente> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelClientesCadastrados = new javax.swing.JPanel();
        scrollPaneClientesCadastrados = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        PanelFuncionalidades = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setTitle("Gerenciar Clientes");
        setVisible(true);

        PanelClientesCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes cadastrados"));

        tblClientes.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
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
                .addComponent(scrollPaneClientesCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE))
        );
        PanelClientesCadastradosLayout.setVerticalGroup(
            PanelClientesCadastradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelClientesCadastradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneClientesCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        txtBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBusca.setName(""); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar_user_32.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtBusca.getAccessibleContext().setAccessibleDescription("");

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_user_32.png"))); // NOI18N
        btnNovoCliente.setText("Novo");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_usuario.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFuncionalidadesLayout.createSequentialGroup()
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_32.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelClientesCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaPrincipal.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        this.doDefaultCloseAction();
        abreFrame(new TelaCadastroClientes());
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int selecionada = tblClientes.getSelectedRow();
        idTabela = Integer.parseInt( tblClientes.getModel().getValueAt(selecionada, 0).toString() );
        System.out.println("ID selecionado: "+idTabela);
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            buscar(txtBusca.getText() );
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            this.doDefaultCloseAction();
            
            editarCliente(idTabela);
        } catch (ParseException ex) {
            ex.printStackTrace();   
        }
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelClientesCadastrados;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
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
            entidade = new Cliente(0, null,null, null,null);
        else
            entidade = dao.Abrir(id);
        
        telaClientes = new TelaCadastroClientes();
        
        telaClientes.setEntidade(entidade);
        
        telaClientes.setListagem(this);
        abreFrame(telaClientes);
    }
    
    public void abreFrame(JInternalFrame frame){
        frame.setVisible(true);
        TelaPrincipal.DesktopPrincipal.add(frame, BorderLayout.CENTER);
        try {
            frame.setSelected(true);
            frame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        TelaPrincipal.DesktopPrincipal.setVisible(true);
        frame.setSize(TelaPrincipal.DesktopPrincipal.getSize());
    }
}
