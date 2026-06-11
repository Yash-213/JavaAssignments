package bankingdemo;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.check("abc", "12345");
		user.login();
		user.logout();
	}
}