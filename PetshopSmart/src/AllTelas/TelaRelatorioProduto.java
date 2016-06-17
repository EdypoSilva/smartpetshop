/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Produto;
import AllControlador.ControladorProduto;
import AllControlador.ControladorSuporte;
import BancoDeDados.BancoPetshop;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felly
 */
public class TelaRelatorioProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelatorioProduto
     */
    public TelaRelatorioProduto() {
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

        buttonGroupProduto = new javax.swing.ButtonGroup();
        jCancelar = new javax.swing.JButton();
        jImprimir = new javax.swing.JButton();
        jTableClientes = new javax.swing.JScrollPane();
        jTableRelatorioProduto = new javax.swing.JTable();
        jRadioCodigoProduto = new javax.swing.JRadioButton();
        jConsultarPorCodigo = new javax.swing.JButton();
        jRadioNomeProduto = new javax.swing.JRadioButton();
        jPesquisaCodigo = new javax.swing.JTextField();
        jRadioAllProduto = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jConsultarPorNomeProduto = new javax.swing.JButton();
        jPesquisaNomeProduto = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel13 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCancelar.setText("Sair");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 90, -1));

        jImprimir.setText("Imprimir");
        jImprimir.setEnabled(false);
        getContentPane().add(jImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 530, 90, -1));

        jTableRelatorioProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"
            }
        ));
        jTableClientes.setViewportView(jTableRelatorioProduto);

        getContentPane().add(jTableClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 780, 240));

        buttonGroupProduto.add(jRadioCodigoProduto);
        jRadioCodigoProduto.setText("Código:");
        jRadioCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCodigoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 70, 30));

        jConsultarPorCodigo.setText("@");
        jConsultarPorCodigo.setToolTipText("");
        jConsultarPorCodigo.setEnabled(false);
        jConsultarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarPorCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultarPorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 30, 30));

        buttonGroupProduto.add(jRadioNomeProduto);
        jRadioNomeProduto.setText("Nome Produto:");
        jRadioNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 110, 30));

        jPesquisaCodigo.setToolTipText("Digite o nome que deseja pesquisar \"Ex: Edypo Fellype\"");
        jPesquisaCodigo.setEnabled(false);
        jPesquisaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jPesquisaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 120, 30));

        buttonGroupProduto.add(jRadioAllProduto);
        jRadioAllProduto.setText("All Produtos");
        jRadioAllProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAllProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioAllProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 90, 30));

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Relatório Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jConsultarPorNomeProduto.setText("@");
        jConsultarPorNomeProduto.setToolTipText("");
        jConsultarPorNomeProduto.setEnabled(false);
        jConsultarPorNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarPorNomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultarPorNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 30, 30));

        jPesquisaNomeProduto.setToolTipText("Digite o nome que deseja pesquisar \"Ex: Edypo Fellype\"");
        jPesquisaNomeProduto.setEnabled(false);
        jPesquisaNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaNomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jPesquisaNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 140, 30));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas NetBeans\\proje00235ety\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jLabel13.setToolTipText(""); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(0, 0, 900, 580);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        ControladorSuporte.mudarTelaStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

    private void jRadioCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCodigoProdutoActionPerformed

        Object[] colunas = {"Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"};
        DefaultTableModel modeloTableProduto = new DefaultTableModel();
        modeloTableProduto.setColumnIdentifiers(colunas);
        jTableRelatorioProduto.setModel(modeloTableProduto);
        
        if (jRadioCodigoProduto.isSelected() == true) {
            jRadioCodigoProduto.setEnabled(false);
            jPesquisaCodigo.setEnabled(true);
            jConsultarPorCodigo.setEnabled(true);
            //NomeProduto
            jRadioNomeProduto.setEnabled(true);
            jPesquisaNomeProduto.setEnabled(false);
            jConsultarPorNomeProduto.setEnabled(false);
            jPesquisaNomeProduto.setText("");
            //AllProduto
            jRadioAllProduto.setEnabled(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioCodigoProdutoActionPerformed

    private void jConsultarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarPorCodigoActionPerformed

        int codigoProduto = Integer.parseInt(jPesquisaCodigo.getText());
        Object[] colunas = {"Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"};
        DefaultTableModel modeloTableProduto = new DefaultTableModel();
        modeloTableProduto.setColumnIdentifiers(colunas);
        jTableRelatorioProduto.setModel(modeloTableProduto);

        String testValidarProduto = ControladorProduto.ExisteCODProduto(codigoProduto);
        if (testValidarProduto.equals("1")) {
            for (int i = 0; i < BancoPetshop.BancoListProduto.size(); i++) {
                Produto p = BancoPetshop.BancoListProduto.get(i);
                if (p.getCodigoP() == codigoProduto) {
                    modeloTableProduto.addRow(new String[]{p.getCodigoP() + "",
                        p.getNome(),
                        p.getInforP(),
                        p.getCategoriaP(),
                        p.getQuantidade() + "",
                        p.getValorP() + ""});
                }
            }
            jTableRelatorioProduto.setModel(modeloTableProduto);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarPorCodigoActionPerformed

    private void jRadioNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNomeProdutoActionPerformed

        Object[] colunas = {"Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"};
        DefaultTableModel modeloTableProduto = new DefaultTableModel();
        modeloTableProduto.setColumnIdentifiers(colunas);
        jTableRelatorioProduto.setModel(modeloTableProduto);

        if (jRadioNomeProduto.isSelected() == true) {
            jRadioNomeProduto.setEnabled(false);
            jPesquisaNomeProduto.setEnabled(true);
            jConsultarPorNomeProduto.setEnabled(true);
            //CodigoProduto
            jRadioCodigoProduto.setEnabled(true);
            jPesquisaCodigo.setEnabled(false);
            jPesquisaCodigo.setText("");
            jConsultarPorCodigo.setEnabled(false);
            //AllProduto
            jRadioAllProduto.setEnabled(true);   
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNomeProdutoActionPerformed

    private void jPesquisaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesquisaCodigoActionPerformed

    private void jRadioAllProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAllProdutoActionPerformed

        Object[] colunas = {"Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"};
        DefaultTableModel modeloTableProduto = new DefaultTableModel();
        modeloTableProduto.setColumnIdentifiers(colunas);
        jTableRelatorioProduto.setModel(modeloTableProduto);

        if (jRadioAllProduto.isSelected() == true) {
            jConsultarPorCodigo.setEnabled(false);
            jPesquisaCodigo.setEnabled(false);
            jPesquisaNomeProduto.setEnabled(false);
            jRadioNomeProduto.setEnabled(true);
            jRadioCodigoProduto.setEnabled(true);
            jRadioAllProduto.setEnabled(false);
            jPesquisaCodigo.setText("");
            jPesquisaNomeProduto.setText("");
            jConsultarPorNomeProduto.setEnabled(false);

            for (int i = 0; i < BancoPetshop.BancoListProduto.size(); i++) {
                Produto p = BancoPetshop.BancoListProduto.get(i);
                    modeloTableProduto.addRow(new String[]{p.getCodigoP() + "",
                        p.getNome(),
                        p.getInforP(),
                        p.getCategoriaP(),
                        p.getQuantidade() + "",
                        p.getValorP() + ""});
            }
            jTableRelatorioProduto.setModel(modeloTableProduto);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioAllProdutoActionPerformed

    private void jConsultarPorNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarPorNomeProdutoActionPerformed

        String nomeAnimal = jPesquisaNomeProduto.getText();
        Object[] colunas = {"Código", "Nome", "Informações", "Categoria", "Estoque", "Valor"};
        DefaultTableModel modeloTableProduto = new DefaultTableModel();
        modeloTableProduto.setColumnIdentifiers(colunas);
        jTableRelatorioProduto.setModel(modeloTableProduto);

            for (int i = 0; i < BancoPetshop.BancoListProduto.size(); i++) {
                Produto p = BancoPetshop.BancoListProduto.get(i);
                if (p.getNome().toLowerCase().contains(nomeAnimal.toLowerCase())) {
                    modeloTableProduto.addRow(new String[]{p.getCodigoP() + "",
                        p.getNome(),
                        p.getInforP(),
                        p.getCategoriaP(),
                        p.getQuantidade() + "",
                        p.getValorP() + ""});
                }
            }
            jTableRelatorioProduto.setModel(modeloTableProduto);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarPorNomeProdutoActionPerformed

    private void jPesquisaNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesquisaNomeProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupProduto;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jConsultarPorCodigo;
    private javax.swing.JButton jConsultarPorNomeProduto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jImprimir;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jPesquisaCodigo;
    private javax.swing.JTextField jPesquisaNomeProduto;
    private javax.swing.JRadioButton jRadioAllProduto;
    private javax.swing.JRadioButton jRadioCodigoProduto;
    private javax.swing.JRadioButton jRadioNomeProduto;
    private javax.swing.JScrollPane jTableClientes;
    private javax.swing.JTable jTableRelatorioProduto;
    // End of variables declaration//GEN-END:variables
}
