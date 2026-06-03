package oops;

public class AbstractEmployee {
	public static void main(String[] args) {
		EmployeeSalary fulltime = new FullTimeEmployee();
		fulltime.calculateSalary();
		EmployeeSalary parttime = new PartTimeEmployee();
		parttime.calculateSalary();
	}
}
abstract class EmployeeSalary {
	abstract void calculateSalary();
}

class FullTimeEmployee extends EmployeeSalary {
	void calculateSalary() {
		System.out.println("This salary for Fulltime Employee!!!");
	}
}
class PartTimeEmployee extends EmployeeSalary {
	void calculateSalary() {
		System.out.println("This salary for Parttime Employee!!!");
	}
}