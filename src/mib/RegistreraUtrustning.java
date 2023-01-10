/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class RegistreraUtrustning extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form RegistreraUtrustning
     */
    public RegistreraUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        extraInfoUtrustning.setVisible(false);
        skrivInInfo.setVisible(false);
        fyllBoxMedAgentNamn();
    }
    
    // en metod som fyller komboboxen (boxValjAgent) med samtliga agentnamn från tabellen agent 
    //en sql fråga ställs mot databasen för att hämta ut samtliga agentnamn.
    //en for-loop körs sedan för att iterera igenom samtliga agentnamn i samligen och fyller sedan komboboxen 
     private void fyllBoxMedAgentNamn() {
        
         
        String fraga = "SELECT namn from Agent";
        
        ArrayList <String> allaAgentNamn;
        
        try {
            allaAgentNamn = idb.fetchColumn(fraga);
            
            for(String namn:allaAgentNamn) {
                boxValjAgent.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }

     
      private boolean utrustningsIDFinnsRedan(JTextField rutaAttKolla){
        
        boolean utrustningsIDFinns = false;
        
        try{
            
        
        String fraga = "Select Utrustnings_ID from Utrustning";
        ArrayList<String> IDLista;
        IDLista = idb.fetchColumn(fraga);
        for(String id : IDLista){
           if(id.equals(rutaAttKolla.getText())){
               utrustningsIDFinns = true;
               JOptionPane.showMessageDialog(null, "Det utrustningsIDet finns redan, vänligen testa ett annat");
           }
          
        } 
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
       
        }
        return utrustningsIDFinns;
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubrikText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        utrustningsID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        benämning = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxValjKategori = new javax.swing.JComboBox<>();
        valjKnapp = new javax.swing.JButton();
        extraInfoUtrustning = new javax.swing.JLabel();
        skrivInInfo = new javax.swing.JTextField();
        registreraNyUtrustning = new javax.swing.JButton();
        boxValjAgent = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrikText.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        rubrikText.setText("Fyll i information");

        jLabel2.setText("UtrustningsID:");

        utrustningsID.setColumns(6);

        jLabel3.setText("Benämning:");

        benämning.setColumns(6);

        jLabel4.setText("Utrustningskategori:");

        boxValjKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Teknik", "Kommunikation" }));

        valjKnapp.setText("Välj");
        valjKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjKnappActionPerformed(evt);
            }
        });

        extraInfoUtrustning.setText("Extra information");

        skrivInInfo.setColumns(6);

        registreraNyUtrustning.setText("Registrera");
        registreraNyUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraNyUtrustningActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(extraInfoUtrustning))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(skrivInInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boxValjKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(valjKnapp))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(utrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(33, 33, 33)
                                        .addComponent(benämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registreraNyUtrustning)
                                    .addComponent(jLabel1))))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rubrikText)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(rubrikText))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(utrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxValjAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(benämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxValjKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjKnapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skrivInInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extraInfoUtrustning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registreraNyUtrustning)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreraNyUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraNyUtrustningActionPerformed
        //
        try{
            
            if(utrustningsIDFinnsRedan(utrustningsID)== false) {
                
            }
            //den nya utrustning som matas in i textfältet görs först om till en int 
            //sedan skriver man in benämning på utrustningen 
            //därefter sker en insert (en sql fråga)som lägger in den nya informationen i databasen med det utrustnings_ID samt benämning som skrivs in i textrutorna 
            String utrustning = utrustningsID.getText();
            int utrustningsInt = Integer.parseInt(utrustning);
            int rattUtrustning = utrustningsInt;
            
            String benamning = benämning.getText();
            
          
            
            idb.insert("Insert into Utrustning Values(" + rattUtrustning + ", '"+ benamning +"')");
            
            
            
            //här sker samma som ovan men här används en kombobox istället 
            String kategori = boxValjKategori.getSelectedItem().toString();
            String info = skrivInInfo.getText();
            
            //här görs en kontroll med hjälp av en if-sats som kollar om den valda utrustningen i kategorin stämmer överrens med antigen kommunikation, vapen eller teknik
            //då läggs den nya utrustningen till i rätt kategorin 
            //vid lyckad registrering så ändras rubriken till meddelandet nedan
            
           
            
            
            if(kategori.equals("Kommunikation")|| kategori.equals("Teknik")){
            String sqlKategori = "Insert into " + kategori + " Values("+ rattUtrustning + ",'" + info +"')";
            idb.insert(sqlKategori);
            rubrikText.setText("Ny utrustning har registrerats");
            }
            
            
     
            if(kategori.equals("Vapen")) {
                int skott = Integer.parseInt(info);
                int skottInt = skott;
                String sqlVapen = "Insert into " + kategori + " Values("+ rattUtrustning +"," + info +");";
                idb.insert(sqlVapen);
                rubrikText.setText("Ny utrustning har registrerats");
            }
            
            //vid vald agent genom kombobox så ställs en sql fråga som hämtar namnet på den valda agenten som utrustningen regostreras på
            //sedan görs det om till en int 
            //därefter ställs en ny sql fråga till databasen som lägger in den nya datan i tabellen innehar_utrustning med hjälp av en insert metod
            String valdAgent = boxValjAgent.getSelectedItem().toString();
            String hamtaId = "Select Agent_ID from Agent where namn= " + "'" + valdAgent + "'";
            String resultat = idb.fetchSingle(hamtaId);
            
            int idInt = Integer.parseInt(resultat);
                    
            
            
            idb.insert("Insert into innehar_utrustning Values(" + idInt + ", " + rattUtrustning + ", curdate())");
            
           
            
            
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("internt felmeddelande" + e.getMessage());
        }
        
        
    }//GEN-LAST:event_registreraNyUtrustningActionPerformed

    private void valjKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjKnappActionPerformed
        
        if(boxValjKategori.getSelectedItem().equals("Vapen")){
            extraInfoUtrustning.setText("Ange antal kaliber");
            extraInfoUtrustning.setVisible(true);
            skrivInInfo.setVisible(true);
        }
        if(boxValjKategori.getSelectedItem().equals("Teknik")){
            extraInfoUtrustning.setText("Ange kraftkälla");
            extraInfoUtrustning.setVisible(true);
            skrivInInfo.setVisible(true);
        }
        
        if(boxValjKategori.getSelectedItem().equals("Kommunikation")){
            extraInfoUtrustning.setText("Ange överföringsteknik");
            extraInfoUtrustning.setVisible(true);
            skrivInInfo.setVisible(true);
        }
        
    }//GEN-LAST:event_valjKnappActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField benämning;
    private javax.swing.JComboBox<String> boxValjAgent;
    private javax.swing.JComboBox<String> boxValjKategori;
    private javax.swing.JLabel extraInfoUtrustning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton registreraNyUtrustning;
    private javax.swing.JLabel rubrikText;
    private javax.swing.JTextField skrivInInfo;
    private javax.swing.JTextField utrustningsID;
    private javax.swing.JButton valjKnapp;
    // End of variables declaration//GEN-END:variables
}
