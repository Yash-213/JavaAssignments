package synchronization;

public class MyTable3 extends Thread{
	Table t1;
	MyTable3(Table t1) {
		this.t1 = t1;
	}
	public void run() {
		t1.printable(15);
	}
}
