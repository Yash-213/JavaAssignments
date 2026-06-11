package bankingapplicationdemo;

public class Deposite extends Thread{
	private double amount;
	private BankAccount account;
	public Deposite(String userName,double amount, BankAccount account) {
		super(userName);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.deposite(amount);
	}
	
}
