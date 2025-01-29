package Logicalprograms;

public class Starpattern3 {

	public static void main(String[] args) {
		
			for(int i=1;i<=5;i++) {//outer loop for rows
				
				for(int j=1;j<=5;j++) { //inner loop for column
					
					if(j>=i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}	
		System.out.println();
		}
	}

}
