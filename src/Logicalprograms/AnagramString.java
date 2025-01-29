package Logicalprograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String S1="race";
		String S2="care";
		
		//check length is same
		if(S1.length()==S2.length()) {
			char[]c1=S1.toCharArray();
			char[]c2=S2.toCharArray();
			
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean result=Arrays.equals(c1, c2);
			if(result) {
				System.out.println(S1+ " and "+S2+"  are anagram string");
				
			}
			else {
				System.out.println(S1+ " and "+S2+"  are not anagram string");
			}	
		}
	}

}
