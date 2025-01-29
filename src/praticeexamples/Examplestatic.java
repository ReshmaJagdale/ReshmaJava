package praticeexamples;

public class Examplestatic {
	
	//Example of static
	public static int Method1() {
	
	int a=10;
	int b=40;
	int c=a+b;
	System.out.println(c);
	return a;
	}
	//Example of non static
	public char Method2() {
		char Grade = 'A';
		char result = 'B';
		return  Grade;
	}
	
	public static void main(String[] args) {
		int x= Method1();
	System.out.println(x);
	
	Examplestatic R= new Examplestatic();
	char B = R.Method2();
	System.out.println(B);
	}

}
