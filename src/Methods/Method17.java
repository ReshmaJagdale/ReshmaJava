package Methods;

public class Method17 {

	public static void main(String[] args) {
		//create an object of the class
		
		Method17 obj1 =new Method17();
		int value=obj1.M1();
		System.out.println(value);
		
		float value1=obj1.M2();
		System.out.println(value1);
		
		char value2=obj1.M3();
		System.out.println(value2);
		
		
	}
	public int M1() {
		System.out.println("M1 is method");
		return 40;	
	}
	public float M2() {
		System.out.println("M2 is method");
		return 50.5f;
	}
	public char M3() {
		System.out.println("M3 is method");
		return 'A';
		
	}
	
	
	
}
