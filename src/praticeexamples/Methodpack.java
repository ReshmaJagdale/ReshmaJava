package praticeexamples;

public class Methodpack {
	//repeat code
	public static void Morning()
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("World");
	}
//Main method
	public static void main(String[] args) {
		//direct calling by method
		Morning();
		//direct calling by classname and methodname
		Methodpack.Morning();
	}

}
