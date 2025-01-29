package Interface;

public class Test {
	//RBI RB1=new RBI()//Not allowed to create object of the interface and abstract classes
	public static void main(String[] args) {
		System.out.println(RBIBank.minimumbalance);
		
		HSBCBank HB=new HSBCBank();
		HB.BikeLoan();
		HB.CarLoan();
		HB.CreditCard();
		HB.DebitCard();
		HB.EducationLoan();
		HB.HomeLoan();
		HB.TransferMoney();
		HB.PersonalLoan();
		HB.MutualFund();
		HB.GoldFund();
		
		RBIBank RB=new HSBCBank();
		RB.CreditCard();
		RB.DebitCard();
		RB.TransferMoney();
		
		USBank US=new HSBCBank();
		US.BikeLoan();
		US.PersonalLoan();
		
		BrazilBank BB=new HSBCBank();
		BB.MutualFund();
		BB.CarLoan();
		
	}
	
	
	
	
	
	
}
