package Logicalprograms;

import java.util.HashMap;
import java.util.Hashtable;

public class WordOccurance {

	public static void main(String[] args) {
		
		String str="python,Java,python,Ruby,Javascrit,Java,Java";
		// python 2
		//Java 3
		//Ruby 1
		//javascript 1
		String words[]=str.split(",");
		
		HashMap<String,Integer> WC =new HashMap<String,Integer>();
		
		for(String word : words) {
			
			if(WC.containsKey(word)) {
				
				WC.put(word, WC.get(word)+1);
					
				}
			else {
				WC.put(word, 1);
			}
		}
		System.out.println(WC);
	}

}
