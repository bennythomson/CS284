package q1;

public class CheckingAccount extends BankAccount{
	//data fields
	private int count;
	
	//constructor
	
	public CheckingAccount() {
		super();
		this.count=0;
	}
	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		this.count = 0;
	}
	
	public void withdraw(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Cant be negative");
		}
		if(this.getBalance() < amount) {
			throw new IllegalArgumentException("not enough money");
		}
		this.setBalance(this.getBalance()-amount);
		this.count++;	
	}
	
	public void deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Cant be negative");
		}
		
		this.setBalance(this.getBalance() + amount);
		this.count++;
		
	}
	
}
