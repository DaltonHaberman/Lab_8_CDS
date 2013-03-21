package lab8;

/**
 * @author s511264
 */
public class Beheadments 
{
	String word;
	
	public Beheadments(String wordIn){
		this.word = wordIn;
	}
	//tries to test if the word is the same length and contains same letters
	public boolean sameLetters(String wordIn){
		boolean trueFalse = false;
		boolean itsIn= false;
		if(wordIn.length() == this.word.length()){
			char [] wordInArray = wordIn.toCharArray();  //changes words to char arrays
			char [] wordArray = word.toCharArray();
			for(int i=0; i<wordInArray.length; i++){      //about to test if chars are same
				while(int thing = wordInArray.length >)
				if(wordInArray[0]==wordArray[i]){
					itsIn=true;
				}
				else
					wordInArray[]
			}
		}
		return trueFalse;
	}
	//tries to test if the word is one letter longer and contains same letters
	public boolean letterBigger(String wordIn){
		boolean trueFalse = false;
		if((wordIn.length()-this.word.length()==1)&& //if new word is one letter longer
			){
			trueFalse = true;
		}
		return trueFalse;
	}

}
