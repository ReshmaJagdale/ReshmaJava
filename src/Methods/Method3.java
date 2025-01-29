package Methods;

public class Method3 {// classBody  ClassName--->Method3
	public static void main(String[] args) {
		test1(); //calling by same Methodname();
		
		Method3.test1();//Calling by classname syntax--ClassName.MethodName();
	}
	public static void test1() {
		System.out.println("Same Class");
		
	}

}
