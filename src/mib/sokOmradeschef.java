/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author filippabostrom
 */
public class sokOmradeschef extends javax.swing.JFrame {
private static InfDB idb;
    /**
     * Creates new form sokOmradeschef
     */
    public sokOmradeschef(InfDB idb) {
        initComponents();
         this.idb = idb;
         fyllBoxMedOmraden(); // här anropas metoden i konstruktorn så att komboBoxen fylls direkt
    }
    
   
    // metod som fyller KomboBoxen med benämningar på områden från databasen
    private void fyllBoxMedOmraden() {
        
        String fraga = "Select Benamning from Omrade";
        
        ArrayList<String> omraden ;
        
        try{
        
        omraden = idb.fetchColumn(fraga);
        
        for(String omradesNamn : omraden) {
            valjOmrade.addItem(omradesNamn);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valjOmrade = new javax.swing.JComboBox<>();
        sokKnapp = new javax.swing.JButton();
        visaOmradeschefHar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Sök områdeschef för område");

        jLabel2.setText("Välj område");

        sokKnapp.setText("Sök");
        sokKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokKnappActionPerformed(evt);
            }
        });

        visaOmradeschefHar.setColumns(10);

        jLabel3.setText("Inloggad som agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visaOmradeschefHar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(sokKnapp))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sokKnapp))
                .addGap(28, 28, 28)
                .addComponent(visaOmradeschefHar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sokKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokKnappActionPerformed
        
        visaOmradeschefHar.setText("");
        try{
        String valtOmrade = valjOmrade.getSelectedItem().toString();
        //valtOmrade håller samtliga områden som går att välja på i komboboxen.
        //sql fråga ställs mot databasen som hämtar ut vilken agent som är områdeschef för ett område
        
        String fraga = "Select Agent.Namn from Agent join Omradeschef on Agent.Agent_ID = omradeschef.Agent_ID join omrade on omrade.Omrades_ID = omradeschef.Omrade where omrade.Benamning = " + "'" + valtOmrade + "'" ;
        String resultat = idb.fetchSingle(fraga);
        visaOmradeschefHar.setText(resultat);
        //metod för att visa vem som är områdeschef 
    
    //en catch som fångar inmatningsfel som gör att applikationen inte "kraschar"
    }catch(InfException e) {
    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println("Internt felmeddelande" + e.getMessage());
}
        
        
        
    }//GEN-LAST:event_sokKnappActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton sokKnapp;
    private javax.swing.JComboBox<String> valjOmrade;
    private javax.swing.JTextField visaOmradeschefHar;
    // End of variables declaration//GEN-END:variables
}
