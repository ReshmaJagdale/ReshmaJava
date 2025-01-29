package String;

public class String6 {

	public static void main(String[] args) {
		//String Mutable

		String S1="Pune";
		
		S1="RRR";
		System.out.println(S1);
		
		String S2="Mumbai";
		String S3="Pune";
		String S4="Pune";
		S4="Solapur";
		
		System.out.println(S1);
		System.out.println(S4);
		
		String str="Hello";
		
		str.concat("World");
		System.out.println(str); //Hello world
		
		/*Once we created an object after that jay a does not allow to perform any changes
		 * but it your trying to perform any changes with those changes  
		 * new object will be created   */
		
	}

}
