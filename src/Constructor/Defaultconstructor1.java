package Constructor;

public class Defaultconstructor1 {
   String Name;//Null
	
	int No;  //0
	//public Defaultconstructor1() {
	//	Super();
	//}
	//Rules of default constructor:
	//	1.It is always zero arguments or input parameter
	//2.Access modifier of default constructor  is same as class modifier
	//3. Default constructor contain only one line that is super call.
	
	public static void main(String[] args) {
	
		Defaultconstructor1 Dc1=new Defaultconstructor1();
		Dc1.test();
	}
    public void test() {
    	System.out.println(Name+" "+No );
    }
}
