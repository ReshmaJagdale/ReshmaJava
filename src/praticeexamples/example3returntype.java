package praticeexamples;

public class example3returntype {
	public static int method3()
	{
	int a=10;
	int b=30;
	int c=a+b;
	System.out.println(c);
	return b;
	}
	
	
	public String nonstatic()
	{
		String Firstname = "Reshma";
		String Lastname = "Jagdale";
		System.out.println(Firstname);
		return Lastname;
	}
	
	public static void main(String[] args) {
	//	method3();
		int x=method3();
		System.out.println(x);
		System.out.println(x+100);
		
		
		//Classname objreferencevariablename=new classname ();
		//objreferencevariablename is userdefined
		//calling method---objreferencevariablename();
		
		example3returntype obj= new example3returntype();
		obj.nonstatic();
		String Y= obj.nonstatic();
		System.out.println(Y);
		
		
	}

}
