/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Compra;
import br.edu.ifnmg.psc.Aplicacao.CompraRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import java.awt.BorderLayout;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victor
 */
public class GerenciarCompras extends javax.swing.JInternalFrame {

    CompraRepositorio dao = GerenciadorReferencias.getCompra();
    TelaEfetuarCompras telaCompras;
    int idTabela;
    /**
     * Creates new form GerenciarCompras
     */
    public GerenciarCompras() {
        initComponents();
        List<Compra> busca = dao.Buscar(null);
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

        PanelGerencCompras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaCompras = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        BtnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        PanelFuncionalidades = new javax.swing.JPanel();
        BtnNovaCompras = new javax.swing.JButton();
        BtnAlterar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        PanelGerencCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de Vendas"));

        tblListaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListaCompras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblListaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaCompras);

        javax.swing.GroupLayout PanelGerencComprasLayout = new javax.swing.GroupLayout(PanelGerencCompras);
        PanelGerencCompras.setLayout(PanelGerencComprasLayout);
        PanelGerencComprasLayout.setHorizontalGroup(
            PanelGerencComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(PanelGerencComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerencComprasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        PanelGerencComprasLayout.setVerticalGroup(
            PanelGerencComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
            .addGroup(PanelGerencComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerencComprasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar_2.png"))); // NOI18N
        BtnBuscar.setText("Pesquisar");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar)
                .addContainerGap())
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBuscar)
                .addContainerGap())
        );

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        BtnNovaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        BtnNovaCompras.setText("Novo");
        BtnNovaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovaComprasActionPerformed(evt);
            }
        });

        BtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        BtnAlterar.setText("Editar");
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnNovaCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BtnNovaCompras)
                .addGap(18, 18, 18)
                .addComponent(BtnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(PanelGerencCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelGerencCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelGerencCompras.getAccessibleContext().setAccessibleName("Gerenciamento de Compras");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaComprasMouseClicked
        int selecionada = tblListaCompras.getSelectedRow();
        idTabela = Integer.parseInt( tblListaCompras.getModel().getValueAt(selecionada, 0).toString() );
    }//GEN-LAST:event_tblListaComprasMouseClicked

    private void BtnNovaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovaComprasActionPerformed
        this.doDefaultCloseAction();
        abreFrame(new TelaEfetuarCompras());
    }//GEN-LAST:event_BtnNovaComprasActionPerformed

    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        try {
            this.doDefaultCloseAction();
            editarCompra(idTabela);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaPrincipal.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnNovaCompras;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JPanel PanelGerencCompras;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaCompras;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela(List<Compra> lista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Data");
        modelo.addColumn("Fornecedor");
              
        for(Compra v : lista){
            Vector linha = new Vector();
            linha.add(v.getId());
            linha.add(v.getData());
            linha.add(v.getItens());
            modelo.addRow(linha);
        }
        
        tblListaCompras.setModel(modelo);
    }
    
    public void buscar(String cpf) throws ParseException{
        Compra filtro = new Compra();
        
        List<Compra> busca = dao.Buscar(filtro);
        
        preencheTabela(busca);
        
    }
    
    private void editarCompra(int id) throws ParseException {
        Compra entidade;
        if(id == 0)
            entidade = new Compra();
        else
            entidade = dao.Abrir(id);
        
        telaCompras = new TelaEfetuarCompras();
        
        telaCompras.setEntidade(entidade);
        
        telaCompras.setListagem(this);
        abreFrame(telaCompras);
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
