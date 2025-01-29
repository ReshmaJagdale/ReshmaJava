package Methods;

public class Method13 {
	public static void main(String[]args) {
		Method13.Demo();
		Method13.Demo1();
		Method13.Demo2(200, 100);
		Method13.Addition(200, 300);
	}

	
	public static void Demo() { //Zero line output
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition of two numbers--->" +c);
	}
	public static void Demo1() { //Zero line output
		int a=60;
		int b=40;
		int c=a+b;
		System.out.println("Addition of two numbers--->" +c);
	}
	public static void Demo2(int a,int b) {//2 input parameter
		int c=a+b;
		System.out.println("Addition of two numbers c---->" +c);
	}
	
	public static void Addition( int x,int y) {
		int z=x+y;
		System.out.println("Addition of two number z---->" +z);
	}
	
}