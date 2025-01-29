package Logicalprograms;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		System.out.println(12%2);
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=SC.nextInt();
		
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0) 
				break;
			
			if(i==num){ 
				System.out.println("Prime Number");
			}
			else {
				System.out.println("Not a prime number");
			}
		}

	}

}
