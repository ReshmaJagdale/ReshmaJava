package String;

public class Logicalprogram {

	public static void main(String[] args) {
		
		String str="Hello World";
		//dlroW olleH
		
		int len =str.length();
		
		String Rev="";
		
		for(int i=len-1;i>=0;i--) {
			Rev=Rev + str.charAt(i);
		}
		System.out.println(Rev);
	}

}
