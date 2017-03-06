/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Funcionario;
import br.edu.ifnmg.psc.Aplicacao.FuncionarioRepositorio;
import br.edu.ifnmg.psc.Excecao.ErroValidacao;
import br.edu.ifnmg.psc.Persistencia.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author thais
 */
public class TelaCadastroFuncionarios extends javax.swing.JInternalFrame {
    
    Funcionario funcionario = new Funcionario();
    FuncionarioRepositorio bd_funcionario = new FuncionarioDAO();
    FuncionarioRepositorio dao = GerenciadorReferencias.getFuncionario();
    TelaGerenciarFuncionarios listagem;
    /**
     * Creates new form TelaCadastroFuncionarios
     */
    public TelaCadastroFuncionarios() {
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

        PanelCdastro = new javax.swing.JPanel();
        LblNome = new javax.swing.JLabel();
        LblCarteiraTrababalho = new javax.swing.JLabel();
        LblCpf = new javax.swing.JLabel();
        LblRg = new javax.swing.JLabel();
        LblSexo = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        LblTelefone = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox();
        txtHabilitacao = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LblEndereco = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        LblComplemento = new javax.swing.JLabel();
        LblBairro = new javax.swing.JLabel();
        LblCidade = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCarteiraTrabalho = new javax.swing.JTextField();
        LblHabilitacao = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();

        PanelCdastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionário"));

        LblNome.setText("Nome:");

        LblCarteiraTrababalho.setText("Carteira de Trabalho:");

        LblCpf.setText("CPF:");

        LblRg.setText("RG:");

        LblSexo.setText("Sexo:");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        lblDataNascimento.setText("Data Nascimento: ");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        LblTelefone.setText("Telefone:");

        lblCargo.setText("Cargo:");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Gerente", "Recepcionista", "Motorista" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });

        txtHabilitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabilitacaoActionPerformed(evt);
            }
        });

        LblEndereco.setText("Rua/Av:");

        LblNumero.setText("Número:");

        LblComplemento.setText("Complemento:");

        LblBairro.setText("Bairro:");

        LblCidade.setText("Cidade:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        LblHabilitacao.setText("Habilitação:");

        lblEmail.setText("Email:");

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA-##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PanelCdastroLayout = new javax.swing.GroupLayout(PanelCdastro);
        PanelCdastro.setLayout(PanelCdastroLayout);
        PanelCdastroLayout.setHorizontalGroup(
            PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCdastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                                        .addComponent(txtCPF)
                                        .addGap(1, 1, 1))))
                            .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelCdastroLayout.createSequentialGroup()
                                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(243, 243, 243))
                                .addGroup(PanelCdastroLayout.createSequentialGroup()
                                    .addComponent(LblCarteiraTrababalho, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCarteiraTrabalho)
                                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblComplemento))
                                .addGap(18, 18, 18)
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRua)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                                                        .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(1, 1, 1))))
                                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCdastroLayout.createSequentialGroup()
                                            .addComponent(LblHabilitacao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtHabilitacao))
                                        .addGroup(PanelCdastroLayout.createSequentialGroup()
                                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(4, 4, 4)
                                            .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(PanelCdastroLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(txtBairro))))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addComponent(jSeparator1)))
        );
        PanelCdastroLayout.setVerticalGroup(
            PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCdastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblTelefone)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCargo)
                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblCarteiraTrababalho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCarteiraTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblHabilitacao)
                    .addComponent(txtHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCdastroLayout.createSequentialGroup()
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCdastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_32.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancela.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(584, 584, 584)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelCdastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(PanelCdastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(BtnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void txtHabilitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabilitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabilitacaoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            try {
                extraiCampos();
            } catch (ErroValidacao | ParseException ex) {
                ex.printStackTrace();
            }
            if(dao.VerificaFuncionario(funcionario.getCpf(),funcionario.getRg())){
            System.out.println("Funcionário com CPF "+funcionario.getCpf()+" já cadastrado");
        }
        else{
            if(bd_funcionario.Salvar(funcionario)){
                JOptionPane.showMessageDialog(null,"Funcionário: "+funcionario.getNome()+" cadastrado"
                 + " com sucesso!!! ");
                limpaCampos();
            }
            else JOptionPane.showMessageDialog(null, "Falha ao cadastrar novo Funcionário");
        }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaGerenciarFuncionarios tela = new TelaGerenciarFuncionarios();
        tela.setVisible(true);
        TelaPrincipal.DesktopPrincipal.add(tela);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir Funcionario "+funcionario.getNome()+"? ") == 0){

            if(dao.Apagar(funcionario)){
                JOptionPane.showMessageDialog(rootPane, "Operação concluída com sucesso!");
                funcionario = new Funcionario(0,null,null,null,null,null,null);
                limpaCampos();
            }
            else
                JOptionPane.showMessageDialog(rootPane,"Mensagem de Erro","Ocorreu um erro durante a execução!\n"
                        + "Entre em contato com o administrador do sistema.",JOptionPane.ERROR_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblBairro;
    private javax.swing.JLabel LblCarteiraTrababalho;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblComplemento;
    private javax.swing.JLabel LblCpf;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblHabilitacao;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblRg;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JPanel PanelCdastro;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cmbCargo;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCarteiraTrabalho;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHabilitacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void extraiCampos() throws ErroValidacao, ParseException {
        if(!txtNome.getText().equals(""))
            funcionario.setNome(txtNome.getText());
        if(!txtCPF.getText().equals(""))
            funcionario.setCpf(txtCPF.getText().trim());
        if(!txtRG.getText().equals(""))
            funcionario.setRg(txtRG.getText());
        if(!txtBairro.getText().equals(""))
            funcionario.setBairro(txtBairro.getText());
        if(!txtCidade.getText().equals(""))
            funcionario.setCidade(txtCidade.getText());
        if(!txtComplemento.getText().equals(""))
            funcionario.setComplemento(txtComplemento.getText());
        if(!txtNumero.getText().equals(""))
            funcionario.setNumero(Integer.parseInt(txtNumero.getText()));
        if(!txtTelefone.getText().equals(""))
            funcionario.setTelefone(txtTelefone.getText());
        if(!txtRua.getText().equals(""))
            funcionario.setRua(txtRua.getText());
        if(!txtEmail.getText().equals(""))
            funcionario.setEmail(txtEmail.getText());
        if(!txtCarteiraTrabalho.getText().equals(""))
            funcionario.setCarteiraTrabalho(txtCarteiraTrabalho.getText());
        
        
        if(!txtDataNascimento.getText().equals("")){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data= new java.sql.Date(format.parse(txtDataNascimento.getText()).getTime());
            funcionario.setDataNascimento(data);
        }
        
        String funcao = "";
        switch(cmbCargo.getSelectedIndex()){
            case 1:{
                funcao = "Gerente";
                break;
            }
            case 2:{
                funcao = "Recepcionista";
                break;
            }
            
            case 3:{
                funcao = "Motorista";
                break;
            }
            default: throw new ErroValidacao("Função selecionada Inválida");    
        }
        
        funcionario.setCargo(funcao);
        String sexo = "";
        
        switch(cmbSexo.getSelectedIndex()){
            case 1:{
                sexo = "Masculino";
                break;
            }
            case 2:{
                sexo = "Feminino";
                break;
            }
            case 3:{
                sexo = "Outro";
                break;
            }
            default:throw new Error("Erro na validação do Sexo");
        }
        funcionario.setSexo(sexo);
        
    }

    private void limpaCampos() {
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtCarteiraTrabalho.setText("");
        txtDataNascimento.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtRG.setText("");
        cmbSexo.setSelectedIndex(0);
        txtTelefone.setText("");
        cmbCargo.setSelectedIndex(0);
        txtHabilitacao.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
    }

    void setEntidade(Funcionario entidade) throws ParseException, ErroValidacao {
        this.funcionario = entidade;
        preencheCampos();
    }

    void setListagem(TelaGerenciarFuncionarios listagem) {
        this.listagem = listagem;
    }

    private void preencheCampos() throws ParseException, ErroValidacao {
        txtNome.setText(funcionario.getNome());
        txtRG.setText(funcionario.getRg());
        txtCPF.setText(funcionario.getCpf());
/*        int opcao = 0;
        switch(funcionario.getSexo()){
            case "Masculino":{
                opcao = 1;
                break;
            }
            case "Feminino":{
                opcao = 2;
                break;
            }
            case "Outro":{
                opcao = 3;
                break;
            }
            default: throw new ErroValidacao("Erro ao preencher campo sexo");
        }*/
        cmbSexo.setSelectedItem(funcionario.getSexo());
    /*    opcao = 0;
        switch(funcionario.getCargo()){
            case "Gerente":{
                opcao = 1;
                break;
            }
            case "Recepcionista":{
                opcao = 2;
                break;
            }
            case "Motorista":{
                opcao = 3;
                break;
            }
            default: throw new ErroValidacao("Erro ao preencher campo Cargo");
        }*/
        
        cmbCargo.setSelectedItem(funcionario.getCargo());
        txtEmail.setText(funcionario.getEmail());
        txtTelefone.setText(funcionario.getTelefone());
        txtCarteiraTrabalho.setText(funcionario.getCarteiraTrabalho());
        
        SimpleDateFormat entrada= new SimpleDateFormat("yyyy-MM-dd"); 
        SimpleDateFormat saida= new SimpleDateFormat("dd/MM/yyyy");
        String novaData = saida.format(entrada.parse(funcionario.getDataNascimento().toString()));
        
        txtDataNascimento.setText(novaData);
        
        txtRua.setText(funcionario.getRua());
        txtBairro.setText(funcionario.getBairro());
        txtCidade.setText(funcionario.getCidade());
        txtComplemento.setText(funcionario.getComplemento());
        txtNumero.setText(String.valueOf(funcionario.getNumero()));
        txtHabilitacao.setText(funcionario.getHabilitacao());       
    }
}
