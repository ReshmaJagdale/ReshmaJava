package Polymorphism;

public class Methodoverloading1 {

	public static void main(String[] args) {
		Methodoverloading1 MO=new Methodoverloading1();
		MO.M1();
		MO.M1(12);
		MO.M1("Automation");
		MO.M1("Java",12);
		MO.M1(10,11);
		
	}
public void M1() {
	System.out.println("Zero Input Parameter method");
	
}
	public void M1(int j) {
		System.out.println("one input parameter");
	}
	public void M1(String i) {
		System.out.println("one input parameter");
	}
	
	public void M1(String k,int j){
		System.out.println("Two Input Parameter Method");
	}
	
	public void M1(int i ,int k) {
		System.out.println(i);
		System.out.println(k);
		System.out.println("Two input parameter method");
	}

	
}
