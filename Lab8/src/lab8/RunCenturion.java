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
		int player1Score=0;
		Scanner wordIn = new Scanner(System.in);
		
		while(player1Score<100){
			System.out.println("Enter a word");
			word=wordIn.nextLine();
			boolean inDictionary = inDic(word); //tests if word is in the dictionary
			if(inDictionary==true){  //if word is in Dictionary, add points
				player1Score=player1.points(player1Score, word);
			}
		}
		System.out.println("Player 1 score is: " + player1Score);
   }
	
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
}
