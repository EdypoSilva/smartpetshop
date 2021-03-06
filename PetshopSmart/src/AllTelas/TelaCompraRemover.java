/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Compra;
import AllClass.Repositorio.RepositorioCompra;
import AllControlador.ControladorCliente;
import AllControlador.ControladorCompra;
import AllControlador.ControladorSuporte;
import static BancoDeDados.BancoPetshop.BancoListCompra;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felly
 */
public class TelaCompraRemover extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCompraRemover
     */
    public TelaCompraRemover() {
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

        jCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCPFAnimalAlterar = new javax.swing.JFormattedTextField();
        jConsultRemoverCompra = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jidCompra = new javax.swing.JTextField();
        jBuscarID = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jNomeCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jidproduto = new javax.swing.JTextField();
        jdeletCompra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRemoverCompra = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();

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

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Dados do Cliente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 20));

        jLabel6.setText("CPF do Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 20));

        try {
            jCPFAnimalAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jCPFAnimalAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 140, -1));

        jConsultRemoverCompra.setText("Consultar Cliente");
        jConsultRemoverCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultRemoverCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultRemoverCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 770, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 740, 10));

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Remover Compra");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 620, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Animais Registrados:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 30));

        jSeparator4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 820, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Remover Compra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID Compra:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, 30));

        jidCompra.setEditable(false);
        jidCompra.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jidCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 50, 30));

        jBuscarID.setText("@");
        jBuscarID.setEnabled(false);
        jBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarIDActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 30));

        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, 20));

        jNomeCompra.setEditable(false);
        jNomeCompra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jNomeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 170, -1));

        jLabel9.setText("Data&Hora:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 70, 20));

        jidproduto.setEditable(false);
        jidproduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jidproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 150, -1));

        jdeletCompra.setText("Deletar");
        jdeletCompra.setEnabled(false);
        jdeletCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeletCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jdeletCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 130, -1));

        jTableRemoverCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(jTableRemoverCompra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 750, 130));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas NetBeans\\proje00235ety\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jLabel2.setToolTipText(""); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 600);

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

    private void jConsultRemoverCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultRemoverCompraActionPerformed

        String cpf;
        cpf = jCPFAnimalAlterar.getText();

        String testValidarCPFCliente = ControladorCliente.validarCPF(cpf);
        String testCPFCompra = ControladorCompra.existeCPFCompra(cpf);
        if (testValidarCPFCliente.equals("1") && testCPFCompra.equals("1")) {
            jidCompra.setEditable(true);
            jBuscarID.setEnabled(true);

            Object[] colunas = {"ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableRemoverCompra.setModel(modelo);
            for (int i = 0; i < BancoListCompra.size(); i++) {
                Compra c = BancoListCompra.get(i);
                if (c.getCPFCompra().equals(cpf)) {
                    modelo.addRow(new String[]{c.getCodigoCompra() + "",
                        c.getNomeCompra(),
                        c.getValorCompra() + "",
                        c.getCodigoProduto() + "",
                        c.getDataCompra(),
                        c.getQuantidadeC() + ""});
                }
            }
            jTableRemoverCompra.setModel(modelo);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultRemoverCompraActionPerformed

    private void jBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarIDActionPerformed
        String cpf = jCPFAnimalAlterar.getText();
        int posicao = Integer.parseInt(jidCompra.getText());
        Compra exibirCompra = ControladorCompra.exibirCompra(cpf, posicao);
        if (exibirCompra != null) {
            jBuscarID.setEnabled(false);
            jidCompra.setEditable(false);
            jNomeCompra.setEditable(true);
            jidproduto.setEditable(true);
            jdeletCompra.setEnabled(true);
            jNomeCompra.setText(exibirCompra.getNomeCompra());
            jidproduto.setText(exibirCompra.getDataCompra());
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarIDActionPerformed

    private void jdeletCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeletCompraActionPerformed
        String cpf = jCPFAnimalAlterar.getText();
        int posicao = Integer.parseInt(jidCompra.getText());

        if (RepositorioCompra.setRemoverCompra(cpf, posicao)) {
            jNomeCompra.setEditable(false);
            jidproduto.setEditable(false);
            jNomeCompra.setText("");
            jidproduto.setText("");
            jdeletCompra.setEnabled(false);
            jidCompra.setEditable(true);
            jBuscarID.setEnabled(true);
        }
        
        Object[] colunas = {"ID Compra", "Nome", "Valor", "ID Produto", "Data&Hora", "Quantidade"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRemoverCompra.setModel(modelo);
        for (int i = 0; i < BancoListCompra.size(); i++) {
            Compra c = BancoListCompra.get(i);
            if (c.getCPFCompra().equals(cpf)) {
                modelo.addRow(new String[]{c.getCodigoCompra() + "",
                    c.getNomeCompra(),
                    c.getValorCompra() + "",
                    c.getCodigoProduto() + "",
                    c.getDataCompra(),
                    c.getQuantidadeC() + ""});
            }
        }
        jTableRemoverCompra.setModel(modelo);

        //Deletar
        // TODO add your handling code here:
    }//GEN-LAST:event_jdeletCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarID;
    private javax.swing.JFormattedTextField jCPFAnimalAlterar;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jConsultRemoverCompra;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableRemoverCompra;
    private javax.swing.JButton jdeletCompra;
    private javax.swing.JTextField jidCompra;
    private javax.swing.JTextField jidproduto;
    // End of variables declaration//GEN-END:variables
}
