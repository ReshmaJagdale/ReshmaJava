package Abstraction;

public class HSBC extends RBIBank {

	public void Creditcard() {
		System.out.println("HSBC credit card");
		
	}
	public void Debitcard() {
		System.out.println("HSBC DEBIT card");
		
	}
	public void Demo() {
		System.out.println("HSBC Demo Method");
	}
	
public static void main(String[] args) {
		//RBIBank RB1=new RBIBank(); // Static method
	RBIBank RB2=new HSBC();
	RB2.Creditcard();
	RB2.Debitcard();
	RB2.loan();
	//RB2.Demo();
	}

}
