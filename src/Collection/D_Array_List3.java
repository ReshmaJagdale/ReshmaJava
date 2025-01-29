package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array_List3 {

	public static void main(String[] args) {
		
		
		String Arr[]= {"Ashish","Reshma","Tanvi","Jagdale"};
		System.out.println(Arr);
		
		for(String str:Arr) {
			System.out.println(str);
			
			//To convert Array to ArrayList
			ArrayList Al=new ArrayList(Arrays.asList(Arr));
			System.out.println(Al);
		}
	}

}
   