package oops;

public class InterfacePrint {
	public static void main(String[] args) {
		Printing p = new Printing();
		p.print();
	}
}

interface Printable {
	void print();
}

class Printing implements Printable { 
	public void print() {
		System.out.print("Do not print anything");
	}
}