package threads;

public class TestThread2 extends Thread{
	public void run() {
		table(5);
	}
	synchronized void table(int n ) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
	public static void main(String[] args) {
		TestThread2 t1 = new TestThread2();
		TestThread2 t2 = new TestThread2();
		TestThread2 t3 = new TestThread2();
		TestThread2 t4 = new TestThread2();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}