/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

/**
 *
 * @author thais
 */
public class TelaCadastroEstoque extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroEstoque
     */
    public TelaCadastroEstoque() {
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

        PanelCadastroEStoque = new javax.swing.JPanel();
        LblProduto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelLimEstoq = new javax.swing.JPanel();
        LblMinimo = new javax.swing.JLabel();
        TxtMinimo = new javax.swing.JTextField();
        LblMaximo = new javax.swing.JLabel();
        TxtMaximo = new javax.swing.JTextField();
        LblQuantidade = new javax.swing.JLabel();
        CBXProduto = new javax.swing.JComboBox();
        LblUnidadeMedia = new javax.swing.JLabel();
        CBXUnidadeMedia = new javax.swing.JComboBox();
        TxtQuantidade = new javax.swing.JTextField();
        BtnVoltar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();

        PanelCadastroEStoque.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Estoque"));

        LblProduto.setText("Produto:");

        jPanelLimEstoq.setBorder(javax.swing.BorderFactory.createTitledBorder("Limite de Estoque"));

        LblMinimo.setText("Mínimo:");

        LblMaximo.setText("Máximo:");

        javax.swing.GroupLayout jPanelLimEstoqLayout = new javax.swing.GroupLayout(jPanelLimEstoq);
        jPanelLimEstoq.setLayout(jPanelLimEstoqLayout);
        jPanelLimEstoqLayout.setHorizontalGroup(
            jPanelLimEstoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLimEstoqLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LblMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(LblMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(TxtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanelLimEstoqLayout.setVerticalGroup(
            jPanelLimEstoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLimEstoqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelLimEstoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LblQuantidade.setText("Quantidade:");

        CBXProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        LblUnidadeMedia.setText("Unidade Média:");

        CBXUnidadeMedia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));
        CBXUnidadeMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXUnidadeMediaActionPerformed(evt);
            }
        });

        TxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCadastroEStoqueLayout = new javax.swing.GroupLayout(PanelCadastroEStoque);
        PanelCadastroEStoque.setLayout(PanelCadastroEStoqueLayout);
        PanelCadastroEStoqueLayout.setHorizontalGroup(
            PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jSeparator1))
            .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                            .addComponent(LblUnidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CBXUnidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCadastroEStoqueLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelLimEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        PanelCadastroEStoqueLayout.setVerticalGroup(
            PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroEStoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCadastroEStoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblUnidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXUnidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLimEstoq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        BtnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_32.png"))); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancela.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        BtnSalvar.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelCadastroEStoque, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelCadastroEStoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnVoltar)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXUnidadeMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXUnidadeMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXUnidadeMediaActionPerformed

    private void TxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQuantidadeActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.doDefaultCloseAction();
    }//GEN-LAST:event_BtnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JComboBox CBXProduto;
    private javax.swing.JComboBox CBXUnidadeMedia;
    private javax.swing.JLabel LblMaximo;
    private javax.swing.JLabel LblMinimo;
    private javax.swing.JLabel LblProduto;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JLabel LblUnidadeMedia;
    private javax.swing.JPanel PanelCadastroEStoque;
    private javax.swing.JTextField TxtMaximo;
    private javax.swing.JTextField TxtMinimo;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JPanel jPanelLimEstoq;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
