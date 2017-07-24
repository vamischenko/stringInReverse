package words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsMain {
	
	private static String readString() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
		return str;
	}
	
	private static String reverseWords(String str) {
		
		String[] words = str.split(" ");
		String result = "";
		for(int i = 0; i < words.length; i++){
			for(int j = words[i].length() - 1; j >= 0 ; j--){
				result += words[i].substring(j, j+1);
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {	
		
		System.out.println("Input string:");
	    String str = readString();
	    System.out.println("String with reverse words:");
        System.out.println(reverseWords(str));
	}

}
