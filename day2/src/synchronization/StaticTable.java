package synchronization;

public class StaticTable extends Thread{
	synchronized static void printable(int n) {
		for (int i = 1; i < 11; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
