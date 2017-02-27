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
public class TelaCadastroClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroClientes
     */
    public TelaCadastroClientes() {
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

        PanelCadastroCliente = new javax.swing.JPanel();
        lblCarteiraTrabalho = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        LblRG = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LblEndereco = new javax.swing.JLabel();
        TxtEndereco = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        LblComplemento = new javax.swing.JLabel();
        LblBairro = new javax.swing.JLabel();
        LblCidade = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtCidade = new javax.swing.JTextField();
        TxtComplemento = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        TxtCpf = new javax.swing.JTextField();
        xtRG = new javax.swing.JTextField();
        txtCarteiraTrabalho = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JFormattedTextField();
        txtBairro = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuGerenciar = new javax.swing.JMenu();
        MenuItemFuncionarios = new javax.swing.JMenuItem();
        jMenuItemclientes = new javax.swing.JMenuItem();
        MenuItemVendas = new javax.swing.JMenuItem();
        MenuItemProdutos = new javax.swing.JMenuItem();
        MenuItemCompras = new javax.swing.JMenuItem();
        MenuItemEntregas = new javax.swing.JMenuItem();
        MenuItemVeiculos = new javax.swing.JMenuItem();
        MenuRelatorios = new javax.swing.JMenu();

        PanelCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Cliente"));

        lblCarteiraTrabalho.setText("Carteira de Trabalho:");

        lblCpf.setText("CPF:");

        LblRG.setText("RG:");

        LblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));

        lblDataNascimento.setText("Data Nascimento: ");

        txtDataNascimento.setText("   / /");

        Telefone.setText("Telefone:");

        LblEndereco.setText("Rua/Av:");

        LblNumero.setText("Número:");

        LblComplemento.setText("Complemento:");

        LblBairro.setText("Bairro:");

        LblCidade.setText("Cidade:");

        TxtTelefone.setText("( )");

        lblNome.setText("Nome:");

        javax.swing.GroupLayout PanelCadastroClienteLayout = new javax.swing.GroupLayout(PanelCadastroCliente);
        PanelCadastroCliente.setLayout(PanelCadastroClienteLayout);
        PanelCadastroClienteLayout.setHorizontalGroup(
            PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                            .addComponent(TxtNome)))
                                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(txtCarteiraTrabalho))))
                                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCadastroClienteLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))
                                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(LblRG, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xtRG)
                                    .addComponent(cmbSexo, 0, 210, Short.MAX_VALUE)
                                    .addComponent(TxtTelefone)))
                            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LblEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LblNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LblComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(69, 69, 69)
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                            .addComponent(LblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(TxtCidade)))
                                    .addComponent(TxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        PanelCadastroClienteLayout.setVerticalGroup(
            PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroClienteLayout.createSequentialGroup()
                .addGap(23, 23, Short.MAX_VALUE)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnVoltar.setText("Voltar");

        btnSalvar.setText("Salvar");

        btnExcluir.setText("Excluir");

        MenuGerenciar.setText("Gerenciar");

        MenuItemFuncionarios.setText("Funcionários");
        MenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFuncionariosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemFuncionarios);

        jMenuItemclientes.setText("Clientes");
        jMenuItemclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemclientesActionPerformed(evt);
            }
        });
        MenuGerenciar.add(jMenuItemclientes);

        MenuItemVendas.setText("Vendas");
        MenuItemVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVendasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemVendas);

        MenuItemProdutos.setText("Produtos");
        MenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProdutosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemProdutos);

        MenuItemCompras.setText("Compras");
        MenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemComprasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemCompras);

        MenuItemEntregas.setText("Entregas");
        MenuItemEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEntregasActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemEntregas);

        MenuItemVeiculos.setText("Veículos");
        MenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVeiculosActionPerformed(evt);
            }
        });
        MenuGerenciar.add(MenuItemVeiculos);

        jMenuBar1.add(MenuGerenciar);

        MenuRelatorios.setText("Relatórios");
        jMenuBar1.add(MenuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFuncionariosActionPerformed
       TelaGerenciarFuncionarios telaFuncionarios = new TelaGerenciarFuncionarios();
        this.add(telaFuncionarios);
        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_MenuItemFuncionariosActionPerformed

    private void jMenuItemclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemclientesActionPerformed
       TelaGerenciarClientes telaClientes = new TelaGerenciarClientes();
        this.add(telaClientes);
        telaClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemclientesActionPerformed

    private void MenuItemVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVendasActionPerformed
       TelaGerenciamentoVendas telaVendas = new TelaGerenciamentoVendas();
        this.add(telaVendas);
        telaVendas.setVisible(true);
    }//GEN-LAST:event_MenuItemVendasActionPerformed

    private void MenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProdutosActionPerformed
        TelaGerenciarProduto telaProduto = new TelaGerenciarProduto();
        this.add(telaProduto);
        telaProduto.setVisible(true);
    }//GEN-LAST:event_MenuItemProdutosActionPerformed

    private void MenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemComprasActionPerformed
       TelaEfetuarCompras telaCompras = new TelaEfetuarCompras();
        this.add(telaCompras);
        telaCompras.setVisible(true);
    }//GEN-LAST:event_MenuItemComprasActionPerformed

    private void MenuItemEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEntregasActionPerformed
        TelaEfetuarEntrega telaEntregas = new TelaEfetuarEntrega();
        this.add(telaEntregas);
        telaEntregas.setVisible(true);
    }//GEN-LAST:event_MenuItemEntregasActionPerformed

    private void MenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVeiculosActionPerformed
        TelaGerenciarVeiculos telaVeiculos = new TelaGerenciarVeiculos();
        this.add(telaVeiculos);
        telaVeiculos.setVisible(true);
    }//GEN-LAST:event_MenuItemVeiculosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblComplemento;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblRG;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JMenu MenuGerenciar;
    private javax.swing.JMenuItem MenuItemCompras;
    private javax.swing.JMenuItem MenuItemEntregas;
    private javax.swing.JMenuItem MenuItemFuncionarios;
    private javax.swing.JMenuItem MenuItemProdutos;
    private javax.swing.JMenuItem MenuItemVeiculos;
    private javax.swing.JMenuItem MenuItemVendas;
    private javax.swing.JMenu MenuRelatorios;
    private javax.swing.JPanel PanelCadastroCliente;
    private javax.swing.JLabel Telefone;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComplemento;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JFormattedTextField TxtTelefone;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemclientes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCarteiraTrabalho;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCarteiraTrabalho;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField xtRG;
    // End of variables declaration//GEN-END:variables
}
