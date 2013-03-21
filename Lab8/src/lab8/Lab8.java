package lab8;

import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author s511264
 */
public class Lab8 
{
   public static void main(String[] args) throws FileNotFoundException 
	{
            Scanner userIn = new Scanner(System.in);
            int gameNum;
            do{
            System.out.println("Pick a game, any game:");
            System.out.println("0. Centurion");
            System.out.println("1. Countdown");
            System.out.println("2. Acrostics");
            System.out.println("3. Beheadments");
            System.out.println("4. Ghosts");
            System.out.println("5. Quit");
            gameNum = userIn.nextInt();   //gets user input            
            System.out.println();
            
            //plays game according to input
            if(gameNum==0){
                RunCenturion.main(args);
            }
            
            if(gameNum==1){
                
            }
            
            if(gameNum==2){
                Acrostics.playAcrostics();
            }
            
            if(gameNum==3){
                RunBeheadments.main(args);
            }
            
            if(gameNum==4){
                Ghosts.playGhosts();
            }
            
            }while (gameNum!=5);
		
	}
}
