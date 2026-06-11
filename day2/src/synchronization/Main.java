package synchronization;

public class Main {
	public static void main(String[] args) {
		Table tb = new Table();
		MyTable my = new MyTable(tb);
		MyTable2 my2 = new MyTable2(tb);
		MyTable3 my3 = new MyTable3(tb);
		MyTable4 my4 = new MyTable4(tb);
		
		my.start();
		my2.start();
		my3.start();
		my4.start();
	}
}