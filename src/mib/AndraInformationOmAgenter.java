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
public class AndraInformationOmAgenter extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form AndraInformationOmAgenter
     */
    public AndraInformationOmAgenter(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllBoxMedAgentNamn();
        
        infoRubrik.setVisible(false);
        kategoriBox.setVisible(false);
        nyInfoTextRuta.setVisible(false);
        rubrik2.setVisible(false);
        boxMedOmraden.setVisible(false);
        boxMedStatus.setVisible(false);
        valjOmradeKnapp.setVisible(false);
        ValjStatusKnapp.setVisible(false);
    //textrutor, komboboxar samt jButton som sätts till icke synliga i konstruktorn för att de inte ska synas i designen från början. Vid vissa val så ska dessa sedan bli synliga     
                
                
        
    }
    
    //en metod som ställer en sql fråga mot databasen som hämtar ut samtlliga namn från tabellen agent. Samtliga namn syns sedan i komboboxen och gör det mööjligt att välja mellan dessa utan att manuellt behöva skriva in ett agentnamn.
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
    
    //en metod som fyller komboboxen med samtliga benämningar från tabellen område i databasen.
    private void fyllBoxMedOmrade () {
        
        String fraga = "Select Benamning from Omrade";
        
        ArrayList<String> allaOmraden;
        
        try{
            
            allaOmraden = idb.fetchColumn(fraga);
            
            for(String omrade : allaOmraden){
                boxMedOmraden.addItem(omrade);
            }
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "fel");
            
            
        }
        
        
        
        
        
        
    }
    
    //här sker en metod som kollar så att det inte är möjligt att lägga till ett agent_ID som redan finns i databasen 
       private boolean agentIDFinnsRedan(JTextField rutaAttKolla){
        
        boolean agentIDFinns = false;
        
        try{
            
        
        String fraga = "Select Agent_ID from Agent";
        ArrayList<String> IDLista;
        IDLista = idb.fetchColumn(fraga);
        for(String id : IDLista){
           if(id.equals(rutaAttKolla.getText())){
               agentIDFinns = true;
               JOptionPane.showMessageDialog(null, "Det agentIDet finns redan, vänligen testa ett annat");
           }
           
        }
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
       
        }
        return agentIDFinns;
    
    }
       
       
       
         private boolean agentNamnFinnsRedan(JTextField rutaAttKolla){
        
        boolean namnFinns = false;
        
        try{
            
        
        String fraga = "Select namn from Agent";
        ArrayList<String> namnLista;
        namnLista = idb.fetchColumn(fraga);
        for(String namn : namnLista){
           if(namn.equals(rutaAttKolla.getText())){
               namnFinns = true;
               JOptionPane.showMessageDialog(null, "Det användarnamnet finns redan");
           }
          
        }
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
       
        }
        return namnFinns;
    
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxMedAgenter = new javax.swing.JComboBox<>();
        valjAgent = new javax.swing.JButton();
        infoRubrik = new javax.swing.JLabel();
        kategoriBox = new javax.swing.JComboBox<>();
        nyInfoTextRuta = new javax.swing.JTextField();
        rubrik2 = new javax.swing.JLabel();
        boxMedOmraden = new javax.swing.JComboBox<>();
        valjOmradeKnapp = new javax.swing.JButton();
        andraKnapp = new javax.swing.JButton();
        ValjStatusKnapp = new javax.swing.JButton();
        boxMedStatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Välj agent");

        valjAgent.setText("Välj");
        valjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAgentActionPerformed(evt);
            }
        });

        infoRubrik.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        infoRubrik.setText("Vad vill du ändra?");

        kategoriBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent_ID", "Namn", "Telefon", "Administrator", "Losenord", "Omrade" }));

        nyInfoTextRuta.setColumns(8);

        rubrik2.setText("Skriv in ny information");

        valjOmradeKnapp.setText("Välj område");
        valjOmradeKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjOmradeKnappActionPerformed(evt);
            }
        });

        andraKnapp.setText("Ändra");
        andraKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKnappActionPerformed(evt);
            }
        });

        ValjStatusKnapp.setText("Välj status");
        ValjStatusKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValjStatusKnappActionPerformed(evt);
            }
        });

        boxMedStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "J" }));

        jLabel2.setText("Inloggad som administratör");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(boxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(valjAgent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kategoriBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(boxMedOmraden, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(valjOmradeKnapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ValjStatusKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boxMedStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(30, 108, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(infoRubrik)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rubrik2)
                                    .addComponent(nyInfoTextRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(andraKnapp)))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxMedAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjAgent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoRubrik)
                    .addComponent(rubrik2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyInfoTextRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjOmradeKnapp)
                    .addComponent(ValjStatusKnapp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxMedOmraden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxMedStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(andraKnapp)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKnappActionPerformed
      
        //här sker en kontroll med en if-sats som vid uppfyllt villkor kör resterande kod nedan.
        if(agentIDFinnsRedan(nyInfoTextRuta)); {
            
        }
        
        
        
        //agentNamn och kategori håller namn på samtliga agenter samt kategorival som finns att göra i komboboxen 
        //nyInfo är en textruta som håller information om ny inmatad data.
        try{
           
         String agentNamn = boxMedAgenter.getSelectedItem().toString();
         String kategori = kategoriBox.getSelectedItem().toString();
         String nyInfo = nyInfoTextRuta.getText();
         
         //här sker olika kontroller med if-satser som kollar om den valda kategorin stämmer med olika egenskaper som ska gå att ändra om agenterna 
         //vid uppfyllda villkor så ändras informationen med den nya inmatade datan 
         //vid lyckad uppdatering av data så ändras sedan rubrikerna nedan till "Ny ändring har gjorts".
         
         
         // if-sats som kollar om agentID redan finns i databasen, returnerar metoden i if-satsen true så finns agentID i databasen
         // och användaren får ett meddelande i rubriken om att testa igen
         if(kategori.equals("Agent_ID") && agentIDFinnsRedan(nyInfoTextRuta) == true){
         infoRubrik.setText("Testa igen");
            
         }
        
         // en else-if sats som kollar om agentID finns i databasen, returnerar metoden else-if- satsen false
         // betyder det att AgentID inte finns och då kan den alltså ändras
         else if(kategori.equals("Agent_ID") && agentIDFinnsRedan(nyInfoTextRuta) == false) {   
         String nyttID = nyInfo;
         int agentID = Integer.parseInt(nyttID);
         
         // här sker denna update som då sätter ett nytt agentID på den valda agenten
        idb.update("UPDATE Agent SET Agent_ID = "+ agentID + " where namn = "+ "'" + agentNamn +"'");
        infoRubrik.setText("Ny ändring har gjorts");
             
         }
         
        // en If-sats som kollar om agentNamnet som försöker ändras finns i databsen eller ej, samt en koll om agentNamnet innehåller "Agent"
            
        if((kategori.equals("Namn")&& Validering.kollaAnvandarnamnAgent(nyInfoTextRuta) == false && agentNamnFinnsRedan(nyInfoTextRuta) == true)) {
            infoRubrik.setText("Testa igen");
        }
        
         
        //
         else if(kategori.equals("Namn")&& Validering.kollaAnvandarnamnAgent(nyInfoTextRuta) == true && agentNamnFinnsRedan(nyInfoTextRuta) == false){
        idb.update("UPDATE Agent SET Namn = "+ "'"+ nyInfo + "'" + " where namn = "+ "'" + agentNamn +"'");
        infoRubrik.setText("Ny ändring har gjorts");
         }
        
         
         if(kategori.equals("Telefon")){
        idb.update("UPDATE Agent SET Telefon = "+ "'"+ nyInfo + "'" + " where namn = "+ "'" + agentNamn +"'");
        infoRubrik.setText("Ny ändring har gjorts");
        }
         
        if(kategori.equals("Omrade")){
        String omrade = boxMedOmraden.getSelectedItem().toString();
        String fragaOmrade = "Select Omrades_ID from Omrade where Benamning = " + "'" + omrade + "'";
        String resultatInt = idb.fetchSingle(fragaOmrade);
        int omradesInt = Integer.parseInt(resultatInt);
        
        idb.update("UPDATE Agent SET Omrade = " + omradesInt + " where namn = " + "'" + agentNamn + "'");
        infoRubrik.setText("Ny ändring har gjorts");
        }
        
        if(kategori.equals("Status")){
            String hamtaStatus = boxMedStatus.getSelectedItem().toString();
            idb.update("UPDATE Agent set Administrator =" + "'"+ hamtaStatus + "'" + " where namn = " +"'"+ agentNamn + "'" );
            infoRubrik.setText("Ny ändring har gjorts");
        }
        
        if(kategori.equals("Losenord")) {
        idb.update("UPDATE Agent SET Losenord = " + "'" + nyInfo + "'" + " where namn = " + "'" + agentNamn + "'");
        infoRubrik.setText("Ny ändring har gjorts");
  
        }
        
       
         
       //en catch som fångar eventuella inmatningsfel så att applikationen inte kraschar.  
       }catch (InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
           
           
           
           
       }
    }//GEN-LAST:event_andraKnappActionPerformed

    private void valjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAgentActionPerformed
    //här nedan vid olika kanpptryck sätts olika texxtrutor, komboboxar samt JButtons synliga
    infoRubrik.setVisible(true);
    kategoriBox.setVisible(true);
    valjOmradeKnapp.setVisible(true);
    ValjStatusKnapp.setVisible(true);
    nyInfoTextRuta.setVisible(true);
    rubrik2.setVisible(true);
        
    }//GEN-LAST:event_valjAgentActionPerformed

    private void valjOmradeKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjOmradeKnappActionPerformed
    boxMedOmraden.setVisible(true);
    fyllBoxMedOmrade ();
    rubrik2.setVisible(false);
    nyInfoTextRuta.setVisible(false);
    ValjStatusKnapp.setVisible(false);
    
   
    }//GEN-LAST:event_valjOmradeKnappActionPerformed

    private void ValjStatusKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValjStatusKnappActionPerformed
    boxMedStatus.setVisible(true);
    rubrik2.setVisible(false);
    nyInfoTextRuta.setVisible(false);
    boxMedOmraden.setVisible(false);
    }//GEN-LAST:event_ValjStatusKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AndraInformationOmAgenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAgenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAgenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraInformationOmAgenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraInformationOmAgenter(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ValjStatusKnapp;
    private javax.swing.JButton andraKnapp;
    private javax.swing.JComboBox<String> boxMedAgenter;
    private javax.swing.JComboBox<String> boxMedOmraden;
    private javax.swing.JComboBox<String> boxMedStatus;
    private javax.swing.JLabel infoRubrik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> kategoriBox;
    private javax.swing.JTextField nyInfoTextRuta;
    private javax.swing.JLabel rubrik2;
    private javax.swing.JButton valjAgent;
    private javax.swing.JButton valjOmradeKnapp;
    // End of variables declaration//GEN-END:variables
}
