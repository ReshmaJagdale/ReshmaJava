package Interface;

public class HSBCBank implements RBIBank,USBank,BrazilBank{
	
	public void HomeLoan() {
		System.out.println("HSBC Home Loan");
	}
	
	public void EducationLoan() {
		System.out.println("HSBC Education Loan");
	}

	public void DebitCard() {
		System.out.println("HSBC Debit Card");
		
	}
	public void CreditCard() {
		System.out.println("HSBC Credit Card");	
	}
	public void TransferMoney() {
		System.out.println("HSBC Transfer money");	
	}
	public void PersonalLoan() {
		System.out.println("HSBC Personal Loan");	
		
	}

	
	public void BikeLoan() {
		System.out.println("HSBC Bike Loan");	
		
	}

	public void CarLoan() {
		System.out.println("HSBC Car Loan");	
		
	}
	public void MutualFund() {
		System.out.println("HSBC MutualFund Loan");
	}
	public void GoldFund() {
		System.out.println("HSBC Gold Loan");

		
	}
}
