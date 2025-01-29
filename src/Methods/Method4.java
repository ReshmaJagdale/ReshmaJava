package Methods;

public class Method4 {
	public static void main(String[] args)
	{
		System.out.println("Starting Point");
		test2();
		Method5.Demo1();
		Method5.Demo2();
		
		System.out.println("Completed");
	}
public static void test2() {
	System.out.println("Static method calling from same class");
}
}
