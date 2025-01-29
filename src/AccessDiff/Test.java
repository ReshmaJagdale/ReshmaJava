package AccessDiff;

import Accessmodifier.Default1;
import Accessmodifier.Private1;
import Accessmodifier.Protected1;
import Accessmodifier.Public1;

public class Test extends Protected1 {
//P1
//Name
	public static void main(String[] args) {
		
		Public1 P1=new Public1();
		P1.M1();
		System.out.println(P1.number);
		
		Private1 P2=new Private1();
	//	P2.D1();
	//	System.out.println(P2.No);
		
		Default1 D1=new Default1();
	//	D1.T1();
	//	System.out.println(D1.test);
		
		Protected1 P4=new Protected1();
		
		Test T1=new Test();
		T1.P1();
		System.out.println(T1.name);

	}

}
