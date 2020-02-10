package q1;

public class SavingsAccount extends BankAccount{
	
	//data fields
	private double interestRate;
	
	//Constructor
	public SavingsAccount() {
		super();
		this.interestRate = 0.0;
	}
	
	public SavingsAccount(double rate) {
		super();
		this.interestRate = rate;
	}
	
	public void addInterest() {
		this.deposit(this.getBalance()+(this.interestRate*this.getBalance()));
	}

}
