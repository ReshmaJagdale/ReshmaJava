package Arrays;

public class Array1 {
     //int arr[]=new int[4];
	//arr[5]=44;
	
	//Array is a collection of similartype of data or element
	//array is a index based and firstelement is of array stores at oth index and
	//last index index ins N-1)Lenghth of array_)
	
	//single dimension array
	public static void main(String[] args) {
		int arr[]=new int [10];    //0 to 9
		
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
		
		//Second way
		
		int A2[]= {10, 20, 30,40, 50};
		int len=A2.length;
		System.out.println(len);
		System.out.println(arr[4]);
		System.out.println(A2.length);

		//NegativeArraySizeexception
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}

}
