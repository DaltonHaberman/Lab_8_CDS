package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Calin Gilliard
 * 
 * Runs but no AI
 */
public class Ghosts 
{
	public static void playGhosts() throws FileNotFoundException 
	{
		String word;
		int end =0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Player 1: ");
		word = input.next();
	
		//loop to run game
		do{
			System.out.print("Player 2: " + word);
			word = word + input.next();
			//test to see if word is in the dictionary
			if(inDic(word)==true)
			{
				System.out.println("Player 1 wins!");
				break;
			}
			System.out.print("Player 1: " + word);
			word = word + input.next();
			//test to see if word is in the dictionary
			if(inDic(word)==true)
			{
				System.out.println("Player 2 wins!");
				break;
			}
			if(word.length()>6)
			{
				System.out.println("Game Over: No word found");
				break;
			}
		}while(end==0);//continue to run till word is found

	}
	
	//written by Dalton
	public static boolean inDic(String word) throws FileNotFoundException{
		boolean inDic=false;
		File file = new File("dictionary.txt");
		Scanner dictionary = new Scanner(file);
		
		do{
			if(word.equals(dictionary.nextLine())){
				inDic=true;
			}			
		}while(dictionary.hasNext()&&inDic==false);
		
		return inDic;
}
}
