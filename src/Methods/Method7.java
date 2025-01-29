package Methods;

public class Method7 {
	public static void main(String [] args)
	{
		System.out.println("Hello World");
		//Calling By classname.methodname();
		//Calling from Method6(ClassName).methodName();//Methodname :sum//Mul//Div
		
		Method6.Sum();
		Method6.Div();
		Method6.Mul();
		Method7.Demo1();
	}
	public static void Demo1() {
		System.out.println("Method7 is of same classname and demo1 is Methodname");
	}
}
