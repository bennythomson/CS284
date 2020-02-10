package q1;


public class Tests {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount(3);

		SavingsAccount sa = new SavingsAccount(0.15);
		
		ba.deposit(50);
		
		System.out.println(ba.getBalance());
		
		ba.withdraw(20);
		
		System.out.println(ba.getBalance());

		
	}
	
}
