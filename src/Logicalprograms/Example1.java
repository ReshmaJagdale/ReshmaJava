package Logicalprograms;

public class Example1 {

	public static void main(String[] args) {
		String[] input= {"rsg4h5gg", "dghu7jjh1","fdth6vb3"};
		   //    o/p:      //9  8   9
		
		for(String str:input) {
			int sum=0;
			char test[]=str.toCharArray();
			for(char c:test) {
				if(Character.isDigit(c)) {
					sum=sum+Character.getNumericValue(c);
				}
			}
			System.out.println(sum);
		}
		
	}

}
