package lab8;
import java.util.*;
/**
 * @author s511264
 */
public class Lab8 
{
   public static void main(String[] args)
	{
        Countdown Player1 = new Countdown();
        Player1.setPoints(0);
        Countdown Player2 = new Countdown();
        Player2.setPoints(0);
        
        String[] letters = new String[9];
        letters = Player1.generateLetters();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary = Player1.generateDictionary();
        Player1.play();
        
        Scanner playerInput = new Scanner(System.in);
        String player1word = playerInput.next();
        System.out.println("Player 1: "+player1word);
        
        Player1.setPoints(Player1.returnScore(player1word));
        System.out.println("Player 1 score: "+ Player1.getPoints());
        
   }
}
