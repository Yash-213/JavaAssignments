package employeeapplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");

            int n = sc.nextInt();

            switch (n) {

            case 1:
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Employee Name: ");
                String name = sc.next();

                System.out.print("Enter Employee Age: ");
                int age = sc.nextInt();

                insert(id, name, age);
                break;

            case 2:
                System.out.print("Enter Employee ID to Delete: ");
                int empId = sc.nextInt();

                delete(empId);
                break;

            case 3:
                display();
                break;

            case 4:
                System.out.println("Program Ended.");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Choice!");
            }
        }
		
	}
	private static void insert(int empId, String empName, int age) {
		EmployeeDemo emp1 = new EmployeeDemo(empId, empName, age);
		System.out.println("Insert Successfully!!");
	}
	private static void delete(int empId) {
		
	}
	private static void display() {
		
	}
}
