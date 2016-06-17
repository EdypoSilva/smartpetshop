/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Produto;
import AllControlador.ControladorProduto;
import AllControlador.ControladorSuporte;
import javax.swing.JOptionPane;

/**
 *
 * @author Felly
 */
public class TelaAlterarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAlterarProduto
     */
    public TelaAlterarProduto() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jConsultAnimalAlterar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jAlterarProduto = new javax.swing.JButton();
        jdeletProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jNomeAlterarP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInformacoes = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonAdulto = new javax.swing.JRadioButton();
        jButtonInfantil = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jQuant = new javax.swing.JSpinner();
        jValor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Alterar Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 650, 49));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pesquisar Produto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 740, 10));

        jLabel6.setText("Código:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 30));

        jConsultAnimalAlterar.setText("Consultar Produto");
        jConsultAnimalAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultAnimalAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultAnimalAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 770, 20));

        jAlterarProduto.setText("Alterar");
        jAlterarProduto.setEnabled(false);
        jAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, -1));

        jdeletProduto.setText("Deletar");
        jdeletProduto.setEnabled(false);
        jdeletProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeletProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(jdeletProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 130, -1));

        jSeparator5.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 690, 10));
        getContentPane().add(jcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 141, 30));

        jLabel1.setText("Nome do Produto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jNomeAlterarP.setEditable(false);
        getContentPane().add(jNomeAlterarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 174, -1));

        jInformacoes.setEditable(false);
        jInformacoes.setColumns(20);
        jInformacoes.setRows(5);
        jScrollPane1.setViewportView(jInformacoes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 293, 81));

        jLabel13.setText("Informações:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel14.setText("Categoria:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jButtonAdulto.setText("Adulto");
        jButtonAdulto.setEnabled(false);
        getContentPane().add(jButtonAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jButtonInfantil.setText("Infantil");
        jButtonInfantil.setEnabled(false);
        getContentPane().add(jButtonInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel8.setText("Quantidade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 30));

        jQuant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        jQuant.setEnabled(false);
        getContentPane().add(jQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 70, 30));

        jValor.setEditable(false);
        getContentPane().add(jValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 128, -1));

        jLabel15.setText("Valor:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Dados do Produto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas NetBeans\\proje00235ety\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jLabel3.setToolTipText(""); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 570);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultAnimalAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultAnimalAlterarActionPerformed

        int cod;
        cod = Integer.parseInt(jcodigo.getText());

        Produto exibeProduto = ControladorProduto.exibirProduto(cod);
        if (exibeProduto != null) {
            jcodigo.setEditable(false);
            jConsultAnimalAlterar.setEnabled(false);
            jNomeAlterarP.setEditable(true);
            jInformacoes.setEditable(true);
            jButtonAdulto.setEnabled(true);
            jButtonInfantil.setEnabled(true);
            jQuant.setEnabled(true);
            jValor.setEditable(true);
            jAlterarProduto.setEnabled(true);
            jdeletProduto.setEnabled(true);
            jNomeAlterarP.setText(exibeProduto.getNome());
            jInformacoes.setText(exibeProduto.getInforP());
            jValor.setText(Double.toString(exibeProduto.getValorP()));
            jQuant.setValue(exibeProduto.getQuantidade());

            if (exibeProduto.getCategoriaP().equals("Adulto")) {
                jButtonAdulto.setSelected(true);
                //Adulto
            }

            if (exibeProduto.getCategoriaP().equals("Infantil")) {
                jButtonInfantil.setSelected(true);
            }

            if (exibeProduto.getCategoriaP().equals("Adulto e Infantil")) {
                jButtonAdulto.setSelected(true);
                jButtonInfantil.setSelected(true);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultAnimalAlterarActionPerformed

    private void jAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarProdutoActionPerformed
        String nomeP = "";
        String inforP = "";
        String categP = "";
        double valorP;
        int quantP;
        int codigoP;

        if (jButtonAdulto.isSelected() == true) {
            categP = "";
            categP = jButtonAdulto.getText();
            if (jButtonInfantil.isSelected() == true) {
                categP += " e " + jButtonInfantil.getText();
            }
        }
        if (!jButtonAdulto.isSelected() == true) {
            categP = "";
            if (jButtonInfantil.isSelected() == true) {
                categP += jButtonInfantil.getText();
            }
        }

        nomeP = jNomeAlterarP.getText();
        inforP = jInformacoes.getText();
        valorP = Double.parseDouble(jValor.getText());
        quantP = (Integer) jQuant.getValue();
        codigoP = Integer.parseInt(jcodigo.getText());

        Produto altProduto = new Produto(nomeP, inforP, categP, valorP, codigoP, quantP);

        String testAlterarProduto = ControladorProduto.editarProduto(altProduto);
        if (testAlterarProduto.equals("1")) {
            jcodigo.setEditable(true);
            jcodigo.setText("");
            jConsultAnimalAlterar.setEnabled(true);
            jNomeAlterarP.setEditable(false);
            jNomeAlterarP.setText("");
            jInformacoes.setEditable(false);
            jInformacoes.setText("");
            jButtonAdulto.setEnabled(false);
            jButtonInfantil.setEnabled(false);
            jQuant.setEnabled(false);
            jValor.setEditable(false);
            jValor.setText("");
            jAlterarProduto.setEnabled(false);
            jdeletProduto.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, testAlterarProduto);
        }

        //AlterarAnimal
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlterarProdutoActionPerformed

    private void jdeletProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeletProdutoActionPerformed

        int codigoP;
        codigoP = Integer.parseInt(jcodigo.getText());
        String testRemover = ControladorProduto.removerProduto(codigoP);
        if (testRemover.equals("1")) {
            jcodigo.setEditable(true);
            jcodigo.setText("");
            jConsultAnimalAlterar.setEnabled(true);
            jNomeAlterarP.setEditable(false);
            jNomeAlterarP.setText("");
            jInformacoes.setEditable(false);
            jInformacoes.setText("");
            jButtonAdulto.setEnabled(false);
            jButtonInfantil.setEnabled(false);
            jQuant.setEnabled(false);
            jValor.setEditable(false);
            jValor.setText("");
            jAlterarProduto.setEnabled(false);
            jdeletProduto.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, testRemover);
        }

        //Deletar
        // TODO add your handling code here:
    }//GEN-LAST:event_jdeletProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        ControladorSuporte.mudarTelaStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAlterarProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jButtonAdulto;
    private javax.swing.JRadioButton jButtonInfantil;
    private javax.swing.JButton jConsultAnimalAlterar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextArea jInformacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeAlterarP;
    private javax.swing.JSpinner jQuant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jValor;
    private javax.swing.JTextField jcodigo;
    private javax.swing.JButton jdeletProduto;
    // End of variables declaration//GEN-END:variables
}
