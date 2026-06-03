package oops;

public class AbstractBike {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
	}
}

abstract class Vehicle {
	abstract void start();
	abstract void stop();
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car is started");
	}
	void stop() {
		System.out.println("Car is stopped");
	}
}
class Bike extends Vehicle {
	void start() {
		System.out.println("Bike is Started");
	}
	void stop() {
		System.out.println("Bike is stopped");
	}
}