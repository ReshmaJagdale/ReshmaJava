package Logicalprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		// 153===1^3   5^3  3^3=153
		int sum,num,Rem,originalnumber;
		num=153;
		originalnumber=153;
		
		for(sum=0; num>0;num=num/10) {
			Rem=num%10;
			sum=sum+Rem*Rem*Rem;
		}
		if(sum==originalnumber) {
			System.out.println("Armstrong Number");
		}
else {
		System.out.println("not Armstrong Number");
	}
		}

		}
		
		
	

