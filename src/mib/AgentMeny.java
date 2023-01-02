/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class AgentMeny extends javax.swing.JFrame {
    private static InfDB idb;
    

    /**
     * Creates new form AgentMeny
     */
    public AgentMeny(InfDB idb) {
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

        Valkommen = new javax.swing.JLabel();
        andraLosenord = new javax.swing.JButton();
        alternativBox = new javax.swing.JComboBox<>();
        alienRubrik = new javax.swing.JLabel();
        nyUtrustning = new javax.swing.JButton();
        sokOmradeschef = new javax.swing.JButton();
        valtAlternativKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Valkommen.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Valkommen.setText("Välkommen tillbaka Agent!");

        andraLosenord.setText("Ändra lösenord");
        andraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenordActionPerformed(evt);
            }
        });

        alternativBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj alternativ", "nyregistrera alien", "ändra alieninformation", "platslista aliens", "raslista aliens", "datumlista aliens", "all alieninfo" }));
        alternativBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alternativBoxActionPerformed(evt);
            }
        });

        alienRubrik.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        alienRubrik.setText("Alien ");

        nyUtrustning.setText("Registrera ny utrustning");
        nyUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyUtrustningActionPerformed(evt);
            }
        });

        sokOmradeschef.setText("Sök områdeschef");
        sokOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokOmradeschefActionPerformed(evt);
            }
        });

        valtAlternativKnapp.setText("Ok");
        valtAlternativKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valtAlternativKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(andraLosenord)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alienRubrik)
                            .addComponent(Valkommen))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valtAlternativKnapp)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nyUtrustning)
                                .addGap(18, 18, 18)
                                .addComponent(sokOmradeschef))
                            .addComponent(alternativBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 68, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Valkommen)
                .addGap(10, 10, 10)
                .addComponent(andraLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alienRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alternativBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valtAlternativKnapp)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyUtrustning)
                    .addComponent(sokOmradeschef))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alternativBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alternativBoxActionPerformed
        
    }//GEN-LAST:event_alternativBoxActionPerformed

    private void nyUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyUtrustningActionPerformed
         new RegistreraUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_nyUtrustningActionPerformed

    private void andraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenordActionPerformed
         new AndraLosenord(idb).setVisible(true);
        
    }//GEN-LAST:event_andraLosenordActionPerformed

    private void sokOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokOmradeschefActionPerformed
       new sokOmradeschef(idb).setVisible(true);
    }//GEN-LAST:event_sokOmradeschefActionPerformed

    private void valtAlternativKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valtAlternativKnappActionPerformed
        
        if(alternativBox.getSelectedItem().equals("nyregistrera alien")) {
        new RegistreraAlien(idb).setVisible(true);
        }
        
        else if(alternativBox.getSelectedItem().equals("all alieninfo")) {
             new VisaAllInformationAlien(idb).setVisible(true);
        }
        
        else if(alternativBox.getSelectedItem().equals("platslista aliens")){
             new platsLista(idb).setVisible(true);
           
        }
        
        else if (alternativBox.getSelectedItem().equals("raslista aliens")){
             new raslistaAliens(idb).setVisible(true);
        }
        
    }//GEN-LAST:event_valtAlternativKnappActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Valkommen;
    private javax.swing.JLabel alienRubrik;
    private javax.swing.JComboBox<String> alternativBox;
    private javax.swing.JButton andraLosenord;
    private javax.swing.JButton nyUtrustning;
    private javax.swing.JButton sokOmradeschef;
    private javax.swing.JButton valtAlternativKnapp;
    // End of variables declaration//GEN-END:variables
}
