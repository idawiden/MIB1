/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.ArrayList;

/**
 *
 * @author filippabostrom
 */
public class Validering {
    
    
    
public Validering(){
    
    
}
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
    
        boolean resultat = false;
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "En eller flera inmatningsrutor är tomma");
        resultat = true;
        }
        return resultat;
}
    
    
    
    
    



    public static boolean kollaAnvandarnamnAgent (JTextField rutaAttKolla){

        boolean giltigtNamn = false;
        
        if(rutaAttKolla.getText().contains("Agent")){
            giltigtNamn = true;
        }else{
           JOptionPane.showMessageDialog(null, "Användarnamnet måste innehålla Agent, t.ex. Agnet T");
         
        }
        return giltigtNamn;

    }




}
 
  
  

      
      
     
      
      
  
  
  
  

    
    
   

    
    
    


