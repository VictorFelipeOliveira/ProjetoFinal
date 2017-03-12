/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.psc.Apresentacao;

import br.edu.ifnmg.psc.Aplicacao.Produto;
import br.edu.ifnmg.psc.Aplicacao.ProdutoRepositorio;
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
public class TelaGerenciarProduto extends javax.swing.JInternalFrame {

    ProdutoRepositorio dao = GerenciadorReferencias.getProduto();
    TelaCadastroProdutos telaProdutos;
    int idTabela;
    /**
     * Creates new form TelaGerenciarEstoque
     */
    public TelaGerenciarProduto() throws ParseException {
        initComponents();
        
        List<Produto> busca = dao.Buscar(null);
        preencheTabela(busca);
    }
    
    private void preencheTabela(List<Produto> lista) throws ParseException{
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Descrição");
        modelo.addColumn("Preço Unitário");
        modelo.addColumn("Quantidade");
        
        for(Produto p : lista){
            Vector linha = new Vector();
            linha.add(p.getId());
            linha.add(p.getNome());
            linha.add(p.getDescricao());
            linha.add(p.getPrecoUnitario());
            linha.add(p.getQuantidade());
            modelo.addRow(linha);
        }
        
        tblProdutos.setModel(modelo);
    }
    
    public void buscar(String nome) throws ParseException{
        Produto filtro = new Produto(0,nome,null,null,null,null);
        
        List<Produto> busca = dao.Buscar(filtro);
        
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

        PanelGerencProduto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        PanelBuscar = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        PanelFuncionalidades = new javax.swing.JPanel();
        BtnNovoProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        BtonVoltar = new javax.swing.JButton();

        setTitle("Gerenciar Produtos");

        PanelGerencProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de produtos"));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout PanelGerencProdutoLayout = new javax.swing.GroupLayout(PanelGerencProduto);
        PanelGerencProduto.setLayout(PanelGerencProdutoLayout);
        PanelGerencProdutoLayout.setHorizontalGroup(
            PanelGerencProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(PanelGerencProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerencProdutoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelGerencProdutoLayout.setVerticalGroup(
            PanelGerencProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(PanelGerencProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGerencProdutoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar_user_32.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelFuncionalidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionalidades"));

        BtnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add_user_32.png"))); // NOI18N
        BtnNovoProduto.setText("Novo");
        BtnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar_usuario.png"))); // NOI18N
        btnAlterarProduto.setText("Editar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFuncionalidadesLayout = new javax.swing.GroupLayout(PanelFuncionalidades);
        PanelFuncionalidades.setLayout(PanelFuncionalidadesLayout);
        PanelFuncionalidadesLayout.setHorizontalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFuncionalidadesLayout.setVerticalGroup(
            PanelFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionalidadesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(BtnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar_32.png"))); // NOI18N
        BtonVoltar.setText("Voltar");
        BtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelGerencProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(BtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelGerencProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonVoltarActionPerformed
        this.doDefaultCloseAction();
        TelaPrincipal.MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_BtonVoltarActionPerformed

    private void BtnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoProdutoActionPerformed
        this.doDefaultCloseAction();
        abreFrame(new TelaCadastroProdutos());
    }//GEN-LAST:event_BtnNovoProdutoActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int selecionada = tblProdutos.getSelectedRow();
        idTabela = Integer.parseInt( tblProdutos.getModel().getValueAt(selecionada, 0).toString() );
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        try {
            this.doDefaultCloseAction();
            
            editarProduto(idTabela);
        } catch (ParseException ex) {
            ex.printStackTrace();   
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovoProduto;
    private javax.swing.JButton BtonVoltar;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelFuncionalidades;
    private javax.swing.JPanel PanelGerencProduto;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
    private void editarProduto(int id) throws ParseException {
        Produto entidade;
        if(id == 0)
            entidade = new Produto(0,null, null,null, null,null);
        else
            entidade = dao.Abrir(id);
        
        telaProdutos = new TelaCadastroProdutos();
        
        telaProdutos.setEntidade(entidade);
        
        telaProdutos.setListagem(this);
        abreFrame(telaProdutos);
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
