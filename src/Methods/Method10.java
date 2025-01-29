package Methods;

public class Method10 {
	public static void main(String[] args) {
		//can i access static method by using by using object refrences?-Yes
				//And yes we can access static method but it will throw warning message
		
		//first need to call object
		//syntax: Classname objectrefrencevariablename= new classname();
		Method10 Demo =new Method10();
		
		//Syntax: objectrefrencevariablename.methodname();
		Demo.mymethod();
		Demo.Demotest();
		
				
	}
  public void mymethod() {
	  System.out.println("Nonstatic method");
  }
  //STatic method
  public static void Demotest() {
	System.out.println("Nonstatic method");
  }
	
}
