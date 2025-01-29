package Typesofvariables;

public class Staticglobalvariable {
 static int a =10;
 static String name="Tanvi";
	//Creating a Variable outside the method or function
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);
		Staticglobalvariable.Demo1();
		
		Staticglobalvariable obj=new Staticglobalvariable();
		obj.Demo2();
	}
//Static Method
	public static void Demo1() {
		a=20;
		name="Java";
		System.out.println(a);
		System.out.println(name);
	}
	//Non static method
	public void Demo2() {
		a=200;
		name="Ashish";
		System.out.println(a);
		System.out.println(name);	
	}	
}
