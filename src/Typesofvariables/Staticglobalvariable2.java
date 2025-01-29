package Typesofvariables;

public class Staticglobalvariable2 {
	//nonstatic variable are declared in class and outside method
	static int r=20;
	static String name="Tanvi";

	public static void main(String[] args) {
		//static variable calling from same class
		Staticglobalvariable2.Demo1();
		System.out.println(r);
		System.out.println(name); 
		
		//static variable calling from diffrent class
		System.out.println(Differentclass.test);
		System.out.println(Differentclass.name);
		
		//direct calling by method name
		Demo1();
	}
public static void Demo1() {
	int A=25;
	String Name="Reshma";
	System.out.println(A);
	System.out.println(Name);
}
}
