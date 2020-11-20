/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Entidades.Funcionario;
import Entidades.Produto;
import Models.ModelFuncionario;
import Models.ModelProduto;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class FrameMenu2 extends javax.swing.JFrame {

    ModelFuncionario mf = new ModelFuncionario();
    ModelProduto mp = new ModelProduto();
    Funcionario logado = new Funcionario();
    String[] nomeP = new String[1000];
    int R = 0; //cuidar do array
    /**
     * Creates new form FrameMenu2
     */
    public FrameMenu2() {
        initComponents();
    }
    
    public boolean todosProdutos() {
        try {
            for (Produto p : mp.listaProdutos()) {
                if (p.getEstoque() <= p.getEstoqueMin()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            return false;
        }

    }
    
    public void aviso() {
        if (todosProdutos()==true) {

            FrameAviso fa = new FrameAviso();
            Desktop.add(fa);
            fa.montarTabela();
            //fa.R = this.R;
            fa.show();

        }
    }
    
    private void openForm(JInternalFrame f){
        Desktop.add(f);
        //f.centralizar();
        f.show();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cliente2 = new javax.swing.JButton();
        Vendas2 = new javax.swing.JButton();
        Produtos2 = new javax.swing.JButton();
        Fornecedores2 = new javax.swing.JButton();
        Fornecedores3 = new javax.swing.JButton();
        Desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Cliente2.setText("Cliente");
        Cliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cliente2ActionPerformed(evt);
            }
        });

        Vendas2.setText("Vendas");
        Vendas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vendas2ActionPerformed(evt);
            }
        });

        Produtos2.setText("Produtos");
        Produtos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Produtos2ActionPerformed(evt);
            }
        });

        Fornecedores2.setText("Fornecedores");
        Fornecedores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fornecedores2ActionPerformed(evt);
            }
        });

        Fornecedores3.setText(". . .");
        Fornecedores3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fornecedores3ActionPerformed(evt);
            }
        });

        Desktop.setMaximumSize(new java.awt.Dimension(571, 478));
        Desktop.setMinimumSize(new java.awt.Dimension(571, 478));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vendas2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Produtos2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fornecedores2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fornecedores3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Cliente2, Fornecedores2, Fornecedores3, Produtos2, Vendas2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Vendas2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Produtos2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fornecedores2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fornecedores3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Cliente2, Fornecedores2, Fornecedores3, Produtos2, Vendas2});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cliente2ActionPerformed
        // TODO add your handling code here:
        openForm(new FrameClientes());
    }//GEN-LAST:event_Cliente2ActionPerformed

    private void Vendas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vendas2ActionPerformed
        // TODO add your handling code here:
        //openForm(new FrameVenda());
        FrameVenda fv = new FrameVenda();
        fv.logado = this.logado;
        Desktop.add(fv);
        fv.show();
    }//GEN-LAST:event_Vendas2ActionPerformed

    private void Produtos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Produtos2ActionPerformed
        // TODO add your handling code here:
        openForm(new FrameProduto());
    }//GEN-LAST:event_Produtos2ActionPerformed

    private void Fornecedores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fornecedores2ActionPerformed
        // TODO add your handling code here:
        openForm(new FrameFornecedor());
    }//GEN-LAST:event_Fornecedores2ActionPerformed

    private void Fornecedores3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fornecedores3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Fornecedores3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        todosProdutos();
        aviso();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrameMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cliente2;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton Fornecedores2;
    private javax.swing.JButton Fornecedores3;
    private javax.swing.JButton Produtos2;
    private javax.swing.JButton Vendas2;
    // End of variables declaration//GEN-END:variables
}
