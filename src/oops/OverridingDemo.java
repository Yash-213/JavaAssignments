package oops;

public class OverridingDemo {
	public static void main(String[] args) {
		TheCar car = new TataCar();
		car.applyBreak();
		
		TheCar car2 = new TheCar();
		car2.applyBreak();
		
		TataCar tataCar = new TataCar();
		tataCar.applyBreak();
	}
}

class TheCar {
	void applyBreak() {
		System.out.println("Break Failed !!!");
	}
}
class TataCar extends TheCar {
	void applyBreak() {
		System.out.println("Strong Breaking are also fail 😂");
	}
}
