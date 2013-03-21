package lab8;

/**
 * @author s511264
 */
public class Centurion 
{
	int playerScore;
	
	public Centurion(){
		this.playerScore=0;
	}
	
	public int points(int score, String word){
		score+=wordValue(word);
		return score;
	}
	
	public int wordValue(String word){
		int wordTotal;
		String [] wordArray = new String[3];
		
		wordArray[0]=word.substring(0, 1);
		wordArray[1]=word.substring(1, 2);
		wordArray[2]=word.substring(2);
		
		wordTotal=letterValue(wordArray[0])
					+letterValue(wordArray[1])
					+letterValue(wordArray[2]);
		
		return wordTotal;
	}	
	
	public int letterValue(String letter){
		int point=0;
		if(letter.equals("a")){
			point=1;
		}
		if(letter.equals("b")){
			point=2;
		}
		if(letter.equals("c")){
			point=3;
		}
		if(letter.equals("d")){
			point=4;
		}
		if(letter.equals("e")){
			point=5;
		}
		if(letter.equals("f")){
			point=6;
		}
		if(letter.equals("g")){
			point=7;
		}
		if(letter.equals("h")){
			point=8;
		}
		if(letter.equals("i")){
			point=9;
		}
		if(letter.equals("j")){
			point=10;
		}
		if(letter.equals("k")){
			point=11;
		}
		if(letter.equals("l")){
			point=12;
		}
		if(letter.equals("m")){
			point=13;
		}
		if(letter.equals("n")){
			point=14;
		}
		if(letter.equals("o")){
			point=15;
		}
		if(letter.equals("p")){
			point=16;
		}
		if(letter.equals("q")){
			point=17;
		}
		if(letter.equals("r")){
			point=18;
		}
		if(letter.equals("s")){
			point=19;
		}
		if(letter.equals("t")){
			point=20;
		}
		if(letter.equals("u")){
			point=21;
		}
		if(letter.equals("v")){
			point=22;
		}
		if(letter.equals("w")){
			point=23;
		}
		if(letter.equals("x")){
			point=24;
		}
		if(letter.equals("y")){
			point=25;
		}
		if(letter.equals("z")){
			point=26;
		}			
		return point;
	}
}

