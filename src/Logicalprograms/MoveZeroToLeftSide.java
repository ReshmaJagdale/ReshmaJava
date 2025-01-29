package Logicalprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroToLeftSide {

	public static void main(String[] args) {
		
		int input[]= {1,4,0,6,4,05,0,1,2,0,4,0};
		
		//Expected o/p:0,0,0,0,0,1,4,6,4,5,1,2,4
		
		int nonZeroCount=0;
		int NewArray[]=new int[input.length];
		
				for(int num: input) {
					if(num!=0) {
						
						NewArray[nonZeroCount] =num;
						nonZeroCount++;
						
					}
				}
		
		String Str=Arrays.toString(NewArray);	
		//System.out.println(Str);
		String Rev="";
		for(int i=Str.length()-2;i>0;i--) {
			Rev=Rev+ Str.charAt(i);
			
		}
		System.out.println(Rev);
		
	}

}
