package Methods;

public class Method9 {
	public static void main(String[] args)
	{
		//Non static method calling from same class
		//First we have to create object of class
		//Syntax: classname objectreferencevairablename= new classname()
		
		Method9 Demo =new Method9();
		Method9 Demo1=new Method9();
	    Method9 Demo2 =new Method9();
	    
	    //Calling
		//Syntax: ORVN.methodname();
		Demo.SoftwareTesting();
		Demo1.ManualTesting();
		Demo2.AutomationTesting();
		
	}

	public void SoftwareTesting() {
		System.out.println("Software Testing");
	}
	public void ManualTesting() {
		System.out.println("Manual Testing");
	}
	public void AutomationTesting() {
		System.out.println("Automation Testing");
	}




}

