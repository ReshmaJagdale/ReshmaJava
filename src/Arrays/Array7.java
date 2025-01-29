package Arrays;

public class Array7 {

	public static void main(String[] args) {
		String str1[]=new String[5];//row
		
		String str[][]=new String[5][5];//2D arrays//multiple array
										//row col
		Object obj[][]= new Object[5][5];
		
		System.out.println("Row--->"+str1.length);
		System.out.println("column-->"+str.length);
		
		str [0][0]="A1";
		str [0][1]="A2";
		str [0][2]="A3";
		str [0][3]="A4";
		str [0][4]="A4";
		
		str [1][0]="B1";
		str [1][1]="B2";
		str [1][2]="B3";
		str [1][3]="B4";
		str [1][4]="B5";
		
		str [2][0]="C1";
		str [2][1]="C2";
		str [2][2]="C3";
		str [2][3]="C4";
		str [2][4]="C5";
		
		str [3][0]="D1";
		str [3][1]="D2";
		str [3][2]="D3";
		str [3][3]="D4";
		str [3][4]="D5";
		
		System.out.println(str[0][2]);
		System.out.println(str[3][3]);
		
		for(int Row=0 ;Row<str.length;Row++) {
			
			for(int col=0 ;col<=str[3].length-1;col++) {
				System.out.println(str[Row][col]+" ");
			}
			System.out.println();
		}
	}

}
