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
public class TelaEfetuarCompras extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaGerenciamentoCompras
     */
    public TelaEfetuarCompras() {
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

        PanelCarrGerenComp = new javax.swing.JPanel();
        PanelDadosCompra = new javax.swing.JPanel();
        LblForncedor = new javax.swing.JLabel();
        CBXFornecedor = new javax.swing.JComboBox();
        LblData = new javax.swing.JLabel();
        Txtdata = new javax.swing.JFormattedTextField();
        PanelCompras = new javax.swing.JPanel();
        LblProdutos = new javax.swing.JLabel();
        LblQuantidade = new javax.swing.JLabel();
        CBXProduto = new javax.swing.JComboBox();
        SpinnerQuantidade = new javax.swing.JSpinner();
        BtnAdicionar = new javax.swing.JButton();
        BtnEncaminhar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setTitle("Efetuar Compras");

        PanelCarrGerenComp.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho de compras"));

        javax.swing.GroupLayout PanelCarrGerenCompLayout = new javax.swing.GroupLayout(PanelCarrGerenComp);
        PanelCarrGerenComp.setLayout(PanelCarrGerenCompLayout);
        PanelCarrGerenCompLayout.setHorizontalGroup(
            PanelCarrGerenCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        PanelCarrGerenCompLayout.setVerticalGroup(
            PanelCarrGerenCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelDadosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da compra"));

        LblForncedor.setText("Fornecedor:");

        CBXFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));
        CBXFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXFornecedorActionPerformed(evt);
            }
        });

        LblData.setText("Data:");

        Txtdata.setText("       /  /");

        javax.swing.GroupLayout PanelDadosCompraLayout = new javax.swing.GroupLayout(PanelDadosCompra);
        PanelDadosCompra.setLayout(PanelDadosCompraLayout);
        PanelDadosCompraLayout.setHorizontalGroup(
            PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblForncedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        PanelDadosCompraLayout.setVerticalGroup(
            PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDadosCompraLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblData, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblForncedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBXFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        PanelCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Efetuar Compras"));

        LblProdutos.setText("Produto:");

        LblQuantidade.setText("Quantidade:");

        CBXProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        BtnAdicionar.setText("Adicionar");

        javax.swing.GroupLayout PanelComprasLayout = new javax.swing.GroupLayout(PanelCompras);
        PanelCompras.setLayout(PanelComprasLayout);
        PanelComprasLayout.setHorizontalGroup(
            PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelComprasLayout.createSequentialGroup()
                            .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SpinnerQuantidade))
                        .addComponent(LblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelComprasLayout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelComprasLayout.setVerticalGroup(
            PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelComprasLayout.createSequentialGroup()
                .addGroup(PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelComprasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CBXProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelComprasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BtnAdicionar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        BtnEncaminhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        BtnEncaminhar.setText("Salvar");

        BtnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_32.png"))); // NOI18N
        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancela.png"))); // NOI18N
        BtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEncaminhar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelDadosCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelCarrGerenComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(PanelDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelCarrGerenComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnEncaminhar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXFornecedorActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaPrincipal.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_BtnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEncaminhar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JComboBox CBXFornecedor;
    private javax.swing.JComboBox CBXProduto;
    private javax.swing.JLabel LblData;
    private javax.swing.JLabel LblForncedor;
    private javax.swing.JLabel LblProdutos;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JPanel PanelCarrGerenComp;
    private javax.swing.JPanel PanelCompras;
    private javax.swing.JPanel PanelDadosCompra;
    private javax.swing.JSpinner SpinnerQuantidade;
    private javax.swing.JFormattedTextField Txtdata;
    // End of variables declaration//GEN-END:variables
}
