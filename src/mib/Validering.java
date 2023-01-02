/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;

/**
 *
 * @author filippabostrom
 */
public class Validering {
    private static InfDB idb;
    
    
public Validering(InfDB idb){
    this.idb = idb;
    
}
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
    
        boolean resultat = false;
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "En eller flera inmatningsrutor är tomma");
        resultat = true;
        }
        return resultat;
}
    
    
    public static boolean agentNamnFinnsRedan(JTextField rutaAttKolla){
        
        boolean namnFinns = false;
        
        try{
            
        
        String fraga = "Select namn from Agent";
        ArrayList<String> namnLista;
        namnLista = idb.fetchColumn(fraga);
        for(String namn : namnLista){
           if(namn.equals(rutaAttKolla.getText())){
               namnFinns = true;
               JOptionPane.showMessageDialog(null, "Det namnet finns redan");
           }
           return namnFinns;
        }
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
       
        }
        return namnFinns;
    
    }


  public static boolean alienNamnFinnsRedan(JTextField rutaAttKolla){
        
        boolean namnFinns = false;
        
        try{
            
        
        String fraga = "Select namn from Alien";
        ArrayList<String> namnLista;
        namnLista = idb.fetchColumn(fraga);
        for(String namn : namnLista){
           if(namn.equals(rutaAttKolla.getText())){
               namnFinns = true;
               JOptionPane.showMessageDialog(null, "Det namnet finns redan");
           }
           return namnFinns;
        }
       }catch(InfException e){
           JOptionPane.showMessageDialog(null, "något gick fel");
       
        }
        return namnFinns;
    
    }
}
    
    
   

    
    
    


