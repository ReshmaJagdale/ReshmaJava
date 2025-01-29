package Logicalprograms;

public class StringBuffer1 {

	public static void main(String[] args) {
		String str="Hello";
		str.concat("World");
		System.out.println(str);
		
		StringBuffer SB=new StringBuffer("Hello");
		SB.append("Word");
		System.out.println(SB);
		
		StringBuffer SB1=new StringBuffer("Hello");
		SB1.append("Word");
		System.out.println(SB1);
		
		String Str1="Hello";
		for(int i=0;i<5;i++) {
			str=Str1+ "World";//creates a new string object in each iteration
			
		}
		System.out.println(Str1);
			
		StringBuffer SB2=new StringBuffer("Hello");
		for(int i=0;i<5;i++) {
			SB2.append("World");// modifies the same object
			}
		System.out.println(SB2);
	}

}
