package ExceptionalHandling;

import java.text.NumberFormat;

public class ExceptinalHandling3 {

	public static void main(String[] args) {
		
		//MultipleCatchBlocks
		System.out.println("Program is Started");
		String S1=null;
		try {
			System.out.println(S1.length());//null
		}
		catch (ArithmeticException e){
			e.getMessage();
			System.out.println("Handle Exception1");
			
		}
		catch (NumberFormatException e){
			e.getMessage();
			System.out.println("Handle Exception 2");
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.getMessage();
			System.out.println("Handle Exception 3");
		}
		catch (Exception e){
			e.getMessage();
			System.out.println("Handle Exception 4");
		}
		System.out.println("Program Completed");
	
	}
	
	}


