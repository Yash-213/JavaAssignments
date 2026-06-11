package bankingapplicationdemo;

public class ATMThreadProject {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		Withdraw customer1 = new Withdraw("cust1", 100000, account);
		Deposite customer2 = new Deposite("cust2", 10000, account);
		customer1.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		customer2.start();
	}
}
