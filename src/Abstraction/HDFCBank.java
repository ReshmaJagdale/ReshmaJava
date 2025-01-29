package Abstraction;

public class HDFCBank extends RBIBank{
	
	public void Creditcard() {

		System.out.println("HDFC credit card");	
	}

	public void Debitcard() {
		
 System.out.println("HDFC debit card");
 
		}
public static void main(String[] args) {
	RBIBank RB1=new HDFCBank();
	RB1.Creditcard();
	RB1.Debitcard();
	}

}
