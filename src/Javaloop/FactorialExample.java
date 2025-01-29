package Javaloop;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.print("Enter number");
		int num=Sc.nextInt();
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac=fac*i;
		}
System.out.println("Fac of " +num+ "is---"+fac);
	}

}
