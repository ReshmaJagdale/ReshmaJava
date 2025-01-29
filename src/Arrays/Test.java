package Arrays;

public class Test {

	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		int n3=30;
		System.out.println(n2);
		
		//array declaration
		//Datatype variablename []=new datatype[numbers];
		int arr[]=new int[10];
		
		//Syntax:
		

	//arrayname[]indexnumber=value;
	//array initialisation
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
		//arr[10]=300;//ArrayIndexOutOfBoundsException
		//usages
		
		System.out.println(arr[8]);
		//System.out.println(arr[10]);
		System.out.println(arr[1]);
		
		int size=arr.length;
		System.out.println(size);
	}

}
