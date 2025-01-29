package Polymorphism;

public class Methodoverloading3 {

	public static void main(String[] args) {
		//Small size primitive to large size data type
		//Automation Promotion
		Methodoverloading3 MO3=new Methodoverloading3();
		MO3.Demo1();
		MO3.Demo1(12);
		MO3.Demo1(12.45);
		//MO3.Demo1(44.5f);	

	}
	//public void Demo1(char i){
//System.out.in("char input para method");
//}

	public void Demo1() {
		System.out.println("Zero input parameter");
	}
	public void Demo1(int i) {
		System.out.println("1 input Parameter");
	}
	public void Demo1(Double i) {
		System.out.println("Double input Parameter");
	}
//	public void Demo1(flaoat i) {
	//	System.out.println("float input Parameter");
	//}
	public void Demo1(long i) {
		System.out.println("long input Parameter");
	}
	
	
}
