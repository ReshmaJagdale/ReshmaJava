package String;

public class StringMethods {

	public static void main(String[] args) {
		
		
		//ChaAt Function method
		//It return char value for the specified
		
		String S1="Automation";  
		//System.out.println(S1.charAt(19)); //StringIndexOutOfBoundsException

		System.out.println(S1.charAt(2));
		System.out.println(S1.charAt(8));
		
		//Length -it return length and size of string
		System.out.println(S1.length());
		/*  .equals means -Content comparision meansthe two given string based 
		 * on content of the string */
		
		String S2="Test";
		String S3="Java";
		String S4="Test";
		String S5=new String ("Test");
		System.out.println(S2.equals(S3));//False
		System.out.println(S2.equals(S4));//True
		System.out.println(S2.equals(S5));//True
		
		//Is Empty
		String S6="Java";
		String S7=" ";
		System.out.println(S7.charAt(0));
		System.out.println(S6.isEmpty());
		System.out.println(S7.isEmpty());
		
		String S8=null;// java.lang.NullpointerException
		//System.out.println(S8.isEmpty());
		
		//Replace
		String S9="Java";
		
		System.out.println(S9);
		System.out.println(S9.replace('a', 'b'));
		System.out.println(S9.replace('J', 'F'));
		System.out.println(S9);
		
		//Split
		String Str="Hi Good evening";
		String arr[]=Str.split(" ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String arr1[]=Str.split("i");
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("****");
		
		for(String str:arr) { //for each loop
			System.out.println(str);
		}
		int [] number= {1,2,4,5,6,7};
		
		int sum=0;
		for(int num:number) {
			sum+=num;
			//sum=sum+num
		}
		System.out.println(sum);
			
		}
		
	}
	
