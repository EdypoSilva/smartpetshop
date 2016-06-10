/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Animal;
import AllControlador.ControladorAnimal;
import AllControlador.ControladorCliente;
import AllSuporte.Suporte;
import static BancoDeDados.BancoPetshop.BancoListAnimal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felly
 */
public class TelaAlterarAnimal extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAlterarAnimal
     */
    public TelaAlterarAnimal() {
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

        bAlterar = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jConsultAnimalAlterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCPFAnimalAlterar = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jdeletAnimal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jNomeAnimal = new javax.swing.JTextField();
        jRacaAnimal = new javax.swing.JTextField();
        jAlterar = new javax.swing.JButton();
        jIdadeAnimal = new javax.swing.JTextField();
        jCorAnimal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSexo1 = new javax.swing.JRadioButton();
        jSexo2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnimal = new javax.swing.JTable();
        jidAnimal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jBuscarID = new javax.swing.JButton();
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

        jLabel5.setFont(new java.awt.Font("Stencil Std", 1, 60)); // NOI18N
        jLabel5.setText("Alterar Animal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 570, 49));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Dados do Cliente:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 20));

        jConsultAnimalAlterar.setText("Consultar Cliente");
        jConsultAnimalAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultAnimalAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultAnimalAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel6.setText("CPF do Cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 20));

        try {
            jCPFAnimalAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCPFAnimalAlterar.setText("");
        getContentPane().add(jCPFAnimalAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 140, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 770, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 740, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Animais Registrados:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 30));

        jdeletAnimal.setText("Deletar");
        jdeletAnimal.setEnabled(false);
        jdeletAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeletAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(jdeletAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Animal Selecionado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 820, 10));

        jNomeAnimal.setEditable(false);
        jNomeAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jNomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 170, -1));

        jRacaAnimal.setEditable(false);
        jRacaAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jRacaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 170, -1));

        jAlterar.setText("Alterar");
        jAlterar.setEnabled(false);
        jAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, -1));

        jIdadeAnimal.setEditable(false);
        jIdadeAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jIdadeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 50, -1));

        jCorAnimal.setEditable(false);
        jCorAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jCorAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 110, -1));

        jLabel4.setText("Idade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 40, 20));

        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, 20));

        jLabel9.setText("Cor:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 30, 20));

        jLabel10.setText("Raça:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 40, 20));

        bAlterar.add(jSexo1);
        jSexo1.setText("Macho");
        jSexo1.setEnabled(false);
        getContentPane().add(jSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        bAlterar.add(jSexo2);
        jSexo2.setText("Fêmea");
        jSexo2.setEnabled(false);
        getContentPane().add(jSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        jLabel11.setText("Sexo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, 40));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 130, -1));

        jSeparator5.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 690, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTableAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "Cor", "Raça", "Sexo"
            }
        ));
        jTableAnimal.setToolTipText("");
        jTableAnimal.setEnabled(false);
        jTableAnimal.setRowHeight(20);
        jTableAnimal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAnimalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAnimal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 740, 120));

        jidAnimal.setEditable(false);
        jidAnimal.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jidAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 50, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 30));

        jBuscarID.setText("@");
        jBuscarID.setEnabled(false);
        jBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarIDActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, 30));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas Java\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jLabel13.setToolTipText(""); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(0, 0, 900, 600);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultAnimalAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultAnimalAlterarActionPerformed

        String cpf;
        cpf = jCPFAnimalAlterar.getText();

        String testExisteAnimal = ControladorAnimal.existeClienteAnimal(cpf);
        String testValidarCPF = ControladorCliente.validarCPF(cpf);
        if (testValidarCPF.equals("1") && testExisteAnimal.equals("1")) {
            jCPFAnimalAlterar.setEditable(false);
            jTableAnimal.setEnabled(true);
            jConsultAnimalAlterar.setEnabled(false);
            jAlterar.setEnabled(true);
            jdeletAnimal.setEnabled(true);
            jidAnimal.setEditable(true);
            jBuscarID.setEnabled(true);
            jidAnimal.setEnabled(true);

            Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableAnimal.setModel(modelo);
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal a = BancoListAnimal.get(i);
                if (a.getCpf().equals(cpf)) {
                    modelo.addRow(new String[]{a.getCodigoA() + "",
                        a.getNomeA(),
                        a.getIdade() + "",
                        a.getCor(),
                        a.getRaca(),
                        a.getSexo()});
                }
            }
            jTableAnimal.setModel(modelo);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultAnimalAlterarActionPerformed

    private void jAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarActionPerformed

        String jsexo = "";
        String nome = "";
        String idade = "";
        String cor = "";
        String raca = "";
        String cpf = "";
        int posicao;
        int xidade = 0;
        int codigo = 0;

        posicao = Integer.parseInt(jidAnimal.getText());
        cpf = jCPFAnimalAlterar.getText();
        nome = jNomeAnimal.getText();
        idade = jIdadeAnimal.getText();
        xidade = Integer.parseInt(idade);
        cor = jCorAnimal.getText();
        raca = jRacaAnimal.getText();

        if (jSexo1.isSelected() == true) {
            jsexo = jSexo1.getText();
        }
        if (jSexo2.isSelected() == true) {
            jsexo = jSexo2.getText();
        }

        Animal xAnimal = new Animal(nome, xidade, cor, raca, jsexo, cpf, codigo);
        String resultAlterarAnimal = ControladorAnimal.alterarAnimal(xAnimal, posicao);

        if (resultAlterarAnimal.equals("1")) {
            jConsultAnimalAlterar.setEnabled(false);
            jidAnimal.setEditable(false);
            jidAnimal.setText("");
            jSexo1.setEnabled(false);
            jSexo2.setEnabled(false);
            jCPFAnimalAlterar.setEditable(true);
            jTableAnimal.setEnabled(false);
            jConsultAnimalAlterar.setEnabled(true);
            jAlterar.setEnabled(false);
            jdeletAnimal.setEnabled(false);
            jidAnimal.setEditable(true);
            jBuscarID.setEnabled(false);
            jNomeAnimal.setEditable(false);
            jNomeAnimal.setText("");
            jCorAnimal.setEditable(false);
            jCorAnimal.setText("");
            jIdadeAnimal.setEditable(false);
            jIdadeAnimal.setText("");
            jRacaAnimal.setEditable(false);
            jRacaAnimal.setText("");
        }

        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableAnimal.setModel(modelo);
        if (BancoListAnimal.size() == 0) {
            modelo.addRow(new String[]{"Sem Animais", null, null, null, null, null});
        } else {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal a = BancoListAnimal.get(i);
                if (a.getCpf().equals(cpf)) {
                    modelo.addRow(new String[]{a.getCodigoA() + "",
                        a.getNomeA(),
                        a.getIdade() + "",
                        a.getCor(),
                        a.getRaca(),
                        a.getSexo()});
                }
            }
            jTableAnimal.setModel(modelo);
        }

        //AlterarAnimal
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlterarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Suporte.setMudarStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jdeletAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeletAnimalActionPerformed

        String cpf = jCPFAnimalAlterar.getText();
        int posicao = Integer.parseInt(jidAnimal.getText());

        String resultCadastroAnimal = ControladorAnimal.deletarAnimal(cpf, posicao);
        if (resultCadastroAnimal.equals("1")) {
            jConsultAnimalAlterar.setEnabled(false);
            jidAnimal.setEditable(false);
            jidAnimal.setText("");
            jSexo1.setEnabled(false);
            jSexo2.setEnabled(false);
            jCPFAnimalAlterar.setEditable(true);
            jTableAnimal.setEnabled(false);
            jConsultAnimalAlterar.setEnabled(true);
            jAlterar.setEnabled(false);
            jdeletAnimal.setEnabled(false);
            jidAnimal.setEditable(true);
            jBuscarID.setEnabled(false);
            jNomeAnimal.setEditable(false);
            jNomeAnimal.setText("");
            jCorAnimal.setEditable(false);
            jCorAnimal.setText("");
            jIdadeAnimal.setEditable(false);
            jIdadeAnimal.setText("");
            jRacaAnimal.setEditable(false);
            jRacaAnimal.setText("");
            
            Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo"};
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(colunas);
            jTableAnimal.setModel(modelo);
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal a = BancoListAnimal.get(i);
                if (a.getCpf().equals(cpf)) {
                    modelo.addRow(new String[]{a.getCodigoA() + "",
                        a.getNomeA(),
                        a.getIdade() + "",
                        a.getCor(),
                        a.getRaca(),
                        a.getSexo()});
                }
            }
            jTableAnimal.setModel(modelo);
        }

        //Deletar
        // TODO add your handling code here:
    }//GEN-LAST:event_jdeletAnimalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnimalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAnimalMouseClicked

    private void jBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarIDActionPerformed
        String cpf;
        int posicao;
        cpf = jCPFAnimalAlterar.getText();
        posicao = Integer.parseInt(jidAnimal.getText());

        Animal exibirAnimal = ControladorAnimal.exibirAnimal(cpf, posicao);
        jBuscarID.setEnabled(false);
        jidAnimal.setEnabled(false);
        jSexo1.setEnabled(true);
        jSexo2.setEnabled(true);
        jNomeAnimal.setEditable(true);
        jIdadeAnimal.setEditable(true);
        jCorAnimal.setEditable(true);
        jRacaAnimal.setEditable(true);
        jNomeAnimal.setText(exibirAnimal.getNomeA());
        jIdadeAnimal.setText(Integer.toString(exibirAnimal.getIdade()));
        jCorAnimal.setText(exibirAnimal.getCor());
        jRacaAnimal.setText(exibirAnimal.getRaca());

        if (exibirAnimal.getSexo().equals("Macho")) {
            jSexo1.setSelected(true);
            //Homem
        } else {
            jSexo2.setSelected(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bAlterar;
    private javax.swing.JButton jAlterar;
    private javax.swing.JButton jBuscarID;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jCPFAnimalAlterar;
    private javax.swing.JButton jConsultAnimalAlterar;
    private javax.swing.JTextField jCorAnimal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField jIdadeAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeAnimal;
    private javax.swing.JTextField jRacaAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton jSexo1;
    private javax.swing.JRadioButton jSexo2;
    private javax.swing.JTable jTableAnimal;
    private javax.swing.JButton jdeletAnimal;
    private javax.swing.JTextField jidAnimal;
    // End of variables declaration//GEN-END:variables
}
