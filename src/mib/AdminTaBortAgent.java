package mib;



import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author filip
 */
public class AdminTaBortAgent extends javax.swing.JFrame {

    private static InfDB idb;
    private Object Select;
    
    /**
     * Creates new form AdminTaBortAgent
     */
    public AdminTaBortAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllBoxMedNamn();
    
    }
    
    
     private void fyllBoxMedNamn() {
        String fraga = "SELECT namn from Agent";
        
        ArrayList <String> allaAgentNamn;
        
        try {
            allaAgentNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAgentNamn) {
                valjAgentBox.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }}
        
        
        
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubrik = new javax.swing.JLabel();
        valjAgentBox = new javax.swing.JComboBox<>();
        raderaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrik.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rubrik.setText("Välj agent");
        rubrik.setToolTipText("");

        raderaKnapp.setText("Radera");
        raderaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raderaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(rubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(raderaKnapp)
                    .addComponent(valjAgentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rubrik)
                .addGap(36, 36, 36)
                .addComponent(valjAgentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(raderaKnapp)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raderaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raderaKnappActionPerformed
        try{
        String valdAgent = valjAgentBox.getSelectedItem().toString();
      
      
     String AgentID = "Select Agent_ID from Agent where namn =" + "'" + valdAgent + "'";
     String resultat = idb.fetchSingle(AgentID);
      
      
      String hamtaFaltAgent = "Select Agent_ID from faltagent where Agent_ID =" + resultat+"";
      System.out.println(hamtaFaltAgent);
      
      String faltagent = idb.fetchSingle(hamtaFaltAgent);
      
      String hamtaKontorschef = "Select Agent_ID from kontorschef where Agent_ID =" + resultat+"";
      String kontorschef = idb.fetchSingle(hamtaKontorschef);
      String hamtaOmradeschef = "Select Agent_ID from omradeschef where Agent_ID =" + resultat+"";
      String omradeschef = idb.fetchSingle(hamtaOmradeschef);
      String hamtaInneharUtrustning = "Select Agent_ID from innehar_utrustning where Agent_ID =" + resultat+""; 
      String inneharUtrustning = idb.fetchSingle(hamtaInneharUtrustning);
      String hamtaInneharFordon = "Select agent_ID from innehar_Fordon where agent_ID =" + resultat +"";
      String inneharFordon = idb.fetchSingle(hamtaInneharFordon);
      String hamtaAgent = "Select Agent_ID from Agent where Agent_ID =" + resultat +"";
      String Agent = idb.fetchSingle(hamtaAgent);
      
      
      
      if(resultat.equals(faltagent)){
      idb.delete("Delete from faltagent where Agent_ID =" + resultat +"");
      }
      
      
      if(resultat.equals(kontorschef)){
          idb.delete("Delete from kontorschef where Agent_ID =" + resultat +"");
      }
      
      if(resultat.equals(omradeschef)){
          idb.delete("Delete from omradeschef where Agent_ID =" + resultat +"");
      }
      
      if(resultat.equals(inneharUtrustning)){
          idb.delete("Delete from innehar_utrustning where Agent_ID =" + resultat +"");
         
      }
      
      if(resultat.equals(inneharFordon)){
          idb.delete("Delete from innehar_fordon where agent_ID =" + resultat +"");
      }
     
      idb.delete("Delete from Agent where Agent_ID =" + resultat +"");
      
      rubrik.setText("Den valda agenten raderades");
      
      }catch(InfException e) {
   
            JOptionPane.showMessageDialog(null, "något gick fel");
            System.out.println("internt felmeddelande" + e.getMessage());
              
              
        
   
              }
      
    }//GEN-LAST:event_raderaKnappActionPerformed
      

    
    
                                          
        
   
      
    /**
     * @param args the command line arguments
     */      
      
            
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
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton raderaKnapp;
    private javax.swing.JLabel rubrik;
    private javax.swing.JComboBox<String> valjAgentBox;
    // End of variables declaration//GEN-END:variables

    
}
    
