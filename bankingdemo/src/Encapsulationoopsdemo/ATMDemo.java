package Encapsulationoopsdemo;


class CustomException extends Exception {
	public CustomException(String msg) {
		super(msg);
	}
}

public class ATMDemo {
	int balance = 1000;
	void userDefine(int withdrawalAmount) throws CustomException {
		if (withdrawalAmount > balance) {
			throw new CustomException("Insufficient Balance");
		}
	}
	public static void main(String[] args) throws CustomException {
		ATMDemo atmDemo = new ATMDemo();
		atmDemo.userDefine(4000);
	}
}
