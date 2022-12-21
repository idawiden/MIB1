/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author filippabostrom
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
    
        boolean resultat = false;
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan, användarnamn är tom");
        resultat = true;
        }
        return resultat;
}
    
    public static boolean losenordFaltHarVarde(JPasswordField losenAttKolla) {
        
        boolean resultat = false;
        if(losenAttKolla.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Inmatningsrutan, lösenord är tom");
        resultat = true;
        }
        
        return resultat;
        
    }
    
    
    
    
    
}

