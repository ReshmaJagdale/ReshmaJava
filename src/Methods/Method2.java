package Methods;

public class Method2 { //Class Body ClassName:Method2
	public static void main(String [] args) {
		System.out.println("Main Method Started");
		//Directly Calling By Methodname
		//Methodname();
	     Java();
		Automation();
		Softwaretesting();
		//calling from classname.Methodname();
		Method2.Java();
		Method2.Automation();
		Method2.Softwaretesting();
		
		System.out.println("Main Method Ended");
	}
//Static Method
	public static void Java() {
		System.out.println("Static Method--->Java");
		
	}
    public static void Automation() {
    	System.out.println("Static Method--->Automation");
   }
    public static void Softwaretesting() {
    	System.out.println("Satic Method---->Software Testing");
    }
}
