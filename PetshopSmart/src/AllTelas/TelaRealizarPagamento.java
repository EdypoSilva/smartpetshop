/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Cliente;
import AllControlador.ControladorCliente;
import AllControlador.ControladorCompra;
import AllControlador.ControladorSuporte;

/**
 *
 * @author Felly
 */
public class TelaRealizarPagamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRealizarPagamento
     */
    public TelaRealizarPagamento() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jNomeCLiente = new javax.swing.JTextField();
        jCPFDono = new javax.swing.JFormattedTextField();
        jConsultCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jValorPagar = new javax.swing.JTextField();
        jPagar = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSaldoCliente = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Pagamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Dados do Cliente");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setText("CPF do Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 20));

        jNomeCLiente.setEditable(false);
        jNomeCLiente.setEnabled(false);
        getContentPane().add(jNomeCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 128, -1));

        try {
            jCPFDono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jCPFDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jConsultCliente.setText("Consultar Cliente");
        jConsultCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Pagamento  (Serviço/Produto)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Valor do Pagamento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, 30));

        jValorPagar.setBackground(new java.awt.Color(0, 204, 0));
        jValorPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jValorPagar.setForeground(new java.awt.Color(255, 255, 255));
        jValorPagar.setEnabled(false);
        getContentPane().add(jValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 100, 30));

        jPagar.setText("Pagar");
        jPagar.setEnabled(false);
        jPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 100, 30));

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Debito:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 60, 30));

        jSaldoCliente.setEditable(false);
        jSaldoCliente.setBackground(new java.awt.Color(255, 0, 0));
        jSaldoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSaldoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jSaldoCliente.setEnabled(false);
        getContentPane().add(jSaldoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas NetBeans\\proje00235ety\\PetshopSmart\\IMG\\TelaCadastro22.png")); // NOI18N
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 600);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultClienteActionPerformed

        String cpf = jCPFDono.getText();
        Cliente x = ControladorCliente.exibirCliente(cpf);
        if (x != null) {
            jValorPagar.setEnabled(true);
            jPagar.setEnabled(true);
            jNomeCLiente.setEnabled(true);
            jCPFDono.setEditable(false);
            jSaldoCliente.setEnabled(true);
            jNomeCLiente.setText(x.getNome());
            jSaldoCliente.setText(Double.toString(x.getSaldo()));
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultClienteActionPerformed

    private void jPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPagarActionPerformed

        double valorPagamento = Double.parseDouble(jValorPagar.getText());
        String cpf = jCPFDono.getText();

        String testValidarPagamento = ControladorCompra.pagamentoCompra(cpf, valorPagamento);
        if (testValidarPagamento.equals("1")) {
            Cliente x = ControladorCliente.exibirCliente(cpf);
            jSaldoCliente.setText(Double.toString(x.getSaldo()));
            jPagar.setEnabled(false);
            jValorPagar.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jPagarActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        ControladorSuporte.mudarTelaStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jCPFDono;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jConsultCliente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeCLiente;
    private javax.swing.JButton jPagar;
    private javax.swing.JTextField jSaldoCliente;
    private javax.swing.JTextField jValorPagar;
    // End of variables declaration//GEN-END:variables
}
