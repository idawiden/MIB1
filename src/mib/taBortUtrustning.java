/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author filippabostrom
 */
public class taBortUtrustning extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form taBortUtrustning
     */
    public taBortUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    
    
     private void fyllBoxMedUtrustningsNamnKommunkation(){
        
         String fraga = "SELECT Benamning from Utrustning join Kommunikation on Utrustning.Utrustnings_ID = Kommunikation.Utrustnings_ID;";
        
        ArrayList <String> kommunikationLista;
        
        try {
            kommunikationLista = idb.fetchColumn(fraga);
            
            for(String namn:kommunikationLista) {
                valjNamnUtrustning.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
        
        
        
        
    }
    
    
    private void fyllBoxMedUtrustningsNamnVapen() {
        
          String fraga = "SELECT Benamning from Utrustning join Vapen on Utrustning.Utrustnings_ID = Vapen.Utrustnings_ID;";
        
        ArrayList <String> VapenLista;
        
        try {
            VapenLista = idb.fetchColumn(fraga);
            
            for(String namn:VapenLista) {
                valjNamnUtrustning.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
        
        
        
        
        
    }
    
    
    private void fyllBoxMedUtrustningsNamnTeknik() {
        
          String fraga = "SELECT Benamning from Utrustning join Teknik on Utrustning.Utrustnings_ID = Teknik.Utrustnings_ID;";
        
        ArrayList <String> TeknikLista;
        
        try {
            TeknikLista = idb.fetchColumn(fraga);
            
            for(String namn:TeknikLista) {
                valjNamnUtrustning.addItem(namn);   
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
        kategoriBox = new javax.swing.JComboBox<>();
        valjKategori = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        valjNamnUtrustning = new javax.swing.JComboBox<>();
        taBort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Välj kategori av utrustning");

        kategoriBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik", "Vapen", "Kommunikation" }));

        valjKategori.setText("Välj");
        valjKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjKategoriActionPerformed(evt);
            }
        });

        jLabel2.setText("Välj utrustning");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valjKategori)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(taBort))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kategoriBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valjNamnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjNamnUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjKategori)
                    .addComponent(taBort))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valjKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjKategoriActionPerformed
        
        
        if(kategoriBox.getSelectedItem().equals("Teknik")) {
            
            fyllBoxMedUtrustningsNamnTeknik(); 
        }
        
        
        if(kategoriBox.getSelectedItem().equals("Kommunikation")) {
            
            fyllBoxMedUtrustningsNamnKommunkation();
            
            
        }
        
        if(kategoriBox.getSelectedItem().equals("Vapen")){
            
            fyllBoxMedUtrustningsNamnVapen();
        }
        
    }//GEN-LAST:event_valjKategoriActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        
        ArrayList<HashMap<String,String>> utrustningsLista;
        
      
        try{
        String valdUtrustning = valjNamnUtrustning.getSelectedItem().toString();
        String valdKategori = kategoriBox.getSelectedItem().toString();
        
       
       String fraga = "Delete from Utrustning"+"'"+valdKategori+"'" +" where Utrustning.Utrustnings_ID = " + "'" + valdKategori +"'" + ".Utrustnings_ID and Utrustning.Benamning = " + "'" + valdUtrustning + "'";
       utrustningsLista = idb.fetchRows(fraga);
      
      for(HashMap<String,String> utrustning: utrustningsLista) {
          if(utrustning.equals(fraga)){
              idb.delete(fraga);
          }
          
      
      
           
   
        }
        
        }catch(InfException e) {
            
            JOptionPane.showMessageDialog(null, "något gick fel");
            System.out.println("internt felmeddelande" + e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_taBortActionPerformed

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
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new taBortUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> kategoriBox;
    private javax.swing.JButton taBort;
    private javax.swing.JButton valjKategori;
    private javax.swing.JComboBox<String> valjNamnUtrustning;
    // End of variables declaration//GEN-END:variables
}
