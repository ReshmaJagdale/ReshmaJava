package String;

public class String2 {

	public static void main(String[] args) {
		//How many object will be created
		//SCP-test-3+1// heap-2
		String S1="Test";
		String S2="Test";
		String S3=new String("Java");
		String S4=new String("Test");
		String S5=new String("Automation");
		
		System.out.println(S1==S4);
		System.out.println(S1.equals(S4));
		
	}

}
