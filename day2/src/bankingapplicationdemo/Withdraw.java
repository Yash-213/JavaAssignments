package bankingapplicationdemo;

public class Withdraw extends Thread{
	private double amount;
	private BankAccount account;
	public Withdraw(String userName, double amount, BankAccount account) {
		super(userName);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.withdraw(amount);
	}
}
