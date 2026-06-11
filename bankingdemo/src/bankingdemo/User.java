package bankingdemo;

public class User extends Login {
	String user = "abc";
	public void login() {
		System.out.println("User login Successfully");
	}
	public void logout() {
		System.out.println("User Logout");
	}
}
