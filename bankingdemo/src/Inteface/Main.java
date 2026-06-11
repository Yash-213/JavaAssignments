package Inteface;

public class Main implements School, College{
	public void set(String U, String s ) {
		System.out.println("Person Name: " + U);
		System.out.println("Person School: " + s);
	}
	public void show () {
		System.out.println("Student City: " +schoolLocationString);
		System.out.println("College Name: " +collegeName);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.set("Yash", "which school");
		main.show();
	}
}
