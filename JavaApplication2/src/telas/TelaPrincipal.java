/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Senai
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        btnUser = new javax.swing.JLabel();
        btnFrutas = new javax.swing.JLabel();
        btnCarrinho = new javax.swing.JLabel();
        btnProdutosLimpeza = new javax.swing.JLabel();
        btnProdutosLimpeza1 = new javax.swing.JLabel();
        tela = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 40, 80, 90));

        btnFrutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFrutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFrutasMouseClicked(evt);
            }
        });
        getContentPane().add(btnFrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 470, 410, 480));

        btnCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrinhoMouseClicked(evt);
            }
        });
        getContentPane().add(btnCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 50, 80, 90));

        btnProdutosLimpeza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutosLimpeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosLimpezaMouseClicked(evt);
            }
        });
        getContentPane().add(btnProdutosLimpeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 410, 480));

        btnProdutosLimpeza1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutosLimpeza1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdutosLimpeza1MouseClicked(evt);
            }
        });
        getContentPane().add(btnProdutosLimpeza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 410, 480));

        tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Inserir um subtítulo.png"))); // NOI18N
        tela.setText("jLabel2");
        getContentPane().add(tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        // TODO add your handling code here:
        //colocar a logica de mudar de tela
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnProdutosLimpezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosLimpezaMouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        new TelaCarne().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosLimpezaMouseClicked

    private void btnFrutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFrutasMouseClicked
        // TODO add your handling code here:
        new TelaFrutas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFrutasMouseClicked

    private void btnCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrinhoMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        new TelaUsuario_1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCarrinhoMouseClicked

    private void btnProdutosLimpeza1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosLimpeza1MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        new TelaProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosLimpeza1MouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCarrinho;
    private javax.swing.JLabel btnFrutas;
    private javax.swing.JLabel btnProdutosLimpeza;
    private javax.swing.JLabel btnProdutosLimpeza1;
    private javax.swing.JLabel btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tela;
    // End of variables declaration//GEN-END:variables
}
