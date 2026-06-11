package oops;

class Bank{
	private double depositMoney;
	public double getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(double depositMoney) {
		this.depositMoney += depositMoney;
	}
	public double getWithdrawingMoney() {
		return withdrawingMoney;
	}
	public void setWithdrawingMoney(double withdrawingMoney) {
		if (depositMoney > 0) {
			this.withdrawingMoney = depositMoney - withdrawingMoney;
		}
	}
	private double withdrawingMoney;
}
public class EncapsulationBankAccount {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setDepositMoney(10000);
		b.setWithdrawingMoney(100);
		System.out.println(b.getDepositMoney());
		System.out.println(b.getWithdrawingMoney());
	}
}
