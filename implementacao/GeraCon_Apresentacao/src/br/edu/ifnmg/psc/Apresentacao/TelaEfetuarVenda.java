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
public class TelaEfetuarVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEfetuarVenda
     */
    public TelaEfetuarVenda() {
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

        jPanelEfeVend = new javax.swing.JPanel();
        jProdVend = new javax.swing.JLabel();
        jQuantVend = new javax.swing.JLabel();
        jCBProdVend = new javax.swing.JComboBox();
        jSpinQuantVend = new javax.swing.JSpinner();
        jBtnAddGeren1 = new javax.swing.JButton();
        jPanelDadosVend = new javax.swing.JPanel();
        jFormPagVen = new javax.swing.JLabel();
        jCBFormPag = new javax.swing.JComboBox();
        jDatGerenc = new javax.swing.JLabel();
        jTextFielddat = new javax.swing.JFormattedTextField();
        jClienVend = new javax.swing.JLabel();
        jCBClienVend = new javax.swing.JComboBox();
        jPanelCarrEfVend = new javax.swing.JPanel();
        jDescVend = new javax.swing.JLabel();
        jTxtDesc = new javax.swing.JTextField();
        jValTotal = new javax.swing.JLabel();
        jTxtValorTot = new javax.swing.JTextField();
        jBtnVolt = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jBtnFinal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jGerenc = new javax.swing.JMenu();
        jFunc = new javax.swing.JMenuItem();
        jClient = new javax.swing.JMenuItem();
        jVend = new javax.swing.JMenuItem();
        jProd = new javax.swing.JMenuItem();
        jComp = new javax.swing.JMenuItem();
        jEstoq = new javax.swing.JMenuItem();
        jEntr = new javax.swing.JMenuItem();
        jVeic = new javax.swing.JMenuItem();
        jRelat = new javax.swing.JMenu();

        jPanelEfeVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Efetuar Venda"));

        jProdVend.setText("Produto:");

        jQuantVend.setText("Quantidade:");

        jCBProdVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        jBtnAddGeren1.setText("Adicionar");

        javax.swing.GroupLayout jPanelEfeVendLayout = new javax.swing.GroupLayout(jPanelEfeVend);
        jPanelEfeVend.setLayout(jPanelEfeVendLayout);
        jPanelEfeVendLayout.setHorizontalGroup(
            jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnAddGeren1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                            .addComponent(jQuantVend, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinQuantVend))
                        .addComponent(jProdVend, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(jCBProdVend, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEfeVendLayout.setVerticalGroup(
            jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCBProdVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEfeVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jQuantVend, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinQuantVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEfeVendLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProdVend, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jBtnAddGeren1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDadosVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da venda"));

        jFormPagVen.setText("Forma de pagamento:");

        jCBFormPag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));
        jCBFormPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBFormPagActionPerformed(evt);
            }
        });

        jDatGerenc.setText("Data:");

        jTextFielddat.setText("       /  /");

        jClienVend.setText("Cliente:");

        jCBClienVend.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelDadosVendLayout = new javax.swing.GroupLayout(jPanelDadosVend);
        jPanelDadosVend.setLayout(jPanelDadosVendLayout);
        jPanelDadosVendLayout.setHorizontalGroup(
            jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                        .addComponent(jClienVend, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                        .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                                .addComponent(jDatGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))
                            .addComponent(jFormPagVen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFielddat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBClienVend, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBFormPag, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanelDadosVendLayout.setVerticalGroup(
            jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosVendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDatGerenc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormPagVen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBFormPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClienVend, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBClienVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelCarrEfVend.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinho de compras"));

        javax.swing.GroupLayout jPanelCarrEfVendLayout = new javax.swing.GroupLayout(jPanelCarrEfVend);
        jPanelCarrEfVend.setLayout(jPanelCarrEfVendLayout);
        jPanelCarrEfVendLayout.setHorizontalGroup(
            jPanelCarrEfVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanelCarrEfVendLayout.setVerticalGroup(
            jPanelCarrEfVendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jDescVend.setText("Desconto(%):");

        jValTotal.setText("Valor Total:");

        jBtnVolt.setText("Voltar");

        jBtnCancel.setText("Cancelar");

        jBtnFinal.setText("Finalizar Venda");

        jGerenc.setText("Gerenciar");

        jFunc.setText("Funcionários");
        jGerenc.add(jFunc);

        jClient.setText("Clientes");
        jGerenc.add(jClient);

        jVend.setText("Vendas");
        jGerenc.add(jVend);

        jProd.setText("Produtos");
        jGerenc.add(jProd);

        jComp.setText("Compras");
        jGerenc.add(jComp);

        jEstoq.setText("Estoque");
        jGerenc.add(jEstoq);

        jEntr.setText("Entregas");
        jGerenc.add(jEntr);

        jVeic.setText("Veículos");
        jGerenc.add(jVeic);

        jMenuBar1.add(jGerenc);

        jRelat.setText("Relatórios");
        jMenuBar1.add(jRelat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelDadosVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelEfeVend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelCarrEfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDescVend, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnFinal)
                                    .addComponent(jTxtValorTot, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jBtnVolt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCarrEfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDescVend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtValorTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelEfeVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanelDadosVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBtnVolt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnFinal)
                            .addComponent(jBtnCancel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBFormPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBFormPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBFormPagActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddGeren1;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnFinal;
    private javax.swing.JButton jBtnVolt;
    private javax.swing.JComboBox jCBClienVend;
    private javax.swing.JComboBox jCBFormPag;
    private javax.swing.JComboBox jCBProdVend;
    private javax.swing.JLabel jClienVend;
    private javax.swing.JMenuItem jClient;
    private javax.swing.JMenuItem jComp;
    private javax.swing.JLabel jDatGerenc;
    private javax.swing.JLabel jDescVend;
    private javax.swing.JMenuItem jEntr;
    private javax.swing.JMenuItem jEstoq;
    private javax.swing.JLabel jFormPagVen;
    private javax.swing.JMenuItem jFunc;
    private javax.swing.JMenu jGerenc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCarrEfVend;
    private javax.swing.JPanel jPanelDadosVend;
    private javax.swing.JPanel jPanelEfeVend;
    private javax.swing.JMenuItem jProd;
    private javax.swing.JLabel jProdVend;
    private javax.swing.JLabel jQuantVend;
    private javax.swing.JMenu jRelat;
    private javax.swing.JSpinner jSpinQuantVend;
    private javax.swing.JFormattedTextField jTextFielddat;
    private javax.swing.JTextField jTxtDesc;
    private javax.swing.JTextField jTxtValorTot;
    private javax.swing.JLabel jValTotal;
    private javax.swing.JMenuItem jVeic;
    private javax.swing.JMenuItem jVend;
    // End of variables declaration//GEN-END:variables
}