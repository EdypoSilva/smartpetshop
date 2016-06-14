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
public class TelaCadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelCadastroProduto
     */
    public TelaCadastroProduto() {
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

        jCadastrarP = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonAdulto = new javax.swing.JRadioButton();
        jButtonInfantil = new javax.swing.JRadioButton();
        jNomeCadastroP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jInformacoes = new javax.swing.JTextArea();
        jValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCodigoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jQuant = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastrando Produto");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setVisible(false);
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

        jCadastrarP.setText("Cadastrar");
        jCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarPActionPerformed(evt);
            }
        });
        getContentPane().add(jCadastrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 164, -1));

        jCancelar.setText("Cancelar");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 144, -1));

        jLabel6.setText("Valor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, 20));

        jButtonAdulto.setText("Adulto");
        getContentPane().add(jButtonAdulto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jButtonInfantil.setText("Infantil");
        getContentPane().add(jButtonInfantil, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));
        getContentPane().add(jNomeCadastroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 173, 174, -1));

        jInformacoes.setColumns(20);
        jInformacoes.setRows(5);
        jScrollPane1.setViewportView(jInformacoes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 211, 293, 81));
        getContentPane().add(jValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 128, -1));

        jLabel1.setText("Nome do Produto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 176, -1, -1));
        getContentPane().add(jCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 128, -1));

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("CADASTRO Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 72, 676, 49));

        jLabel4.setText("Codigo de Barra:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, 20));

        jLabel2.setText("Informações:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 240, -1, -1));

        jLabel3.setText("Categoria:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        jQuant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        getContentPane().add(jQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 70, 30));

        jLabel8.setText("Quantidade:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas Java\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(0, 0, 890, 570);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarPActionPerformed

        String nomep;
        String inforp;
        String categoria = "";
        double valorp;
        int codigoP;
        int quantidade;

        nomep = jNomeCadastroP.getText();
        inforp = jInformacoes.getText();
        valorp = Double.parseDouble(jValor.getText());
        codigoP = Integer.parseInt(jCodigoProduto.getText());
        quantidade = (Integer) jQuant.getValue();

        if (jButtonAdulto.isSelected() == true) {
            categoria = jButtonAdulto.getText();
            if (jButtonInfantil.isSelected() == true) {
                categoria += " e " + jButtonInfantil.getText();
            }
        }
        if (jButtonAdulto.isSelected() == false) {
            if (jButtonInfantil.isSelected() == true) {
                categoria += jButtonInfantil.getText();
            }
        }
        
        Produto cadProduto = new Produto(nomep, inforp, categoria, valorp, codigoP, quantidade);
  
            String testCadastroProduto = ControladorProduto.cadastroProduto(cadProduto);
            if (testCadastroProduto.equals("1")){
                jNomeCadastroP.setText("");
                jInformacoes.setText("");
                jQuant.setValue(1);
                jValor.setText("");
                jCodigoProduto.setText("");
            }else{
                JOptionPane.showMessageDialog(null, testCadastroProduto);
            }
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jCadastrarPActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        ControladorSuporte.mudarTelaStatus(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jButtonAdulto;
    private javax.swing.JRadioButton jButtonInfantil;
    private javax.swing.JButton jCadastrarP;
    private javax.swing.JButton jCancelar;
    private javax.swing.JTextField jCodigoProduto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextArea jInformacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNomeCadastroP;
    private javax.swing.JSpinner jQuant;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jValor;
    // End of variables declaration//GEN-END:variables
}
