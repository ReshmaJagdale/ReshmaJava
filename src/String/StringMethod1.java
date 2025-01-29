package String;

public class StringMethod1 {

	private static final String str = null;

	public static void main(String[] args) {
		//equalignorecase
		
		String S1="JAVA";
		
		String S2="java";
		System.out.println(S1.equals(S2));//false
		System.out.println(S1.equalsIgnoreCase(S2));//true
		
		//Substring
		String S3="Velocity Classes     ";
		System.out.println(S3.length());
		
		System.out.println(S3.substring(4));
		
		System.out.println(S3.substring(4 ,8));
		
		System.out.println(S3.substring(9, 16));
		
		//IndexOf
		String S4="Velocity Classes java testingc";
		
		System.out.println(S4.length());
		
		System.out.println(S4.indexOf('c'));// 1st occurrance
		
		System.out.println(S4.indexOf('c' ,S4.indexOf('c')+2));
		
		System.out.println(S4.indexOf('c' ,S4.indexOf('c')+1)+1);
		
		//lower case
		String S5="JAVA";
		System.out.println(S5.toLowerCase());
		
		//ToUpper case
		String S6="Java";
		System.out.println(S5.toUpperCase());
		
		//Trim
		//It remove starting or ending Spaces
		
		String S7="Velocity classes java testingc     ";
		System.out.println(S7);
		System.out.println(S7.trim());
		//Trim ,charAt,Split,Substring
		String S8="12/12/2024";
				String[] str=S8.split("/");
				for(String num:str) {
					System.out.println(num);
				}
				
				String a="Hello";
				String b="Java";
				
				int x=10;
				int y=20;
				
				System.out.println(x+y); //30
				System.out.println(a+b);
				System.out.println(a+b+x+y);
				System.out.println(x+y+a+b);
				System.out.println(a+b+(x+y));
				
				}
	
	}

