/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author filippabostrom
 */
public class AndraLosenord extends javax.swing.JFrame {
 private static InfDB idb;
    /**
     * Creates new form AndraLosenord
     */
    public AndraLosenord(InfDB idb) {
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

        bytLosenRubrik = new javax.swing.JLabel();
        nuvarandeLosenRubrik = new javax.swing.JLabel();
        nyttLosenRubrik = new javax.swing.JLabel();
        nuvarandeLosen = new javax.swing.JPasswordField();
        nyttLosen = new javax.swing.JPasswordField();
        upprepaRubik = new javax.swing.JLabel();
        upprepaNyttLosen = new javax.swing.JPasswordField();
        knappByt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        angeAnvandarnamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bytLosenRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        bytLosenRubrik.setText("Byt lösenord");

        nuvarandeLosenRubrik.setText("Nuvarande lösenord");

        nyttLosenRubrik.setText("Nytt lösenord");

        nuvarandeLosen.setColumns(8);
        nuvarandeLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandeLosenActionPerformed(evt);
            }
        });

        nyttLosen.setColumns(8);
        nyttLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttLosenActionPerformed(evt);
            }
        });

        upprepaRubik.setText("Upprepa nytt lösenord");

        upprepaNyttLosen.setColumns(8);

        knappByt.setText("Byt lösenord");
        knappByt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knappBytActionPerformed(evt);
            }
        });

        jLabel1.setText("Ange användarnamn:");

        angeAnvandarnamn.setColumns(8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(angeAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nuvarandeLosenRubrik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nyttLosenRubrik)
                            .addComponent(nyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upprepaRubik)
                            .addComponent(upprepaNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bytLosenRubrik))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(knappByt)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bytLosenRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandeLosenRubrik)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angeAnvandarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nyttLosenRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upprepaRubik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knappByt)
                    .addComponent(upprepaNyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuvarandeLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandeLosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuvarandeLosenActionPerformed

    private void knappBytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knappBytActionPerformed
        
        try{
        String losen = nuvarandeLosen.getText();
        String losenNytt = nyttLosen.getText();
        String anvandarnamn = angeAnvandarnamn.getText();
        String losenNyttNytt = upprepaNyttLosen.getText();
        String fraga = "SELECT Losenord from Agent where Losenord =" + "'" + losen + "'";
        String resultat = idb.fetchSingle(fraga);
        if(losen.equals(resultat)&& losenNytt.equals(losenNyttNytt)){
        losen = losenNytt; 
        idb.update("UPDATE agent SET losenord = " + "'" + losenNytt + "'" + " where namn = " + "'" + anvandarnamn + "'");

        bytLosenRubrik.setText("Ditt lösenord har ändrats");
        }
        else{
            JOptionPane.showMessageDialog(null, "Det gick inte att uppdatera lösenord");
        }
        
       
        }
        catch(InfException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_knappBytActionPerformed

    private void nyttLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttLosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttLosenActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angeAnvandarnamn;
    private javax.swing.JLabel bytLosenRubrik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton knappByt;
    private javax.swing.JPasswordField nuvarandeLosen;
    private javax.swing.JLabel nuvarandeLosenRubrik;
    private javax.swing.JPasswordField nyttLosen;
    private javax.swing.JLabel nyttLosenRubrik;
    private javax.swing.JPasswordField upprepaNyttLosen;
    private javax.swing.JLabel upprepaRubik;
    // End of variables declaration//GEN-END:variables
}
