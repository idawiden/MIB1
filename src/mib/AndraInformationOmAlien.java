/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class AndraInformationOmAlien extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form AndraInformationOmAlien
     */
    public AndraInformationOmAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllBoxMedNamn();
        skrivInInformationRubrik.setVisible(false);
        skrivInNytt.setVisible(false);
        ändraKnapp.setVisible(false);
        valjInfo.setVisible(false);
        rubrikVadVillAndra.setVisible(false);
        boxMedAgenter.setVisible(false);
        valjAgentKnapp.setVisible(false);
        boxMedRaser.setVisible(false);
        valjRasKnapp.setVisible(false);
       
        skrivInExtraInfo.setVisible(false);
        skrivInInformationRubrik.setVisible(false);
        extraInfoRubrik.setVisible(false);
        valjRasIgen.setVisible(false);
        platsBox.setVisible(false);
        valjPlatsKnapp.setVisible(false);
        
        
        
        
    }
    
    private void fyllBoxMedNamn() {
        String fraga = "SELECT namn from Alien";
        
        ArrayList <String> allaAlienNamn;
        
        try {
            allaAlienNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAlienNamn) {
                boxAlienNamn.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }
    
    
    private void fyllBoxMedAgentNamn() {
        
         
        String fraga = "SELECT namn from Agent";
        
        ArrayList <String> allaAgentNamn;
        
        try {
            allaAgentNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAgentNamn) {
                boxMedAgenter.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }

    
    private void fyllBoxMedPlatsNamn() {
        
         
        String fraga = "SELECT benamning from plats";
        
        ArrayList <String> allaPlatsNamn;
        
        try {
            allaPlatsNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaPlatsNamn) {
                platsBox.addItem(namn);   
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

        rubrikVadVillAndra = new javax.swing.JLabel();
        valjInfo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxAlienNamn = new javax.swing.JComboBox<>();
        valjAlien = new javax.swing.JButton();
        skrivInNytt = new javax.swing.JTextField();
        ändraKnapp = new javax.swing.JButton();
        skrivInInformationRubrik = new javax.swing.JLabel();
        boxMedAgenter = new javax.swing.JComboBox<>();
        valjAgentKnapp = new javax.swing.JButton();
        boxMedRaser = new javax.swing.JComboBox<>();
        valjRasKnapp = new javax.swing.JButton();
        skrivInExtraInfo = new javax.swing.JTextField();
        extraInfoRubrik = new javax.swing.JLabel();
        valjRasIgen = new javax.swing.JButton();
        platsBox = new javax.swing.JComboBox<>();
        valjPlatsKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrikVadVillAndra.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        rubrikVadVillAndra.setText("Vad vill du ändra?");

        valjInfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alien_ID", "Losenord", "Plats", "Namn", "Ansvarig_Agent", "Telefon", "Ras" }));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Välj alien");

        valjAlien.setText("Välj");
        valjAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAlienActionPerformed(evt);
            }
        });

        skrivInNytt.setColumns(8);

        ändraKnapp.setText("Ändra");
        ändraKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraKnappActionPerformed(evt);
            }
        });

        skrivInInformationRubrik.setText("Skriv in ny infromation");

        valjAgentKnapp.setText("Välj Agent");
        valjAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAgentKnappActionPerformed(evt);
            }
        });

        boxMedRaser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Squid", "Boglodite", "Worm" }));

        valjRasKnapp.setText("Välj ras");
        valjRasKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjRasKnappActionPerformed(evt);
            }
        });

        skrivInExtraInfo.setColumns(6);

        extraInfoRubrik.setText("Extra information");

        valjRasIgen.setText("Välj");
        valjRasIgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjRasIgenActionPerformed(evt);
            }
        });

        valjPlatsKnapp.setText("Välj plats");
        valjPlatsKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjPlatsKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boxMedRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(valjRasIgen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(extraInfoRubrik)
                                .addGap(18, 18, 18)
                                .addComponent(skrivInExtraInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                .addComponent(ändraKnapp))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(valjInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(skrivInNytt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rubrikVadVillAndra)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(29, 29, 29)
                                        .addComponent(boxAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valjAlien)
                                    .addComponent(skrivInInformationRubrik)))
                            .addComponent(valjAgentKnapp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(valjRasKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valjPlatsKnapp)
                        .addGap(28, 28, 28)
                        .addComponent(platsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjAlien))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rubrikVadVillAndra)
                    .addComponent(skrivInInformationRubrik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(skrivInNytt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valjAgentKnapp)
                            .addComponent(valjRasKnapp))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(platsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valjPlatsKnapp))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMedRaser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjRasIgen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(skrivInExtraInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extraInfoRubrik))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ändraKnapp)
                        .addGap(16, 16, 16))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valjAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAlienActionPerformed
        valjInfo.setVisible(true);
        rubrikVadVillAndra.setVisible(true);
        skrivInInformationRubrik.setVisible(true);
        skrivInNytt.setVisible(true);
        ändraKnapp.setVisible(true);
        valjAgentKnapp.setVisible(true);
        valjRasKnapp.setVisible(true);
        valjPlatsKnapp.setVisible(true);
        
    }//GEN-LAST:event_valjAlienActionPerformed

    private void ändraKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraKnappActionPerformed
        
        try{
        String alienNamn =  boxAlienNamn.getSelectedItem().toString();
        String egenskaper = valjInfo.getSelectedItem().toString();  
        String nyInfo = skrivInNytt.getText();
        
        if(egenskaper.equals("Alien_ID")){
        String nyttId = nyInfo;
        int alienIDInt = Integer.parseInt(nyttId);
        idb.update("UPDATE alien SET Alien_ID = "+ alienIDInt + " where namn = "+ "'" + alienNamn +"'");
        rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        
        
        
        if(egenskaper.equals("Namn")){
        idb.update("UPDATE alien SET Namn = "+ "'"+ nyInfo + "'" + " where namn = "+ "'" + alienNamn +"'");
        rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        if(egenskaper.equals("Plats")){
        String plats = platsBox.getSelectedItem().toString();
        String fragaPlats = "Select Plats_ID from Plats where Benamning =" + "'" +plats+"'";
        String resultatInt = idb.fetchSingle(fragaPlats);
        int platsInt = Integer.parseInt(resultatInt);
        idb.update("UPDATE alien SET Plats = "+ platsInt + " where namn = "+ "'" + alienNamn +"'");
        rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        
        if(egenskaper.equals("Telefon")){
        idb.update("UPDATE alien SET Telefon = "+ "'"+ nyInfo + "'" + " where namn = "+ "'" + alienNamn +"'");
        rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        
        if(egenskaper.equals("Ansvarig_Agent")){
         
        
         String hamtaNamn = boxMedAgenter.getSelectedItem().toString();
         String fragaAgent = "Select Agent_ID from Agent where Namn = "  + "'" + hamtaNamn + "'";
         String resultatAgent = idb.fetchSingle(fragaAgent);
         int agentInt = Integer.parseInt(resultatAgent);
         idb.update("UPDATE alien SET Ansvarig_Agent = " + agentInt + " where namn = " + "'" + alienNamn +"'");
        
         
         rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        
        if(egenskaper.equals("Ras")){
         String hamtaRas = boxMedRaser.getSelectedItem().toString();
         String extraInfo = skrivInExtraInfo.getText();
         int extraInfoInt = Integer.parseInt(extraInfo);
         String hamtaAlienId = "Select Alien_ID from Alien where namn = " + "'" + alienNamn + "'";
         String alienIdResultat = idb.fetchSingle(hamtaAlienId);
         int alienInt = Integer.parseInt(alienIdResultat);
         
        
         String taBortWorm = "Delete from Worm" + " where Alien_ID = " + alienInt + "";
         idb.delete(taBortWorm);
         
         String taBortBoglodite = "Delete from Boglodite" + " where Alien_ID = " + alienInt + "";
         idb.delete(taBortBoglodite);
         
         String taBortSquid = "Delete from Squid" + " where Alien_ID = " + alienInt + "";
         idb.delete(taBortSquid);
         
         
         
         String sqlRas = "Insert into " + hamtaRas + " Values(" + alienInt + ", " + extraInfoInt + ");";
         idb.insert(sqlRas);
         
         
         if(hamtaRas.equals("worm")){
          String sqlRasWorm = "Insert into" + hamtaRas + " Values(" + alienInt + ");";
           idb.insert(sqlRasWorm);
           
           
                     
         }
         
         rubrikVadVillAndra.setText("Ny ändring har gjorts");
        }
        
        
            
        }catch(InfException e) {
           JOptionPane.showMessageDialog(null, "något gick fel");
            System.out.println("internt felmeddelande" + e.getMessage());
        }
        
    }//GEN-LAST:event_ändraKnappActionPerformed

    private void valjAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAgentKnappActionPerformed
         boxMedAgenter.setVisible(true);
         skrivInInformationRubrik.setVisible(false);
         skrivInNytt.setVisible(false);
         fyllBoxMedAgentNamn();
         
    }//GEN-LAST:event_valjAgentKnappActionPerformed

    private void valjRasKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjRasKnappActionPerformed
        boxMedRaser.setVisible(true);
        skrivInInformationRubrik.setVisible(false);
        skrivInNytt.setVisible(false);
        valjRasIgen.setVisible(true);
        
       
         
    }//GEN-LAST:event_valjRasKnappActionPerformed

    private void valjRasIgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjRasIgenActionPerformed
       
        
        if(boxMedRaser.getSelectedItem().equals("Squid")){
        skrivInInformationRubrik.setText("Ange antal armar");
        skrivInExtraInfo.setVisible(true);
        skrivInInformationRubrik.setVisible(true);
        }
        
        else if(boxMedRaser.getSelectedItem().equals("Boglodite")){
        skrivInInformationRubrik.setText("Ange antal boogies");
        skrivInExtraInfo.setVisible(true);
        skrivInInformationRubrik.setVisible(true);
        }
        
        else if(boxMedRaser.getSelectedItem().equals("Worm")){
        skrivInExtraInfo.setVisible(false);
        skrivInInformationRubrik.setVisible(false);
        }
        
        
        
         
    }//GEN-LAST:event_valjRasIgenActionPerformed

    private void valjPlatsKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjPlatsKnappActionPerformed
        fyllBoxMedPlatsNamn();
        platsBox.setVisible(true);
        
    }//GEN-LAST:event_valjPlatsKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AndraInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraInformationOmAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAlienNamn;
    private javax.swing.JComboBox<String> boxMedAgenter;
    private javax.swing.JComboBox<String> boxMedRaser;
    private javax.swing.JLabel extraInfoRubrik;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> platsBox;
    private javax.swing.JLabel rubrikVadVillAndra;
    private javax.swing.JTextField skrivInExtraInfo;
    private javax.swing.JLabel skrivInInformationRubrik;
    private javax.swing.JTextField skrivInNytt;
    private javax.swing.JButton valjAgentKnapp;
    private javax.swing.JButton valjAlien;
    private javax.swing.JComboBox<String> valjInfo;
    private javax.swing.JButton valjPlatsKnapp;
    private javax.swing.JButton valjRasIgen;
    private javax.swing.JButton valjRasKnapp;
    private javax.swing.JButton ändraKnapp;
    // End of variables declaration//GEN-END:variables
}
