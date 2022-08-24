/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.sysytem;

/**
 *
 * @author ACER
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        newBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        staticsBtn = new javax.swing.JButton();
        issueBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newBtn.setBackground(new java.awt.Color(255, 255, 204));
        newBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        newBtn.setText("New Member");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        bookBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        bookBtn.setText("New Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        staticsBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        staticsBtn.setText("Statics");
        staticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(staticsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, -1));

        issueBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        issueBtn.setText("Issue Book");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        getContentPane().add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        returnBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        returnBtn.setText("Return Book");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 20, -1, -1));

        logoutBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        logoutBtn.setText("LogOut");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/management/sysytem/books-library-shelves-man.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_newBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
      new NewBook().setVisible(true);
    }//GEN-LAST:event_bookBtnActionPerformed

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        // TODO add your handling code here:
        new issueBook().setVisible(true);
    }//GEN-LAST:event_issueBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        new RetuenBook().setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void staticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticsBtnActionPerformed
        // TODO add your handling code here:
        new statics().setVisible(true);
    }//GEN-LAST:event_staticsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookBtn;
    private javax.swing.JButton issueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton staticsBtn;
    // End of variables declaration//GEN-END:variables
}
