package Methods;

public class Method1 { //Class Body--className--Method1
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		//Calling by MethodName
		//Syntax: MethodName();
		Test();
		Test1();
		
		
		//Calling by Classname.Methodname();
				Method1.Test();
				Method1.Test1();
				System.out.println("Main Method Ended");
	}
		
		;
		//Static Method
		public static void Test() {
			System.out.println("Static Method Started--->Test");
			
		}
		public static void Test1() {
			System.out.println("Static Method Ended--->Test1");
		}
	}


