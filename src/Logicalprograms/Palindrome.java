package Logicalprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int Originalnumber,sum,Rem;
		
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the number");
		  int num=SC.nextInt();
		  Originalnumber=num;
		  
		  for(sum=0;num>0;num=num/10) {
			  Rem=num%10;
			  sum=sum*10+Rem;
		  }
		  if (sum==Originalnumber) {
			  System.out.println("Palindrome Number");
		  }
		  else {
			  System.out.println("Not a Palindrome Number");
		  }
		  SC.close();
	}

}
