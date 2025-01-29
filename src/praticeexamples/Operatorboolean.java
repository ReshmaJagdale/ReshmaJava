package praticeexamples;

public class Operatorboolean {

	public static void main(String[] args) {
		boolean a= true;
		boolean b= true;
		boolean c= false;
		boolean d= false;
		
		System.out.println(a&&b);//t
		System.out.println(b&&c);//f
		System.out.println(c&&d);//f
		System.out.println(d&&a);//f
		
		
		System.out.println(a||b); //t
		System.out.println(b||c); //t
		System.out.println(c||d); //f   ---|||| t shape
		System.out.println(d||a); //T
		
		System.out.println(!a);  //F
		
		System.out.println(!c);  //T

		
	}

}
