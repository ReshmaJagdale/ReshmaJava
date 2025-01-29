package Javaloop;

import java.util.Scanner;

public class Forloop10 {
public static void main(String[] args) {
	Scanner SC =new Scanner(System.in);
	System.out.println("Enter number");
	int num=SC.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num+" * "+i+" = "+num*i);
	}			
}
}
