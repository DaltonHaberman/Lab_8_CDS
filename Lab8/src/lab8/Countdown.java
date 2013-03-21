/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.Random;

/**
 *
 * @author S502007
 */
public class Countdown {
    
    public Countdown(){
        
    }
    
    final int NUM_LETTERS = 26;
    String[] letters = new String[NUM_LETTERS];
    
     public String generateLetters(){
        
        String[] letters = new String[NUM_LETTERS];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<NUM_LETTERS; i++){
            letters[i]= alphabet.substring(i, i+1);
            }
        Random rng = new Random();
        char[] nineLetters = new char[9];
        nineLetters[i] = alphabet.charAt(NUM_LETTERS);
        
        
        
    }
     public void play(){
         printLetters();
     }
     
     public void printLetters(){
         
}
    
         
     
    
}
