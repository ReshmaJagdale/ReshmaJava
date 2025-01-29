package Wrapperclass;

public class Example1 {

	public static void main(String[] args) {
		String S1="10";
		String S2="20";
		
		System.out.println(S1+S2);
		//data conversion from string to int
		int i=Integer.parseInt(S1);
		int j=Integer.parseInt(S2);
		
		System.out.println(i+j);
		
		String Str1="1000";
		String Str2="2000";
		
		int I2=Integer.parseInt(Str1);
		int I3=Integer.parseInt(Str1);
		System.out.println(I2+I3);
		
		String S3="44.22";
		String S4="33.66";
		double D1=Double.parseDouble(S3);
		double D2=Double.parseDouble(S4);
		
		System.out.println(D1+D2);
	}

}
