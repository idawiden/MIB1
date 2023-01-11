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

    // metod som kollar om ett textfält har ett värde, dett vill säga att användaren matat in något
    // metoden returnerar en boolean 
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        
        // från början är resultat false
        boolean resultat = false;
        
        // en if-sats sker och kollar om rutan är tom 
        if(rutaAttKolla.getText().isEmpty()) {
            
        // om rutan är tom får resultat värdet true, och betyder alltså att inmatningsrutan är tom  
        // användaren får då ett felmeddelande
        resultat = true;
        JOptionPane.showMessageDialog(null, "En eller flera inmatningsrutor är tomma");
        
        
        }
        // returnen returnerar antingen true eller false beroende på vad if-satsen ger ifrån sig
        return resultat;
}
    
    
    
    
    


    
    // metod som kollar om ett agentNamn är giltigt
    // returnerar en boolean, det vill säga antingen sant eller falsk
    public static boolean kollaAnvandarnamnAgent (JTextField rutaAttKolla){
        
        // från början är den lokala varibalen giltigtNamn satt till false
        boolean giltigtNamn = false;
        
        // if-sats som kollar om rutan som man skriver in agentNamnet i innehåller "Agent"
        // om detta stämmer sätts giltigtNamn till true
        if(rutaAttKolla.getText().contains("Agent")){
            giltigtNamn = true;
        }else{
            
            // om rutan som kollas inte innhåller agent får användaren ett meddelande vad som behöver ändras 
            
           JOptionPane.showMessageDialog(null, "Användarnamnet måste innehålla Agent, t.ex. Agent T");
         
        }
        // här sker en return av det värdet som giltigtNamn håller, antingen true eller false
        return giltigtNamn;

    }



    // metod som kollar om ett lösenord skrivit in med ett giltigt antal tecken
    // returnerar en boolean
    public static boolean rattAntalTeckenPasswordField (JPasswordField rutaAttKolla){
       
        // från början är rattAntal satt till false
       boolean rattAntal = false;
       
       // if-sats som kollar om lösenordet som skrivits in i rutan är kortare än 7
       // då det inte får matas in lösenord i databasen som är längre
       if(rutaAttKolla.getText().length() < 7){
           // om if-satsen stämmer blir rattAntal true
            rattAntal = true;
           
           
       }else{
           // om lösenordet är felaktigt får användaren ett meddelnade om vad som behövs ändras
           JOptionPane.showMessageDialog(null, "Lösenordet får inte innehålla mer än 6 tecken");
       }
        // här returneras antingen true eller false
       return rattAntal; 
        
        
        
    }
    
    
    
    
    public static boolean rattAntalTeckenTextField (JTextField rutaAttKolla){
        
       boolean rattAntal = false;
       
       if(rutaAttKolla.getText().length() < 7){
            rattAntal = true;
           
           
       }else{
           JOptionPane.showMessageDialog(null, "Lösenordet får inte innehålla mer än 6 tecken");
       }
        
       return rattAntal; 
        
        
        
    }
    
    
    
    
    
    
}
 
  
  

      
      
     
      
      
  
  
  
  

    
    
   

    
    
    


