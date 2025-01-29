package Abstraction;

public class Abstraction2 extends Abstraction1 {

	

	@Override
	public void M2() {
		
		System.out.println("child class M2 method");
	}

	@Override
	public void M3() {
		System.out.println("child class M3 Method");
		
	}

	@Override
	public void M4() {
		System.out.println("child class M4 Method");
		
	}
	public static void main(String[] args) {
		Abstraction1 AB1=new Abstraction2(); //Dynamic binding
      AB1.M1();
      AB1.M2();
      AB1.M3();
      AB1.M4();
      
      Abstraction2 AB2=new Abstraction2();
      AB2.M2();
		
	}
}
