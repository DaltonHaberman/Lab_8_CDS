package lab8;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * @author s511264
 */
public class RunCenturion  
{
   public static void main(String[] args) throws FileNotFoundException 
	{
		String word;
		Centurion player1 = new Centurion();
		Centurion player2 = new Centurion();
		int player1Score=0;
		int player2Score=0;
		Scanner wordIn = new Scanner(System.in);
		
		while(player1Score<100){
			boolean inDictionary = false;
			while(inDictionary==false){ 
				System.out.println("Enter a word");
				word=wordIn.nextLine();
				inDictionary = inDic(word); //tests if word is in the dictionary
				if(inDictionary==true){  //if word is in Dictionary, add points
					player1Score=player1.points(player1Score, word);  //adds points
				}	
			}
		}
		//attempt at making computer portion
		while(player2Score<100){
			String compWord = compWord();
			System.out.println("Enter a word");
			System.out.println(compWord);
			player2Score=player2.points(player2Score, compWord);
		}
		
		System.out.println("Player 1 score is: " + player1Score);
		System.out.println("Player 2 score is: " + player2Score);
   }
	//tests if word is in dictionary
	public static boolean inDic(String word) throws FileNotFoundException{
		boolean inDic=false;
		File file = new File("corncob_lowercase.txt");
		Scanner dictionary = new Scanner(file);
		
		do{
			if(word.equals(dictionary.nextLine())){
				inDic=true;
			}			
		}while(dictionary.hasNext()&&inDic==false);
		
		return inDic;
	}
	//calculates best possible word for computer input
	public static String compWord() throws FileNotFoundException{
		Centurion wordObject = new Centurion();
		File file2 = new File("corncob_lowercase.txt");
		Scanner dictionary2 = new Scanner(file2);
		
		String dicWord = dictionary2.next();
		int points = wordObject.wordValue(dicWord);
		String wordComparison;
		
		while(dictionary2.hasNext()){
			int points2 = wordObject.wordValue(dictionary2.next());
			wordComparison = dictionary2.next();
			if(points2>points){
				points=points2;
				dicWord=wordComparison;
			}
		}
		
		return dicWord;
	}
}
