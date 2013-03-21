package lab8;

import java.util.Scanner;

/**
 * @author s511264
 */
public class RunBeheadments 
{
   public static void main(String[] args) 
	{
		Beheadments word;
		String words;
		Scanner wordIn = new Scanner(System.in);
		
		System.out.println("Enter words:");
		words = wordIn.nextLine();
		System.out.println("more");
		String words2 = wordIn.nextLine();
		
		word = new Beheadments(words);
		System.out.println(word.sameLetters(words2));
		
		

   }
}
