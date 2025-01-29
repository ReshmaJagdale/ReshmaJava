package praticeexamples;

public class returntypemethod {
	public static int additionmethod() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return b;
	}

	public static void main(String[] args) {
		additionmethod();
		int x= additionmethod();
		System.out.println(x);
		
		System.out.println(x+100);
			}

}
