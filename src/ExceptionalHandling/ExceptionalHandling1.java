package ExceptionalHandling;

import java.util.Scanner;

public class ExceptionalHandling1 {

	public static void main(String[] args) {
	
		System.out.println("Program is Started");
		
		Scanner SC= new Scanner (System.in);
		
		//System.out.println("Enter a number");
		// int num=SC.nextInt();
		
	//	System.out.println(100/num);
		
	//	System.out.println("Program Completed");
		//Example 2:
		int [] arr=new int[5];
		//arr[5]=40;
		System.out.println("Enter the Position (0-4)");
		int test =SC.nextInt();
		
		System.out.println("Enter a Value");
		int test1=SC.nextInt();
		arr[test]=test1;
		System.out.println(arr[test]);
		
		System.out.println("Program is completed");
		
		//Example3
		String S1="123456";
		String S2="Java";
		int num=Integer.parseInt(S1);
		//int num1=Integer.parseInt(S1);     //.NumberFormatException;
		
		System.out.println(num);
		//System.out.println(num1);
		System.out.println("Program is completed");
		
		//Example4
		String S4=" ";
		String S5=null;
		System.out.println(S4.length());
		System.out.println(S5.length());   //java.lang.NullPointerException
		

	}

}
