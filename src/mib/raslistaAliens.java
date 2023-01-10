/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class raslistaAliens extends javax.swing.JFrame {
    private static InfDB idb;

    /**
     * Creates new form raslistaAliens
     */
    public raslistaAliens(InfDB idb) {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visaRaslista = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        valjKnapp = new javax.swing.JButton();
        valjRas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Visa raslista för aliens");

        visaRaslista.setColumns(20);
        visaRaslista.setRows(5);
        jScrollPane1.setViewportView(visaRaslista);

        jLabel2.setText("Välj ras");

        valjKnapp.setText("Ok");
        valjKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjKnappActionPerformed(evt);
            }
        });

        valjRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));

        jLabel3.setText("Inloggad som agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(valjKnapp))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valjKnapp)
                    .addComponent(valjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valjKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjKnappActionPerformed
      
        
        visaRaslista.setText(" ");
        ArrayList<String> bogloditeLista;
        
        if(valjRas.getSelectedItem().equals("Boglodite")) {
          
          try{
           String valdRas = valjRas.getSelectedItem().toString();
           String fraga = "SELECT namn from Alien, Boglodite where Alien.Alien_ID = Boglodite.Alien_ID" ;
           bogloditeLista = idb.fetchColumn(fraga);
           
           for(String namnAvRas: bogloditeLista){
            visaRaslista.append(namnAvRas + "\t");
           }
           
          }catch(InfException e){
              JOptionPane.showMessageDialog(null, "Något gick fel");
          }
        }
          
          
          
           ArrayList<String> wormLista;
        
        if(valjRas.getSelectedItem().equals("Worm")) {
          
          try{
           String valdRas = valjRas.getSelectedItem().toString();
           String fraga = "SELECT namn from Alien, Worm where Alien.Alien_ID = Worm.Alien_ID" ;
           wormLista = idb.fetchColumn(fraga);
           
           for(String namnAvRas: wormLista){
            visaRaslista.append(namnAvRas + "\t");
           }
           
          }catch(InfException e){
              JOptionPane.showMessageDialog(null, "Något gick fel");
          }
        }
        
        
        
           ArrayList<String> squidLista;
        
        if(valjRas.getSelectedItem().equals("Squid")) {
          
          try{
           String valdRas = valjRas.getSelectedItem().toString();
           String fraga = "SELECT namn from Alien, Squid where Alien.Alien_ID = Squid.Alien_ID" ;
           squidLista = idb.fetchColumn(fraga);
           
           for(String namnAvRas: squidLista){
            visaRaslista.append(namnAvRas + "\t");
           }
           
          }catch(InfException e){
              JOptionPane.showMessageDialog(null, "Något gick fel");
          }
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
            java.util.logging.Logger.getLogger(raslistaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(raslistaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(raslistaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(raslistaAliens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new raslistaAliens(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton valjKnapp;
    private javax.swing.JComboBox<String> valjRas;
    private javax.swing.JTextArea visaRaslista;
    // End of variables declaration//GEN-END:variables
}
