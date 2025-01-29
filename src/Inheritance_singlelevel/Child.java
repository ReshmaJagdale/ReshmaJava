package Inheritance_singlelevel;

public class Child extends Father {
	
	public void Bike() {
		System.out.println("Bike--->FZ");
	}

	public static void main(String[] args) {
		Child C1=new Child();
		
		C1.Bike();
		C1.Home();
		C1.Car();
		C1.Money();
	}

}
