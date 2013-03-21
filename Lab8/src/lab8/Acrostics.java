package lab8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author s503221
 */
public class Acrostics 
{
		
	public static void playAcrostics()
	{
		Scanner input = new Scanner(System.in);
		int player1Score = 0;
		int player2Score = 0;
		String answers;
		String startingWord;
		ArrayList<String> allAnswers = new ArrayList<String>();
		String word;
		
		System.out.print("Please enter a word to generate acrostics: ");
		startingWord = input.next();
		
		for(int i = 0; i < startingWord.length(); i++)
			{
				System.out.println(startingWord.charAt(i)+"-----"+startingWord.charAt(startingWord.length()-1-i));
			}
		System.out.println();
		
		System.out.print("Player 1: ");
		answers = input.next();
		
		String[]tokens = answers.split(",");
		for(String t : tokens)
		{
			allAnswers.add(t);
		}
		for(int i = 0; i < startingWord.length(); i++)
		{
			word = allAnswers.get(i);
			if(word.charAt(0)==startingWord.charAt(i)&& word.charAt(word.length()-1)==startingWord.charAt(startingWord.length()-1-i))
			{
				player1Score += word.length();
			}
		}
		System.out.println("Player 1 score: " + player1Score);
	}
}
