package mydemos;

class TataCar {
	//behavior or functional
	void aboutCar() {
		System.out.println("car is red");
	}
}

public class ObjectDemo {
	//is only one public class is there
	public static void main(String[] args) {
		TataCar tatacar = new TataCar();
		tatacar.aboutCar();
	}
}
