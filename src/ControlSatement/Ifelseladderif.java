package ControlSatement;

public class Ifelseladderif {

	public static void main(String[] args) {
		int result=55;
		if (result>65) {
			System.out.println("Result==Distinction");
		}
		else if(result>60){
			System.out.println("Result==First Class");
		}
		else if(result>55){
			System.out.println("Result==Higher Second Class");
		}
		else if(result>50){
			System.out.println("Result==second Class");
		}
		else if(result>35){
			System.out.println("Result==pass");
		}
		else {
			System.out.println("Result==Fail");
		}
		
	}

}
