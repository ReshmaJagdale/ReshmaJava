package String;

public class String3 {

	public static void main(String[] args) {
		
		
		String S1=new String("Java");
		String S2=new String("Java");
		String S3=new String("Java");
		
		System.out.println(S1==S2); //Java==Java //False
		System.out.println(S1.equals(S2));  //True
		
		System.out.println(S1==S3);   //False
		System.out.println(S1.equals(S3)); //True
		
		String S4=new String("Java");
		String S5=new String("Java");
		String S6=new String("Test");
		
		System.out.println(S4==S5);     //False
		System.out.println(S4.equals(S5)); //True
		
		System.out.println(S5==S6);    //False
		System.out.println(S5.equals(S6));//False
		
	}

}
