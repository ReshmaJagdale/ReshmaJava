package ControlSatement;

public class Nestedifcontrolstatement2 {

	public static void main(String[] args) {
		//Syntax
		//if(condition) {
		//	if (Condition) {
		//		//COde executed
		//	}
			
		//} 
		
		int a=100;
		int b=20;
		int c=50;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greatest number");
			}
			}
		else if(b>c&& b>a) {
			System.out.println("b is greatest number");
		}
			else {
				System.out.println("c is greatest number");
			}
			
		}
	}

