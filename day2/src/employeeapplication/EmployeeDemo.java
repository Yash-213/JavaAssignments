package employeeapplication;

import java.util.ArrayList;

public class EmployeeDemo {
	private int Id;
	private String empName;
	private int age;
	ArrayList<EmployeeDemo> empList = new ArrayList<EmployeeDemo>();
	public EmployeeDemo(int Id, String empName, int age) {
		this.Id = Id;
		this.empName = empName;
		this.age = age;
	}
	public synchronized void insertEmp(int empId, String empName, int age) {
		EmployeeDemo employeeDemo = new EmployeeDemo(empId, empName, age);
		empList.add(employeeDemo);
	}
	public synchronized void deleteEmp(int empId) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).Id == empId) {
				empList.remove(i);
	            System.out.println("Employee deleted successfully.");
	            return;
			}
		}
	}
	public synchronized void displayEmp(int empId) {
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).Id + "\t" + empList.get(i).empName + "\t" + empList.get(i).age);
		}
	}
	
}
