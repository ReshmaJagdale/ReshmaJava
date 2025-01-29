package Arrays;

public class Array4 {

	public static void main(String[] args) {
		Array4 a4=new Array4();
		
		String str[]=new String[4];
		String str1[]=new String[4];
		String []str2=new String[4];
		
		str[0] ="Ketan";
		str[1]="Java";
		str[2]="Automation";
		str[3]="Manual";
		
		//str[3]=33;
		System.out.println(str[2]);
		System.out.println(str[0]);
		
		System.out.println();
		for(int Test=0;Test<=str.length-1;Test++) {
			System.out.println(str[Test]);
		}
	}

}
