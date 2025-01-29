package Accessmodifier;

public class Protected1 {
	protected String name="Automation";

	public static void main(String[] args) {
		Protected1 P4=new Protected1();
		P4.P1();
		System.out.println(P4.name);
	}
   protected void P1() {
	System.out.println("Protected Method");
}
}
