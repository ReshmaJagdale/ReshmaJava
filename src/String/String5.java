package String;

public class String5 {

	public static void main(String[] args) {
		//Difference between operator and .equals method
		
		String S1="Java";
		String S2="Python";
		String S3="Java";
		
		System.out.println(S1==S3);  //True
		System.out.println(S1.equals(S3)); //True
		
		String S4=new String(" ");
		String S5=new String("C#");
		String S6=new String(" ");
		System.out.println(S4);
		
		System.out.println(S4==S6);   //False
		System.out.println(S4.equals(S6)); //True
		
		/* ==Always compare reference comparision or address com
		ref comp means if both ref point into the same object then
		it is give output True.*/
		
		/*.equals method-Content comparision means the two given string
		based on content of the given string if any char is not matched it return false
		if all character are matcged it will return true */
	}

}

