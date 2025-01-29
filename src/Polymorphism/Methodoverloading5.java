package Polymorphism;

public class Methodoverloading5 {

	public static void main(String[] args) {
		Methodoverloading5 M5=new Methodoverloading5();
		M5.Demo("Test");
		String sb="test";
		StringBuffer sb1=new StringBuffer("Java");
		M5.Demo(sb1);
		//M5.Demo(null);//CTE-compile time error
	//Reason for compile-time error:if you comment this line ,you will get a compile-time error(CTE).
	//This is because null can matcheither the string or the stringbuffer method,and java cannot
	//determine which one to call.Since bothmethods are equally valid (as both string
	//and stringbuffer are reference types) and compile faces ambiguity and cannot
	//choose between the two
		
		
	}
	public void Demo(String str) {
		System.out.println("String method calling");
	}
	public void Demo(StringBuffer str) {
		System.out.println("STringBuffer method calling");
	}
}
