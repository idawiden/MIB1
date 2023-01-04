/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class AdminAlien extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form AdminAlien
     */
    public AdminAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alienRubrik = new javax.swing.JLabel();
        registreraAlienKnapp = new javax.swing.JButton();
        redigeraInfoKnapp = new javax.swing.JButton();
        taBortAlienKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alienRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        alienRubrik.setText("Alien");

        registreraAlienKnapp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        registreraAlienKnapp.setText("Registrera alien");
        registreraAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAlienKnappActionPerformed(evt);
            }
        });

        redigeraInfoKnapp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        redigeraInfoKnapp.setText("Redigera alien-information");
        redigeraInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigeraInfoKnappActionPerformed(evt);
            }
        });

        taBortAlienKnapp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        taBortAlienKnapp.setText("Ta bort alien");
        taBortAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redigeraInfoKnapp)
                    .addComponent(alienRubrik)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registreraAlienKnapp)
                        .addGap(50, 50, 50)
                        .addComponent(taBortAlienKnapp)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(alienRubrik)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registreraAlienKnapp)
                    .addComponent(taBortAlienKnapp))
                .addGap(55, 55, 55)
                .addComponent(redigeraInfoKnapp)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreraAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAlienKnappActionPerformed
       
    }//GEN-LAST:event_registreraAlienKnappActionPerformed

    private void taBortAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienKnappActionPerformed
         new AdminTaBortAlien(idb).setVisible(true);
    }//GEN-LAST:event_taBortAlienKnappActionPerformed

    private void redigeraInfoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigeraInfoKnappActionPerformed
        new AndraInformationOmAlien(idb).setVisible(true);
    }//GEN-LAST:event_redigeraInfoKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alienRubrik;
    private javax.swing.JButton redigeraInfoKnapp;
    private javax.swing.JButton registreraAlienKnapp;
    private javax.swing.JButton taBortAlienKnapp;
    // End of variables declaration//GEN-END:variables
}
