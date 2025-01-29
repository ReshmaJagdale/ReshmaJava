package Typesofvariables;

public class localvariable2 {
	//Variables are declared within method or constructor
public static void main(String[] args) {
	//non static
	localvariable2 obj=new localvariable2();
	obj.Demo1();
	obj.Demo2();
	//Static way		
	localvariable2.Demo2();
}

public void Demo1() {
	int A1=12;
	String Name ="Tanvi";
	double D1=44.22;
	char Grade='A';
	float F1=22.2f;
	System.out.println(A1);
	System.out.println(Name);
	System.out.println(D1);
	System.out.println(Grade);
	System.out.println(F1);
}
public static void Demo2() {
	int S1=21;
	String Firstname="Reshma";
	System.out.println(S1);
	System.out.println(Firstname);
}

}
