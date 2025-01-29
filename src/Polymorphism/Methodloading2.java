package Polymorphism;

public class Methodloading2 {

	public static void main(String[] args) {
		Methodloading2 M2=new Methodloading2();
		M2.addition(10,20);
		Methodloading2.addition(10,"Test");
		Methodloading2.addition (10,20,"Automatic");
		
	}

	public void addition(int i,int j) {
		int add=i+j;
	//	int k=30;
		System.out.println("Addition of two int number-->"+add);
	}
	public static void addition(int i,String K) {
		System.out.println(i+K);
		System.out.println("Two input Para method");
	}
	public static void addition(int i,int j,String K) {
		System.out.println(i+j+K);
		System.out.println(K+i+j);
		System.out.println("Two input Para method");
	}
	
	
	
}
