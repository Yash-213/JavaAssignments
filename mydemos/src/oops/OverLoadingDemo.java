package oops;

public class OverLoadingDemo {
	public static void main(String[] args) {
		Admin admin = new Admin();
		String result = admin.Admin1("a", "b", "c");
		System.out.println(result);
		int temp = admin.Admin1(1, 2);
		System.out.println(temp);
		int temp1 = admin.Admin1(32);
		System.out.println(temp1);

	}
}

class Admin {
//	Super Admin
	Admin() {
		System.out.println("Hello");
	}
	String Admin1(String readPermission, String writerPermission, String executePermission) {
		String rolls = readPermission + writerPermission + executePermission;
		return rolls;
	}

//	sub Admin
	int Admin1(int readmode, int writemode) {
		int rolls = readmode + writemode;
		return rolls;
	}

	int Admin1(int readmode) {
		int rolls = readmode;
		return rolls;
	}
}
