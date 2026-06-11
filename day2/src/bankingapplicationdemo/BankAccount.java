package bankingapplicationdemo;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(double amount) {
		System.out.println(Thread.currentThread().getName() + " wants to Withdraw Rs." + amount);

	    while (balance < amount) {
	        System.out.println("Insufficient Balance");
	        System.out.println(Thread.currentThread().getName() + " is waiting for deposit...");

	        try {
	            wait();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }		
	}

	public synchronized void deposite(double amount) {
		System.out.println(Thread.currentThread().getName() + "Deposite amount Rs." + amount);
		balance += amount;
		System.out.println("Updated balance: Rs." + balance);
		System.out.println("Notify waiting Customers...");
		notifyAll();
	}
	public synchronized void checkBalance() {
		System.out.println("Current Balance: Rs." + balance);
	}
}
