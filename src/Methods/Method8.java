package Methods;

public class Method8 {
	public static void main(String[] args)
	{
		//non static calling method from same class
		//object calling syntax:
		//Synatx:classname ojectreferencevariablename=new classname();
		Method8 obj=new Method8();
		
				//Non method calling syntax
				//syntax: ojectreferencevariablename.methodname();
				
		obj.Demo1();
		obj.Demo2();
	}

	public void Demo1() {
		System.out.println("non static method calling from same class");
	
	}
	public void Demo2() {
		System.out.println("non static method calling from same class");
	}
		
}
