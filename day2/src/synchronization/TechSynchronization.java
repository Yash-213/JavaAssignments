package synchronization;

public class TechSynchronization {
	
	public static void main(String[] args) {
		final Table objTable = new Table();
		Thread t1 = new Thread() {
			public void run() {
				objTable.printable(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				objTable.printable(7);
			}
		};
		t1.start();
		t2.start();
	}

}
