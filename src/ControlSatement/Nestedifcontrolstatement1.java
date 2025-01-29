package ControlSatement;

public class Nestedifcontrolstatement1 {

	public static void main(String[] args) {
		//Syntax
				//if(condition) {
				//	if (Condition) {
				//		//COde executed
				//	}
					
				//} 
		int age=20;
		int weight=43;
		if (age>=20) { // 30>20 True
			
		if(weight>=45) {
			System.out.println("You are eligible for blood donation");
			
		}
		
		else {
			System.out.println("You are not eligible for blood donation");
		}
		}
		else {
			System.out.println("You must be above 18");
		}
	}

}
