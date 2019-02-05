import java.util.ArrayList;
public class WordRecursion{

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";

	public static ArrayList<String> makeAllWords(int k, int maxLetter){
		ArrayList<String> result = new ArrayList<String>();
		return result;
	}

	public static ArrayList<String> Helper(int k, String word, ArrayList<String> data){
		if(k == 0){data.add(word);}
		char pos = alphabet.charAt(k);
		return Helper(k-1,word,data);
	}

	public static void main(String[] args){
		System.out.print("Not Complete Yet!" + "\n");
	}
}
