/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTelas;

import AllClass.Repositorio.RepositorioCliente;
import AllClass.Repositorio.RepositorioCompra;
import AllSuporte.Suporte;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Felly
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        areaPrincipal = new javax.swing.JDesktopPane();
        TelaMenuIMG = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jInserir = new javax.swing.JMenu();
        jInserirCliente = new javax.swing.JMenu();
        jCCliente = new javax.swing.JMenuItem();
        jACliente = new javax.swing.JMenuItem();
        jInserirAnimal = new javax.swing.JMenu();
        jCAnimal = new javax.swing.JMenuItem();
        jAAnimal = new javax.swing.JMenuItem();
        jInserirProduto = new javax.swing.JMenu();
        jCProduto = new javax.swing.JMenuItem();
        jAProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        RealizarCompra = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jListar = new javax.swing.JMenu();
        jListarCliente = new javax.swing.JMenu();
        jLCliente = new javax.swing.JMenuItem();
        jLClienteeAnimal = new javax.swing.JMenuItem();
        jLAnimal = new javax.swing.JMenuItem();
        jLProduto = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jAtualizarEstoque = new javax.swing.JMenuItem();
        jFinalizar = new javax.swing.JMenu();
        jFAnimal = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();
        jFecharSIstema = new javax.swing.JMenuItem();
        jBloquearSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setMaximumSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        TelaMenuIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Felly\\Desktop\\Programas Java\\PetshopSmart\\IMG\\TelaMenu.jpg")); // NOI18N
        areaPrincipal.add(TelaMenuIMG);
        TelaMenuIMG.setBounds(0, 0, 900, 600);

        getContentPane().add(areaPrincipal);
        areaPrincipal.setBounds(0, -2, 900, 600);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(900, 600));

        jInserir.setText("Inserir");

        jInserirCliente.setText("Cliente");

        jCCliente.setText("Cadastrar");
        jCCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCClienteActionPerformed(evt);
            }
        });
        jInserirCliente.add(jCCliente);

        jACliente.setText("Alterar & Remover");
        jACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAClienteActionPerformed(evt);
            }
        });
        jInserirCliente.add(jACliente);

        jInserir.add(jInserirCliente);
        jInserirCliente.getAccessibleContext().setAccessibleDescription("");

        jInserirAnimal.setText("Animal");

        jCAnimal.setText("Cadastrar");
        jCAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAnimalActionPerformed(evt);
            }
        });
        jInserirAnimal.add(jCAnimal);

        jAAnimal.setText("Alterar & Remover");
        jAAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAAnimalActionPerformed(evt);
            }
        });
        jInserirAnimal.add(jAAnimal);

        jInserir.add(jInserirAnimal);

        jInserirProduto.setText("Produto");

        jCProduto.setText("Cadastrar");
        jCProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProdutoActionPerformed(evt);
            }
        });
        jInserirProduto.add(jCProduto);

        jAProduto.setText("Alterar & Remover");
        jAProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAProdutoActionPerformed(evt);
            }
        });
        jInserirProduto.add(jAProduto);

        jInserir.add(jInserirProduto);

        jMenu1.setText("Serviço");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Alterar & Remover");
        jMenu1.add(jMenuItem2);

        jInserir.add(jMenu1);

        jMenuBar1.add(jInserir);

        jMenu3.setText("Comprar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        RealizarCompra.setText("Realizar Compra");
        RealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCompraActionPerformed(evt);
            }
        });
        jMenu3.add(RealizarCompra);

        jMenuItem5.setText("Remover Compra");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jListar.setText("Relatórios");

        jListarCliente.setText("Cliente");

        jLCliente.setText("Cliente");
        jLCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLClienteActionPerformed(evt);
            }
        });
        jListarCliente.add(jLCliente);

        jLClienteeAnimal.setText("Cliente&Animal");
        jListarCliente.add(jLClienteeAnimal);

        jListar.add(jListarCliente);

        jLAnimal.setText("Animal");
        jListar.add(jLAnimal);

        jLProduto.setText("Produto");
        jLProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLProdutoActionPerformed(evt);
            }
        });
        jListar.add(jLProduto);

        jMenuItem4.setText("Compra");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jListar.add(jMenuItem4);

        jMenuBar1.add(jListar);

        jMenu2.setText("Estoque");

        jAtualizarEstoque.setText("Atualizar Produto");
        jAtualizarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarEstoqueActionPerformed(evt);
            }
        });
        jMenu2.add(jAtualizarEstoque);

        jMenuBar1.add(jMenu2);

        jFinalizar.setText("Finalizar");

        jFAnimal.setText("Acompanhamento Animal");
        jFinalizar.add(jFAnimal);

        jMenuBar1.add(jFinalizar);

        jSair.setText("Sair");

        jFecharSIstema.setText("Fechar Sistema");
        jFecharSIstema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharSIstemaActionPerformed(evt);
            }
        });
        jSair.add(jFecharSIstema);

        jBloquearSistema.setText("Bloquear Sistema");
        jBloquearSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloquearSistemaActionPerformed(evt);
            }
        });
        jSair.add(jBloquearSistema);

        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 916, 657);
    }// </editor-fold>//GEN-END:initComponents

    private void jBloquearSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloquearSistemaActionPerformed

        this.dispose();
        try {
            new TelaLogin().setVisible(true);
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBloquearSistemaActionPerformed

    private void jFecharSIstemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharSIstemaActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jFecharSIstemaActionPerformed

    private void jCProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProdutoActionPerformed

        if (!Suporte.verificandoTela) {
            TelaCadastroProduto produto = new TelaCadastroProduto();
            areaPrincipal.add(produto);
            produto.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jCProdutoActionPerformed

    private void jCAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAnimalActionPerformed

        if (!Suporte.verificandoTela) {
            TelaCadastroAnimal animal = new TelaCadastroAnimal();
            areaPrincipal.add(animal);
            animal.setVisible(true);
            Suporte.setMudarStatus(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAnimalActionPerformed

    private void jCClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCClienteActionPerformed

        if (!Suporte.verificandoTela) {
            TelaCadastroCliente cliente = new TelaCadastroCliente();
            areaPrincipal.add(cliente);
            cliente.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jCClienteActionPerformed

    private void jLClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLClienteActionPerformed

        String Consult;

        Consult = JOptionPane.showInputDialog("Digite o CPF do Cliente a consultar: ");
        RepositorioCliente.setConsultaCliente(Consult);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String cpf;

        cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente: ");
        RepositorioCompra.setListarCompras(cpf);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void RealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCompraActionPerformed

        if (!Suporte.verificandoTela) {
            TelaCompra compra = new TelaCompra();
            areaPrincipal.add(compra);
            compra.setVisible(true);
            Suporte.setMudarStatus(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarCompraActionPerformed

    private void jAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAClienteActionPerformed

        if (!Suporte.verificandoTela) {
            TelaAlterarCliente a_cliente = new TelaAlterarCliente();
            areaPrincipal.add(a_cliente);
            a_cliente.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jAClienteActionPerformed

    private void jLProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLProdutoActionPerformed

        if (!Suporte.verificandoTela) {
            TelaRelatorioCompra a_relatorioCompra = new TelaRelatorioCompra();
            areaPrincipal.add(a_relatorioCompra);
            a_relatorioCompra.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLProdutoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        if (!Suporte.verificandoTela) {
            TelaCompraRemover removeCompra = new TelaCompraRemover();
            areaPrincipal.add(removeCompra);
            removeCompra.setVisible(true);
            Suporte.setMudarStatus(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jAtualizarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarEstoqueActionPerformed

        if (!Suporte.verificandoTela) {
            TelaEstoque estoque = new TelaEstoque();
            areaPrincipal.add(estoque);
            estoque.setVisible(true);
            Suporte.setMudarStatus(true);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jAtualizarEstoqueActionPerformed

    private void jAAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAAnimalActionPerformed

        if (!Suporte.verificandoTela) {
            TelaAlterarAnimal alterarAnimal = new TelaAlterarAnimal();
            areaPrincipal.add(alterarAnimal);
            alterarAnimal.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jAAnimalActionPerformed

    private void jAProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAProdutoActionPerformed

        if (!Suporte.verificandoTela) {
            TelaAlterarProduto alterarProduto = new TelaAlterarProduto();
            areaPrincipal.add(alterarProduto);
            alterarProduto.setVisible(true);
            Suporte.setMudarStatus(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jAProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem RealizarCompra;
    private javax.swing.JLabel TelaMenuIMG;
    private javax.swing.JDesktopPane areaPrincipal;
    private javax.swing.JMenuItem jAAnimal;
    private javax.swing.JMenuItem jACliente;
    private javax.swing.JMenuItem jAProduto;
    private javax.swing.JMenuItem jAtualizarEstoque;
    private javax.swing.JMenuItem jBloquearSistema;
    private javax.swing.JMenuItem jCAnimal;
    private javax.swing.JMenuItem jCCliente;
    private javax.swing.JMenuItem jCProduto;
    private javax.swing.JMenuItem jFAnimal;
    private javax.swing.JMenuItem jFecharSIstema;
    private javax.swing.JMenu jFinalizar;
    private javax.swing.JMenu jInserir;
    private javax.swing.JMenu jInserirAnimal;
    private javax.swing.JMenu jInserirCliente;
    private javax.swing.JMenu jInserirProduto;
    private javax.swing.JMenuItem jLAnimal;
    private javax.swing.JMenuItem jLCliente;
    private javax.swing.JMenuItem jLClienteeAnimal;
    private javax.swing.JMenuItem jLProduto;
    private javax.swing.JMenu jListar;
    private javax.swing.JMenu jListarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jSair;
    // End of variables declaration//GEN-END:variables
}
