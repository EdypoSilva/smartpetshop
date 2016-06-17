/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Animal;
import AllControlador.ControladorAnimal;
import AllControlador.ControladorCliente;
import AllControlador.ControladorSuporte;
import static BancoDeDados.BancoPetshop.BancoListAnimal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felly
 */
public class TelaRelatorioAnimal extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaRelatorioAnimal
     */
    public TelaRelatorioAnimal() {
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

        groupAnimal = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jRadioCPFdono = new javax.swing.JRadioButton();
        jCPFRelatorioCliente = new javax.swing.JFormattedTextField();
        jConsultarPorCPFdono = new javax.swing.JButton();
        jRadioNomeAnimal = new javax.swing.JRadioButton();
        jPesquisaNomeAnimal = new javax.swing.JTextField();
        jConsultarPorNome = new javax.swing.JButton();
        jRadioAllAnimal = new javax.swing.JRadioButton();
        jTableClientes = new javax.swing.JScrollPane();
        jTableRelatorioAnimal = new javax.swing.JTable();
        jImprimir = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
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
        jLabel5.setText("Relatório Animal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        groupAnimal.add(jRadioCPFdono);
        jRadioCPFdono.setText("CPF:");
        jRadioCPFdono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCPFdonoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioCPFdono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, 30));

        try {
            jCPFRelatorioCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCPFRelatorioCliente.setText("");
        jCPFRelatorioCliente.setEnabled(false);
        getContentPane().add(jCPFRelatorioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 30));

        jConsultarPorCPFdono.setText("@");
        jConsultarPorCPFdono.setToolTipText("");
        jConsultarPorCPFdono.setEnabled(false);
        jConsultarPorCPFdono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarPorCPFdonoActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultarPorCPFdono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 30, 30));

        groupAnimal.add(jRadioNomeAnimal);
        jRadioNomeAnimal.setText("Nome do Animal:");
        jRadioNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNomeAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioNomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, 30));

        jPesquisaNomeAnimal.setToolTipText("Digite o nome que deseja pesquisar \"Ex: Edypo Fellype\"");
        jPesquisaNomeAnimal.setEnabled(false);
        jPesquisaNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaNomeAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(jPesquisaNomeAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 140, 30));

        jConsultarPorNome.setText("@");
        jConsultarPorNome.setToolTipText("");
        jConsultarPorNome.setEnabled(false);
        jConsultarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarPorNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jConsultarPorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 30, 30));

        groupAnimal.add(jRadioAllAnimal);
        jRadioAllAnimal.setText("All Animais");
        jRadioAllAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAllAnimalActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioAllAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 90, 30));

        jTableRelatorioAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "Cor", "Raça", "Sexo", "CPF do Dono"
            }
        ));
        jTableClientes.setViewportView(jTableRelatorioAnimal);

        getContentPane().add(jTableClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 780, 240));

        jImprimir.setText("Imprimir");
        jImprimir.setEnabled(false);
        getContentPane().add(jImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 530, 90, -1));

        jCancelar.setText("Sair");
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 90, -1));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas NetBeans\\proje00235ety\\PetshopSmart\\IMG\\TelaCadastro.png")); // NOI18N
        jLabel13.setToolTipText(""); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(0, 0, 900, 600);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        ControladorSuporte.mudarTelaStatus(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void jRadioCPFdonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCPFdonoActionPerformed

        String cpf;
        cpf = jCPFRelatorioCliente.getText();
        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRelatorioAnimal.setModel(modelo);

        jRadioCPFdono.setEnabled(false);
        jCPFRelatorioCliente.setEnabled(true);
        jConsultarPorCPFdono.setEnabled(true);
        jPesquisaNomeAnimal.setEnabled(false);
        jConsultarPorNome.setEnabled(false);
        jRadioNomeAnimal.setEnabled(true);
        jRadioAllAnimal.setEnabled(true);
        jPesquisaNomeAnimal.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioCPFdonoActionPerformed

    private void jConsultarPorCPFdonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarPorCPFdonoActionPerformed

        String cpf;
        cpf = jCPFRelatorioCliente.getText();
        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRelatorioAnimal.setModel(modelo);

        String testExisteAnimal = ControladorAnimal.existeClienteAnimal(cpf);
        String testValidarCPF = ControladorCliente.validarCPF(cpf);
        if (testValidarCPF.equals("1") && testExisteAnimal.equals("1")) {
            for (int i = 0; i < BancoListAnimal.size(); i++) {
                Animal a = BancoListAnimal.get(i);
                if (a.getCpf().equals(cpf)) {
                    modelo.addRow(new String[]{a.getCodigoA() + "",
                        a.getNomeA(),
                        a.getIdade() + "",
                        a.getCor(),
                        a.getRaca(),
                        a.getSexo(),});
                }
            }
            jTableRelatorioAnimal.setModel(modelo);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarPorCPFdonoActionPerformed

    private void jRadioNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNomeAnimalActionPerformed

        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo", "CPF do Dono"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRelatorioAnimal.setModel(modelo);

        if (jRadioNomeAnimal.isSelected() == true) {
            jRadioNomeAnimal.setEnabled(false);
            jRadioAllAnimal.setEnabled(true);
            jRadioCPFdono.setEnabled(true);
            jCPFRelatorioCliente.setEnabled(false);
            jConsultarPorCPFdono.setEnabled(false);
            jPesquisaNomeAnimal.setEnabled(true);
            jConsultarPorNome.setEnabled(true);
            jCPFRelatorioCliente.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNomeAnimalActionPerformed

    private void jPesquisaNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaNomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPesquisaNomeAnimalActionPerformed

    private void jRadioAllAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAllAnimalActionPerformed

        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo", "CPF do Dono"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRelatorioAnimal.setModel(modelo);

        if (jRadioAllAnimal.isSelected() == true) {
            jRadioAllAnimal.setEnabled(false);
            jRadioCPFdono.setEnabled(true);
            jRadioNomeAnimal.setEnabled(true);
            jCPFRelatorioCliente.setEnabled(false);
            jConsultarPorCPFdono.setEnabled(false);
            jPesquisaNomeAnimal.setEnabled(false);
            jConsultarPorNome.setEnabled(false);
            jCPFRelatorioCliente.setText("");
            jConsultarPorNome.setText("");
            jPesquisaNomeAnimal.setText("");
        }

        for (int i = 0; i < BancoListAnimal.size(); i++) {
            Animal a = BancoListAnimal.get(i);
            if (a.getCpf().equals(a.getCpf())) {
                modelo.addRow(new String[]{a.getCodigoA() + "",
                    a.getNomeA(),
                    a.getIdade() + "",
                    a.getCor(),
                    a.getRaca(),
                    a.getSexo(),
                    a.getCpf(),});
            }
        }
        jTableRelatorioAnimal.setModel(modelo);

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioAllAnimalActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCancelarActionPerformed

    private void jConsultarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarPorNomeActionPerformed

        String nomeAnimal = jPesquisaNomeAnimal.getText();
        Object[] colunas = {"ID", "Nome", "Idade", "Cor", "Raça", "Sexo", "CPF do Dono"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(colunas);
        jTableRelatorioAnimal.setModel(modelo);

        for (int i = 0; i < BancoListAnimal.size(); i++) {
            Animal a = BancoListAnimal.get(i);
            if (a.getNomeA().toLowerCase().contains(nomeAnimal.toLowerCase())) {
                modelo.addRow(new String[]{a.getCodigoA() + "",
                    a.getNomeA(),
                    a.getIdade() + "",
                    a.getCor(),
                    a.getRaca(),
                    a.getSexo(),
                    a.getCpf(),});
            }
        }
        jTableRelatorioAnimal.setModel(modelo);
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarPorNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup groupAnimal;
    private javax.swing.JFormattedTextField jCPFRelatorioCliente;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jConsultarPorCPFdono;
    private javax.swing.JButton jConsultarPorNome;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jImprimir;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jPesquisaNomeAnimal;
    private javax.swing.JRadioButton jRadioAllAnimal;
    private javax.swing.JRadioButton jRadioCPFdono;
    private javax.swing.JRadioButton jRadioNomeAnimal;
    private javax.swing.JScrollPane jTableClientes;
    private javax.swing.JTable jTableRelatorioAnimal;
    // End of variables declaration//GEN-END:variables
}
