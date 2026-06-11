package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert {
	public static void main (String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/sitj2";
			String username = "root";
			String password = "y@$H2_1_3";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			System.out.println("Enter Employee ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Employee salary: ");
			double salary = sc.nextDouble();
			
			String query = "Insert into emp Values(?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			int rows = ps.executeUpdate();
			if(rows > 0) System.out.println("Data inserted");
			else System.out.println("Data not Inserted");
			ps.close();
			con.close();
			sc.close();
		}catch (Exception e) {
			System.out.println("ignore exceptions");
		}
	}
}
