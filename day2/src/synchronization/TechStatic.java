package synchronization;

public class TechStatic extends Thread{
	public void run() {
		StaticTable.printable(7);
	}
	public static void main(String[] args) {
		TechStatic techStatic = new TechStatic();
		TechStatic techStatic1 = new TechStatic();
		techStatic.start();
		techStatic1.start();
	}
}
