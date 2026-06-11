package bankingdemo;


public class Login {
	String un = "abc";
	String pass = "12345";
	void check(String u, String p ) {
		if (u.equals(un) && p.equals(pass)) {
			System.out.println("login Successfully !");
		}
		else {
			System.out.println("Invalid login credentials");
		}
	}
}
