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
public class AdministratorMeny extends javax.swing.JFrame {
    private static InfDB idb;

    /**
     * Creates new form AdministratorMeny
     */
    public AdministratorMeny(InfDB idb) {
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

        valkommenRubrik = new javax.swing.JLabel();
        valjAlien = new javax.swing.JButton();
        valjAgent = new javax.swing.JButton();
        kategoriRubrik = new javax.swing.JLabel();
        valjUtrustning = new javax.swing.JButton();
        loggaUtKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valkommenRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        valkommenRubrik.setText("Välkommen tillbaka administratör!");

        valjAlien.setText("Alien");
        valjAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAlienActionPerformed(evt);
            }
        });

        valjAgent.setText("Agent");
        valjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAgentActionPerformed(evt);
            }
        });

        kategoriRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        kategoriRubrik.setText("Välj kategori:");

        valjUtrustning.setText("Ta bort utrustning");
        valjUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjUtrustningActionPerformed(evt);
            }
        });

        loggaUtKnapp.setText("Logga ut");
        loggaUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loggaUtKnapp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valkommenRubrik)
                        .addComponent(kategoriRubrik)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(valjAlien)
                            .addGap(26, 26, 26)
                            .addComponent(valjAgent)
                            .addGap(23, 23, 23)
                            .addComponent(valjUtrustning))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(valkommenRubrik)
                .addGap(58, 58, 58)
                .addComponent(kategoriRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjAlien)
                    .addComponent(valjAgent)
                    .addComponent(valjUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(loggaUtKnapp)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valjUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjUtrustningActionPerformed
         new TaBortUtrustning(idb).setVisible(true); //gör TaBortUtrustning synlig
    }//GEN-LAST:event_valjUtrustningActionPerformed

    private void valjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAgentActionPerformed
    new AdminAgent(idb).setVisible(true); //gör AdminAgent menyn synlig 
    }//GEN-LAST:event_valjAgentActionPerformed

    private void valjAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAlienActionPerformed
         new AdminAlien(idb).setVisible(true); //gör adminAlien meny synlig 
    }//GEN-LAST:event_valjAlienActionPerformed

    private void loggaUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtKnappActionPerformed
       new InloggningsSida(idb).setVisible(true);
       
    }//GEN-LAST:event_loggaUtKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorMeny(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kategoriRubrik;
    private javax.swing.JButton loggaUtKnapp;
    private javax.swing.JButton valjAgent;
    private javax.swing.JButton valjAlien;
    private javax.swing.JButton valjUtrustning;
    private javax.swing.JLabel valkommenRubrik;
    // End of variables declaration//GEN-END:variables
}
