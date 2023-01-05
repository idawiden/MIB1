/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author filip
 */
public class AndraLosenordAlien extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form AndraLosenordAlien
     */
    public AndraLosenordAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    
    
    private void fyllBoxMedNamn() { //en metod som fyller komboboxen med alla alien som finns i alientabellen 
        String fraga = "SELECT namn from Alien"; //hämtar samttlliga aliennamn från databasen som finns i alientabellen 
        
        ArrayList <String> allaAlienNamn; //skapar en arraylist av alienobjekt av typen string 
        
        try {
            allaAlienNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAlienNamn) {
                valjAnvandarnamnAlien.addItem(namn);   
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

        bytLosenRubrikAlien = new javax.swing.JLabel();
        nuvarandeLösenordRubrikAlien = new javax.swing.JLabel();
        nuvarandeLosenAlien = new javax.swing.JPasswordField();
        nyttLösenRubrikAlien = new javax.swing.JLabel();
        nyttLosenAlien = new javax.swing.JPasswordField();
        upprepaNyttLösenordRubrikAlien = new javax.swing.JLabel();
        upprepaNyttLosenAlien = new javax.swing.JPasswordField();
        angeAnvändarnamnRubrikAlien = new javax.swing.JLabel();
        bytLosenordAlien = new javax.swing.JButton();
        valjAnvandarnamnAlien = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bytLosenRubrikAlien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bytLosenRubrikAlien.setText("Byt lösenord");
        bytLosenRubrikAlien.setToolTipText("");

        nuvarandeLösenordRubrikAlien.setText("Nuvarande lösenord");
        nuvarandeLösenordRubrikAlien.setToolTipText("");

        nuvarandeLosenAlien.setToolTipText("");
        nuvarandeLosenAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandeLosenAlienActionPerformed(evt);
            }
        });

        nyttLösenRubrikAlien.setText("Nytt lösenord");

        upprepaNyttLösenordRubrikAlien.setText("Upprepa nytt lösenord");

        angeAnvändarnamnRubrikAlien.setText("Välj användarnamn");

        bytLosenordAlien.setText("Byt lösenord");
        bytLosenordAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytLosenordAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upprepaNyttLösenordRubrikAlien)
                    .addComponent(nyttLösenRubrikAlien)
                    .addComponent(bytLosenRubrikAlien)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nyttLosenAlien, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuvarandeLosenAlien, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nuvarandeLösenordRubrikAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(upprepaNyttLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bytLosenordAlien)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angeAnvändarnamnRubrikAlien)
                            .addComponent(valjAnvandarnamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(bytLosenRubrikAlien)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandeLösenordRubrikAlien)
                    .addComponent(angeAnvändarnamnRubrikAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandeLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjAnvandarnamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nyttLösenRubrikAlien)
                        .addGap(18, 18, 18)
                        .addComponent(nyttLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(upprepaNyttLösenordRubrikAlien)
                        .addGap(18, 18, 18)
                        .addComponent(upprepaNyttLosenAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bytLosenordAlien)
                        .addGap(12, 12, 12)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuvarandeLosenAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandeLosenAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuvarandeLosenAlienActionPerformed

    private void bytLosenordAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytLosenordAlienActionPerformed
        
        // metod som ändrar lösenordet hos en alien
        
        try
        {
        
                 String losenAlien = nuvarandeLosenAlien.getText(); //hämtar det nuvarande lösenordet hos en alien 
                 String losenNyttAlien = nyttLosenAlien.getText(); //hämtar det nya lösenordet som en alien vill updatera till
                 String losenNyttNyttAlien = upprepaNyttLosenAlien.getText(); //hämtar det nya lösenordet igenom 
                 String anvandarnamn= valjAnvandarnamnAlien.getSelectedItem().toString(); //hämtar det användarnamn på den alien som är inloggad och som vill byta lösenord
                 String fraga = "SELECT Losenord from Alien where Losenord =" + "'" + losenAlien + "'"; //hämtar lösenordet från databasen som stämmer överrens med det nuvarande lösenordet som alien loggar in med
                 String resultat = idb.fetchSingle(fraga);
                 if(losenAlien.equals(resultat) && losenNyttAlien.equals(losenNyttNyttAlien)){ //en if-sats som kollar om det nuvarande lösenordet stämmer överrens med lösenordet i databasen och lösenordet stämmer överrens med det nya lösenordet
                 losenAlien = losenNyttAlien; //här uppdateras sedan en aliens lösenord 
                 idb.update("UPDATE Alien SET losenord = " + "'" + losenNyttAlien + "'" + " where namn = " + "'" + anvandarnamn + "'");//detta ovan sker med hjälp av en update metod som sker här 
                 
                 bytLosenRubrikAlien.setText("Ditt lösenord har ändrats");//här ändras rubriken till att lösenordet har ändrats för en alien, så användaren får bekräftat att ändringen gick igenom. Detta sker bara om if-satsen uppfylls.
                 
                 }
                
                     
                      
                 
                 
                }     
               catch(InfException e) { //detta fångar eventuella error 
               System.out.println("internt felmeddelande" + e.getMessage());
              JOptionPane.showMessageDialog(null, "Det gick inte att uppdatera lösenord"); //om inte så skrivs detta meddelande ut
               }           
    }//GEN-LAST:event_bytLosenordAlienActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenordAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angeAnvändarnamnRubrikAlien;
    private javax.swing.JLabel bytLosenRubrikAlien;
    private javax.swing.JButton bytLosenordAlien;
    private javax.swing.JPasswordField nuvarandeLosenAlien;
    private javax.swing.JLabel nuvarandeLösenordRubrikAlien;
    private javax.swing.JPasswordField nyttLosenAlien;
    private javax.swing.JLabel nyttLösenRubrikAlien;
    private javax.swing.JPasswordField upprepaNyttLosenAlien;
    private javax.swing.JLabel upprepaNyttLösenordRubrikAlien;
    private javax.swing.JComboBox<String> valjAnvandarnamnAlien;
    // End of variables declaration//GEN-END:variables
}
