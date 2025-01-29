package Constructor;

public class Rule3 {
//3. You should not declare any return type of constructor(like void)
	
	public void Rule4(){
		System.out.println("Hello");
	}
	
	public static void Rule5() {
		System.out.println("World!!");
	}
	
	public static void main(String[] args) {
		Rule3 R=new Rule3();
		R.Rule4();
		R.Rule5();

	}

}
