
package Arrays;

public class Arraylogicalprogram1 {

	public static void main(String[] args) {
		int A2[]= {10, 20, 30,40, 50}; //150
		int len=A2.length;
		
		int sum=0;
		
		for(int i=0;i<=len-1;i++) {
			
			sum=sum+A2[i];
		}
		System.out.println("sum of given array--->"+sum);

	}

}
