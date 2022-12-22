/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;


/**
 *
 * @author filippabostrom
 */
public class inloggningsSida extends javax.swing.JFrame {
    private static InfDB idb;
    private HashMap <String,String> agenter;

    /**
     * Creates new form inloggningsSida
     * @param idb
     */
    public inloggningsSida(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.idb = idb;
        agenter = new HashMap <>();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startRubrik = new javax.swing.JLabel();
        anvandarnamnRubrik = new javax.swing.JLabel();
        anvandarnamnFalt = new javax.swing.JTextField();
        losenordRubrik = new javax.swing.JLabel();
        losenordFalt = new javax.swing.JPasswordField();
        loggaIn = new javax.swing.JButton();
        titelAlternativ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        startRubrik.setText("Vänligen ange titel och logga in");

        anvandarnamnRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        anvandarnamnRubrik.setText("Användarnamn:");

        anvandarnamnFalt.setColumns(7);

        losenordRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        losenordRubrik.setText("Lösenord:");

        losenordFalt.setColumns(7);

        loggaIn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        loggaIn.setText("Logga in");
        loggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaInActionPerformed(evt);
            }
        });

        titelAlternativ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Administratör", "Alien" }));
        titelAlternativ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titelAlternativActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(losenordRubrik)
                        .addComponent(anvandarnamnRubrik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(titelAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(losenordFalt)
                        .addComponent(anvandarnamnFalt))
                    .addComponent(startRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(titelAlternativ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(anvandarnamnRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(anvandarnamnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenordRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenordFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loggaIn)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaInActionPerformed
       
        
        
          if(Validering.textFaltHarVarde(anvandarnamnFalt)){

          }
          if(Validering.textFaltHarVarde(losenordFalt)){
              
          }
          
          if(titelAlternativ.getSelectedItem().equals("Agent")) {
              
          
          
        try{
            String anvandarNamn = anvandarnamnFalt.getText();
            String losen = losenordFalt.getText();
            String fraga = "SELECT Losenord from Agent where Namn =" + "'" + anvandarNamn + "'";
            String resultat = idb.fetchSingle(fraga);
            
          if(losen.equals(resultat)){
              loggaIn.setText("du loggas in");
              new AgentMeny(idb).setVisible(true);
           
          
          
            }else {
               startRubrik.setText("Du angav fel användarnamn eller lösenord ");
          }
          }catch(InfException e) {
                  
                  }
          }
        
        if(titelAlternativ.getSelectedItem().equals("Administratör")){
          
            
            
           try{
            String anvandarNamn = anvandarnamnFalt.getText();
            String losen = losenordFalt.getText();
            String fraga = "SELECT Losenord from Agent where administrator = 'J' and Namn =" + "'" + anvandarNamn + "'";
            
          
            String resultat = idb.fetchSingle(fraga);
            
          if(losen.equals(resultat)){
              loggaIn.setText("du loggas in");
              new AdministratorMeny(idb).setVisible(true);
           
          
          
            }else {
               startRubrik.setText("Du angav fel användarnamn eller lösenord");
          }
          }catch(InfException e) {
                  
                  
          }
            
            if(titelAlternativ.getSelectedItem().equals("Alien")) {
                
            
                 try{
            String anvandarNamn = anvandarnamnFalt.getText();
            String losen = losenordFalt.getText();
            String fraga = "SELECT Losenord from Alien where Namn =" + "'" + anvandarNamn + "'";
            String resultat = idb.fetchSingle(fraga);
                 
          if(losen.equals(resultat)){
              loggaIn.setText("du loggas in");
              new AlienMeny(idb).setVisible(true);
          
          
          
            }else {
               startRubrik.setText("Du angav fel användarnamn eller lösenord ");
          }
          }catch(InfException e) {
              System.out.println(e.getMessage());    
                  }
          }
                
                
                
                
                
            
            
        }
        
        
        
        
        
        
        
        
        
       
        
        
    
 
        
        
        

    }//GEN-LAST:event_loggaInActionPerformed

    private void titelAlternativActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titelAlternativActionPerformed
        String valdTitel = (String) titelAlternativ.getSelectedItem();
    }//GEN-LAST:event_titelAlternativActionPerformed
         
        
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anvandarnamnFalt;
    private javax.swing.JLabel anvandarnamnRubrik;
    private javax.swing.JButton loggaIn;
    private javax.swing.JPasswordField losenordFalt;
    private javax.swing.JLabel losenordRubrik;
    private javax.swing.JLabel startRubrik;
    private javax.swing.JComboBox<String> titelAlternativ;
    // End of variables declaration//GEN-END:variables

   
        
}

