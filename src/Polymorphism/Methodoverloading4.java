package Polymorphism;

public class Methodoverloading4 {

	public static void main(String[] args) {
		Methodoverloading4 MO4=new Methodoverloading4();
		Object obj=new Object();
		MO4.Demo(obj);   //object method calling
		MO4.Demo("Java");//STring method calling
		MO4.Demo(null);
	//M04.Demo(null);  output-string method calling
		//When method is called with null,java tries to 
		//determine the most appropriate method
		//based on available overloaded methods.Since string is more specific than object
		//i.e string is a subclassof object ), the demo(string str)method is
		//selected for null	
	}
public void Demo(Object obj) {
	System.out.println("Object method calling");
}
public void Demo(String str) {
	System.out.println("String method calling");
}

}
