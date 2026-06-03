package oops;

public class EncapsulationEmployee {
	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.setEmployeeID("a101");
		emp.setEmployeeName("Frustrated Employee");
		emp.setEmployeeSalary("1,00,000");
		System.out.println("Employee ID: " + emp.getEmployeeID());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Salary: " + emp.getEmployeeSalary());
	}
}
class EmployeeInfo {
	private String employeeID;
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	private String employeeName;
	private String employeeSalary;
}