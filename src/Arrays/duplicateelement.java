package Arrays;

public class duplicateelement {

	public static void main(String[] args) {
		
		int Arr[]= {10 ,20, 30,40,10,20,50};
		
		//size of array is 7
		int len=Arr.length; //7
		
		for(int i=0;i<len;i++) { //0  0<7   --true 1<7 -true
			
			for(int j=i+1; j<len ;j++) {//1<7 true 7<7 false false
				if (Arr[i]==Arr[j]) { //10==20 -fLSE 10==30  -FALSE 10==40 10==50 10==10  10==20 10==50
					System.out.println(Arr[i]+" ");//10,20
				}
				
			}
			
		}
		

	}

}
