package synchronization;

public class Table {
	void printable(int n ) {
		synchronized (this) {
			for (int i = 1; i < 11; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		}
	}
}
