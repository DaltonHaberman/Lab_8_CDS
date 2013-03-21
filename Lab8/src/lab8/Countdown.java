/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;

/**
 *
 * @author S502007
 */
public class Countdown {

    
    int points;
    public Countdown(){
      points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    
    final int NUM_LETTERS = 26;
    String[] letters = new String[9];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    Random rng = new Random();
    
    
    
    public String[] generateLetters(){
        //fills the array with 9 unique letters at random.
        int i = 0;
        do{
        int randomNumber = rng.nextInt(NUM_LETTERS);
        letters[i] = alphabet.substring(randomNumber, randomNumber +1);
        i++;
//     
        }while(i<9);
          
        return letters;
    }
     public ArrayList<String> generateDictionary(){
         java.io.File file = new java.io.File("dictionary.txt");
    Scanner input = new Scanner(file);
    ArrayList<String> dictionary = new ArrayList<>();
    while (input.hasNext()){
        dictionary.add(input.next());
     }
    return dictionary;
     }
     public void play(){
         printLetters(letters);
     }
     
     public void printLetters(String[] lettersList){
         System.out.print("Letters: " + lettersList[0]);
         for (int i = 1; i<(lettersList.length); i++){
         System.out.print("-"+lettersList[i]);}
         System.out.println();
         System.out.println("You have 30 seconds to enter the longest "
                 + "possible word you can think of comprised of those letters.");
}
     public int returnScore(String word){
         int score = word.length();
         return score;
     }
     
     public void verifyWord(String word){
         //check if it is in the dictionary
         //check if the correct letters have been used
     }
    
         
     
    
}
