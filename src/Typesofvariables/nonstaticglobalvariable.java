package Typesofvariables;

public class nonstaticglobalvariable {
	//in global variables variables are declared
	//within class and outside method
	//declared outside method
static int rollno=3;
static String name ="Tanvi";
	public static void main(String[] args) {
		//for nonstatic we need to create object
	nonstaticglobalvariable obj =new nonstaticglobalvariable();
	obj.Demo();
	
		System.out.println(rollno);
		System.out.println(name);

		//Diffrent class
		System.out.println(Differentclass.test);
		System.out.println(Differentclass.name);	
	}
public void Demo() {
	int a=20;
	String Name="Automation testing";
	System.out.println(a);
	System.out.println(Name);
	
}
}
