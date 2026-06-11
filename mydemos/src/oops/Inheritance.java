package oops;

public class Inheritance {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.manageWork();
		m.work();
	}
}
class Employee{
	String company = "ABC Technologies";
	void work() {
		System.out.println("Employee is working!");
	}
}
class Manager extends Employee {
	void manageWork() {
		work();
		System.out.println("Do Nothing!! Only shouting..");
	}
}

