/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JInternalFrame;

/**
 *
 * @author Luan
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
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

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuGFuncionario = new javax.swing.JMenuItem();
        MenuGAdcFuncionario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ManuGCliente = new javax.swing.JMenuItem();
        MenuGAdcCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuGVendas = new javax.swing.JMenuItem();
        MenuGVender = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuGProdutos = new javax.swing.JMenuItem();
        MenuGAdcProduto = new javax.swing.JMenuItem();
        MenuGFornecedor = new javax.swing.JMenuItem();
        MenuGAdcFornecedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuGSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Gerente");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        jMenu1.setText("RH");

        MenuGFuncionario.setText("Funcionários");
        MenuGFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGFuncionario);

        MenuGAdcFuncionario.setText("Adicionar Funcionários");
        MenuGAdcFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGAdcFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(MenuGAdcFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Clientes");

        ManuGCliente.setText("Clientes");
        jMenu3.add(ManuGCliente);

        MenuGAdcCliente.setText("Adicionar Cliente");
        MenuGAdcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGAdcClienteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuGAdcCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vendas");

        MenuGVendas.setText("Vendas");
        jMenu4.add(MenuGVendas);

        MenuGVender.setText("Realizar Venda");
        jMenu4.add(MenuGVender);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Produtos");

        MenuGProdutos.setText("Produtos");
        jMenu5.add(MenuGProdutos);

        MenuGAdcProduto.setText("Adicionar Produto");
        MenuGAdcProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGAdcProdutoActionPerformed(evt);
            }
        });
        jMenu5.add(MenuGAdcProduto);

        MenuGFornecedor.setText("Fornecedores");
        jMenu5.add(MenuGFornecedor);

        MenuGAdcFornecedor.setText("Adicionar Fornecedor");
        MenuGAdcFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGAdcFornecedorActionPerformed(evt);
            }
        });
        jMenu5.add(MenuGAdcFornecedor);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Ações");

        MenuGSair.setText("Sair");
        jMenu2.add(MenuGSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuGFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGFuncionarioActionPerformed
        // TODO add your handling code here:
        
        openForm(new FrameFuncionario());
        
    }//GEN-LAST:event_MenuGFuncionarioActionPerformed

    private void openForm(JInternalFrame f){
        Desktop.add(f);
        f.show();
    }
    
    private void MenuGAdcFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGAdcFuncionarioActionPerformed
        // TODO add your handling code here:
        /*FrameAdcFuncionario adcFunc = new FrameAdcFuncionario();
        Desktop.add(adcFunc);
        adcFunc.show();*/
        openForm(new FrameAdcFuncionario());
        
    }//GEN-LAST:event_MenuGAdcFuncionarioActionPerformed

    private void MenuGAdcFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGAdcFornecedorActionPerformed
        // TODO add your handling code here:
        //FrameAdcFornecedor adcForn = new FrameAdcFornecedor();
        openForm(new FrameAdcFornecedor());
    }//GEN-LAST:event_MenuGAdcFornecedorActionPerformed

    private void MenuGAdcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGAdcClienteActionPerformed
        // TODO add your handling code here:
        openForm(new FrameAdcCliente());
    }//GEN-LAST:event_MenuGAdcClienteActionPerformed

    private void MenuGAdcProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGAdcProdutoActionPerformed
        // TODO add your handling code here:
        
        openForm(new FrameAdcProduto());
    }//GEN-LAST:event_MenuGAdcProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ManuGCliente;
    private javax.swing.JMenuItem MenuGAdcCliente;
    private javax.swing.JMenuItem MenuGAdcFornecedor;
    private javax.swing.JMenuItem MenuGAdcFuncionario;
    private javax.swing.JMenuItem MenuGAdcProduto;
    private javax.swing.JMenuItem MenuGFornecedor;
    private javax.swing.JMenuItem MenuGFuncionario;
    private javax.swing.JMenuItem MenuGProdutos;
    private javax.swing.JMenuItem MenuGSair;
    private javax.swing.JMenuItem MenuGVendas;
    private javax.swing.JMenuItem MenuGVender;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
