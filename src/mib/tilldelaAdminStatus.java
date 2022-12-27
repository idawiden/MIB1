/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import oru.inf.InfException;
import oru.inf.InfDB;
import javax.swing.JOptionPane;

/**
 *
 * @author filip
 */
public class tilldelaAdminStatus extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form tilldelaAdminStatus
     */
    public tilldelaAdminStatus(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllBoxMedAgentNamn();
    }
    
     private void fyllBoxMedAgentNamn() {
        String fraga = "SELECT namn from Agent";
        
        ArrayList <String> allaAgentNamn;
        
        try {
            allaAgentNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAgentNamn) {
                fyllBoxMedAgenter.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tilldelaAdminStatusRubrik = new javax.swing.JLabel();
        skrivInAgentRubrik = new javax.swing.JLabel();
        ändraStatusPåAgent = new javax.swing.JButton();
        valjStatusBox = new javax.swing.JComboBox<>();
        fyllBoxMedAgenter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tilldelaAdminStatusRubrik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tilldelaAdminStatusRubrik.setText("Tilldela administratörstatus");

        skrivInAgentRubrik.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skrivInAgentRubrik.setText("Skriv in Agent");

        ändraStatusPåAgent.setText("ändra status");
        ändraStatusPåAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraStatusPåAgentActionPerformed(evt);
            }
        });

        valjStatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J", "N" }));
        valjStatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjStatusBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(tilldelaAdminStatusRubrik)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ändraStatusPåAgent)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fyllBoxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(skrivInAgentRubrik)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valjStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tilldelaAdminStatusRubrik)
                .addGap(41, 41, 41)
                .addComponent(skrivInAgentRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjStatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fyllBoxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(ändraStatusPåAgent)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ändraStatusPåAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraStatusPåAgentActionPerformed
        
        
        
        try {
        String agent = fyllBoxMedAgenter.getSelectedItem().toString();
        String valdStatus = valjStatusBox.getSelectedItem().toString();
        String fraga = "SELECT Administrator from agent where Namn = " + "'" + agent + "'";
       
        idb.update("UPDATE Agent SET Administrator = " + "'" + valdStatus + "'" + "where namn = " + "'" + agent + "'");
        tilldelaAdminStatusRubrik.setText("Administratörstatus har ändrats");
        
        
 
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel"); 
            System.out.println(e.getMessage());
               
                }
    
    }//GEN-LAST:event_ändraStatusPåAgentActionPerformed

    private void valjStatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjStatusBoxActionPerformed
        
    }//GEN-LAST:event_valjStatusBoxActionPerformed

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
            java.util.logging.Logger.getLogger(tilldelaAdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tilldelaAdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tilldelaAdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tilldelaAdminStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tilldelaAdminStatus(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> fyllBoxMedAgenter;
    private javax.swing.JLabel skrivInAgentRubrik;
    private javax.swing.JLabel tilldelaAdminStatusRubrik;
    private javax.swing.JComboBox<String> valjStatusBox;
    private javax.swing.JButton ändraStatusPåAgent;
    // End of variables declaration//GEN-END:variables
}