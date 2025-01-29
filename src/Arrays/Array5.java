package Arrays;

public class Array5 {

	public static void main(String[] args) {
		Object obj []=new Object[6];//Heterogeneous type of data/ non similar type of data
		
		obj[0]=1;
		obj[1]="Java";
		obj[2]="true";
		obj[3]='3';
		obj[4]=12.4f;
		obj[5]=22.44;
		
		System.out.println(obj[4]);
		
		for(int i=0; i<obj.length;i++) {
			System.out.println(obj[i]);
			
		}
		
	}

}
