/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author Idawi
 */
<<<<<<< Updated upstream
public class inloggningSida extends javax.swing.JFrame {

    private static InfDB idb;
    
    public inloggningSida(InfDB idb) {
        initComponents();
        this.setLocationRelativeTo(null);
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

        losenOrdRuta = new javax.swing.JTextField();
        anvandarNamnRubrik = new javax.swing.JLabel();
        losenordTextRuta = new javax.swing.JLabel();
        anvandarNamn = new javax.swing.JTextField();
        LoggaInKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        losenOrdRuta.setColumns(5);

        anvandarNamnRubrik.setText("Användarnamn");

        losenordTextRuta.setText("Lösenord");

        anvandarNamn.setColumns(5);

        LoggaInKnapp.setText("Logga in");
        LoggaInKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoggaInKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< Updated upstream
                    .addComponent(LoggaInKnapp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(anvandarNamnTextRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(losenordTextRuta)
                        .addComponent(losenOrdRuta)
                        .addComponent(anvandarNamnRuta)))
                .addContainerGap(172, Short.MAX_VALUE))
=======
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anvandarNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anvandarNamnRubrik))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(losenOrdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(losenordTextRuta)))
                    .addComponent(LoggaInKnapp))
                .addContainerGap(191, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< Updated upstream
                .addGap(43, 43, 43)
                .addComponent(anvandarNamnTextRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anvandarNamnRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(losenordTextRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(losenOrdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(losenordTextRuta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(anvandarNamnRubrik)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenOrdRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anvandarNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
>>>>>>> Stashed changes
                .addComponent(LoggaInKnapp)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoggaInKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoggaInKnappActionPerformed
        // TODO add your handling code here:
        try{
        
        String aNamn = anvandarNamn.getText();
        String losenord = losenOrdRuta.getText();
        String sqlNamn = "SELECT losenord from AGENT where namn=" + aNamn;
        String sqlLosen = "SELECT namn from Agent where losenord=" + losenord;
       
        //String svarNamn = idb.fetchSingle(sqlNamn);
      
        String svarLosen = idb.fetchSingle(sqlLosen);
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "du angav fel användarnamn eller lösenord");
 
        

  
        }
    }//GEN-LAST:event_LoggaInKnappActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoggaInKnapp;
    private javax.swing.JTextField anvandarNamn;
    private javax.swing.JLabel anvandarNamnRubrik;
    private javax.swing.JTextField losenOrdRuta;
    private javax.swing.JLabel losenordTextRuta;
    // End of variables declaration//GEN-END:variables




=======
public class inloggningSida {
    
>>>>>>> Stashed changes
}


