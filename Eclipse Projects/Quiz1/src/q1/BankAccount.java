package q1;

/**
 * Section A
 * 
 * Benjamin Thomson
 * Sarah Wiessler
 *	
 */

public class BankAccount {
	
	
	//Data fields
	private double balance;
	
	BankAccount() {
		this.balance = 0.0;
	}
	
	BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Cant be negative");
		}
		
		this.balance += amount;
		
	}
	
	public void withdraw(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Cant be negative");
		}
		if(this.balance < amount) {
			throw new IllegalArgumentException("not enough money");
		}
		
		this.balance -= amount;
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance()  {
		return this.balance;
	}
	
	
	public void transfer(double amount, BankAccount destination) {
		
		if(this.getBalance() < amount) {
			throw new IllegalArgumentException("Insufficient funds");

		}
		
		//here you go
		destination.deposit(amount);
		this.withdraw(amount);
		
	}
} 
