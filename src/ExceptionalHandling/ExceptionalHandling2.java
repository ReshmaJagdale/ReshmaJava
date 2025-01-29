package ExceptionalHandling;

import java.util.Scanner;


public class ExceptionalHandling2 {

	public static void main(String[] args) {
		/** 
		 * try  
		 * 
		 * statement
		 * 
		 * } catch (Exception name){
		 * 
		 * Statement;}
		 * 
		 */
		System.out.println("Program completed");
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=SC.nextInt();
		try {
			System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data");
			System.out.println("Hello");
		}
		String S1="123456";
		String S2="Java";
		try {
		//	int num1=Integer.parseInt[S2];
		}
		catch(NumberFormatException e) {
			System.out.println("Hello");
			
		}
		System.out.println("Program Completed");
	}

}
