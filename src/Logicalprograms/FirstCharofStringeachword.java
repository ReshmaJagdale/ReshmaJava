package Logicalprograms;

public class FirstCharofStringeachword {

	public static void main(String[] args) {
		//Auto-generated method stub

		
		String Str="Auto-generated method stub";
		//A g m s
		Str=Str+" ";
		
		String Str1="";
		
				for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
					if(Character.isWhitespace(ch)) {
						System.out.println(Str1.charAt(0)+" ");
						
						Str1="";
					}
		
				else {
					Str1=Str1+ch;
				}
	
	}
	}
}
