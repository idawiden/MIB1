/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfException;
import oru.inf.InfDB;


/**
 *
 * @author filippabostrom
 */
public class adminAgent extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form adminAgent
     */
    public adminAgent(InfDB idb) {
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

        agentRubrik = new javax.swing.JLabel();
        registreraAgent = new javax.swing.JButton();
        informationOmAgent = new javax.swing.JButton();
        tilldelaAdministratorStatus = new javax.swing.JButton();
        redigeraAgentInfo = new javax.swing.JButton();
        taBortAgent = new javax.swing.JButton();
        andraOmradeschef = new javax.swing.JButton();
        andraKontorschef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agentRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        agentRubrik.setText("Agent");

        registreraAgent.setText("Registrera agent");
        registreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentActionPerformed(evt);
            }
        });

        informationOmAgent.setText("Information om agent");
        informationOmAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationOmAgentActionPerformed(evt);
            }
        });

        tilldelaAdministratorStatus.setText("Tilldela administratörstatus");
        tilldelaAdministratorStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilldelaAdministratorStatusActionPerformed(evt);
            }
        });

        redigeraAgentInfo.setText("Redigera agent-information");

        taBortAgent.setText("Ta bort agent");

        andraOmradeschef.setText("Ändra områdeschef");
        andraOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraOmradeschefActionPerformed(evt);
            }
        });

        andraKontorschef.setText("Ändra kontorchef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redigeraAgentInfo)
                    .addComponent(tilldelaAdministratorStatus)
                    .addComponent(informationOmAgent)
                    .addComponent(agentRubrik)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registreraAgent)
                            .addComponent(andraOmradeschef))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(andraKontorschef)
                            .addComponent(taBortAgent))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(agentRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registreraAgent)
                    .addComponent(taBortAgent))
                .addGap(18, 18, 18)
                .addComponent(informationOmAgent)
                .addGap(18, 18, 18)
                .addComponent(tilldelaAdministratorStatus)
                .addGap(18, 18, 18)
                .addComponent(redigeraAgentInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraOmradeschef)
                    .addComponent(andraKontorschef))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tilldelaAdministratorStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilldelaAdministratorStatusActionPerformed
       new tilldelaAdminStatus(idb).setVisible(true);
    }//GEN-LAST:event_tilldelaAdministratorStatusActionPerformed

    private void informationOmAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationOmAgentActionPerformed
       new visaAllInformationAgent(idb).setVisible(true);
    }//GEN-LAST:event_informationOmAgentActionPerformed

    private void andraOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraOmradeschefActionPerformed
        new ÄndraAgentSomÄrOmrådeschef(idb).setVisible(true);
    }//GEN-LAST:event_andraOmradeschefActionPerformed

    private void registreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentActionPerformed
new RegistreraAgent(idb).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_registreraAgentActionPerformed

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
            java.util.logging.Logger.getLogger(adminAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agentRubrik;
    private javax.swing.JButton andraKontorschef;
    private javax.swing.JButton andraOmradeschef;
    private javax.swing.JButton informationOmAgent;
    private javax.swing.JButton redigeraAgentInfo;
    private javax.swing.JButton registreraAgent;
    private javax.swing.JButton taBortAgent;
    private javax.swing.JButton tilldelaAdministratorStatus;
    // End of variables declaration//GEN-END:variables
}
