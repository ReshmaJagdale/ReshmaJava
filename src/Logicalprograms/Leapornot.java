package Logicalprograms;

public class Leapornot {

	public static void main(String[] args) {
		
			int year=4000;
			if(year%4==0) {
				System.out.println("This is Leap year");
			}
		 else if(year%100==0) {
			 System.out.println("This is leap year");
			}
		 else if(year%400==0) {
			 System.out.println("This is leap year");
		 }
		 else {
			 System.out.println("This is not leap year");
		 }
	}

}
