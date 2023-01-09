/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JTextField;
/**
 *
 * @author filippaemberg
 */
public class RegistreraAgent extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllBoxMedOmraden();
                
        
        
    }
    
    //här är en metod som gör en kontroll så att det inte är möjligt att lägga till agentnamn som redan finns i systemet 
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
     
     
     
     
     //här sker en metod som gör en kontroll så att det inte är möjligt att lägga till agent_ID som redan finns i systemet  
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
     
     
   
     
     //en metod som fyller komboboxarna med benämning på område från tabellen område
     //en sql fråga som ställs mot databasen samt hämtar ut samtliga namn på områden i tabellen 
     private void fyllBoxMedOmraden() {
        
        String fraga = "Select Benamning from Omrade";
        
        ArrayList<String> omraden ;
        
        try{
        
        omraden = idb.fetchColumn(fraga);
        
        for(String omradesNamn : omraden) {
            boxValjOmrade.addItem(omradesNamn);
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

        rubrik = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        agentNamn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        agentTelefon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        agentLosenord = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxAdminstatus = new javax.swing.JComboBox<>();
        Registrera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boxValjOmrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rubrik.setText("Fyll i information ");

        jLabel2.setText("Agent_ID:");

        jLabel3.setText("Namn:");

        jLabel4.setText("Telefonnummer:");

        jLabel6.setText("Administrator");

        jLabel7.setText("Lösenord:");

        boxAdminstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J", "N" }));
        boxAdminstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAdminstatusActionPerformed(evt);
            }
        });

        Registrera.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Registrera.setText("Registrera");
        Registrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreraActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj område:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(agentNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(agentID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(agentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Registrera)
                                        .addGap(33, 33, 33))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(128, 128, 128))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(rubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(agentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(agentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Registrera)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreraActionPerformed
    
    if(Validering.textFaltHarVarde(agentID)){ //sker en validering med en if-sats av textfältet för inmatningen av agentID, då textfältet inte får vara tom vid registrering av agent 
    }   
    if(Validering.textFaltHarVarde(agentNamn)){ //här sker en validering med en if-sats av textfältet för inmatning av agentnamn, då fältet inte får vara tom vid registrering av agent 
    }    
    

     if(Validering.textFaltHarVarde(agentLosenord)){ //här sker en validering med en if-sats av textfältet för inmatning av agentlösenord, då fältet inte får vara tom vid registrering av agent 
    }    
      if(Validering.textFaltHarVarde(agentTelefon)){ // här sker en validering med en if-sats av täxtfältet för inmatning av telefonnummer, då fältet inte får vara tom vid registrering av agent 
    }    
    
     
     
 
     
     if(Validering.rattAntalTeckenTextField(agentLosenord)){
         
     }
     
    
     
        try{
            
            
            
            
            String namn = agentNamn.getText(); //hämtar det inmatade agentnamnet i textrutan agentNamn
            String id = agentID.getText();//hämtar id i textrutan agentID
            int idInt = Integer.parseInt(id); //här görs agentID om till en integer 
            int agentId = idInt; //agentId är nu en int
            
            String telefonnummer = agentTelefon.getText(); //hämtar telefonnummret i textrutan agentTelefon
            
            String losen = agentLosenord.getText(); //hämtar det inskrivna lösenordet i textrutan agentLosenord 
            
            String agentOmrade = boxValjOmrade.getSelectedItem().toString(); //hämtar det inmatade området 
            String fragaOmrade = "SELECT Omrades_ID from omrade where Benamning =" + "'" + agentOmrade + "'"; //hämtar områdesID från databasen där benämning är det som matas in i orade text rutan 
            String resultatOmrade = idb.fetchSingle(fragaOmrade);
            int omrade = parseInt(resultatOmrade); //här görs område om till en int 
            int rattOmrade = omrade; //område får variabelnnamnet rattOmrade
            
            String adminStatus = boxAdminstatus.getSelectedItem().toString(); //hämtar det som finns i komboboxen 
            
             
                       
             
    
        if(!Validering.kollaAnvandarnamnAgent(agentNamn) && !agentNamnFinnsRedan(agentNamn) && !agentIDFinnsRedan(agentID)){
        
         
            
            
            String sqlQuery = "Insert into Agent " + " Values (" + agentId + ",'"+ namn + "', '" + telefonnummer +  "'" + ", curdate(),'" + adminStatus +"'," + "'" + losen + "'," + rattOmrade + ");"; //en metod som lägger till alla värden i agent tabellen 
            idb.insert(sqlQuery);
            
                        rubrik.setText("En ny agent är registrerad i systemet"); //här updateras rubriken till det angivna 
        }
        
        else{
            rubrik.setText("Testa igen");
        }
            
             

        
        
            
            
        }catch(InfException e){
                 JOptionPane.showMessageDialog(null, "Det gick inte att registrera agenten");
                System.out.println("internt felmeddelande" + e.getMessage());
                 }   
        
    
        
    }//GEN-LAST:event_RegistreraActionPerformed

    private void boxAdminstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAdminstatusActionPerformed
        
        
       
    }//GEN-LAST:event_boxAdminstatusActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrera;
    private javax.swing.JTextField agentID;
    private javax.swing.JTextField agentLosenord;
    private javax.swing.JTextField agentNamn;
    private javax.swing.JTextField agentTelefon;
    private javax.swing.JComboBox<String> boxAdminstatus;
    private javax.swing.JComboBox<String> boxValjOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel rubrik;
    // End of variables declaration//GEN-END:variables
}
