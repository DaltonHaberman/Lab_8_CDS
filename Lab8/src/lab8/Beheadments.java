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
	
	public boolean sameLetters(String wordIn){
		boolean trueFalse = false;
		boolean itsIn= false;
		if(wordIn.length() == this.word.length()){
			char [] wordInArray = wordIn.toCharArray();
			char [] wordArray = word.toCharArray();
			for(int i=0; i<wordInArray.length; i++){
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
	
	public boolean letterBigger(String wordIn){
		boolean trueFalse = false;
		if((wordIn.length()-this.word.length()==1)&& //if new word is one letter longer
			){
			trueFalse = true;
		}
		return trueFalse;
	}

}
