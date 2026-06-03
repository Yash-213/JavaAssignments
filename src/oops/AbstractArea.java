package oops;

public class AbstractArea {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(2, 6);
		
		circle.calculateArea();
		rectangle.calculateArea();
	}
}
abstract class Shape {
	abstract void calculateArea();
}
class Circle extends Shape {
	private double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	void calculateArea() {
		double area = 3.14 * radius * radius;
		System.out.println("Area of triangle: " + area);
	}
}
class Rectangle extends Shape {
	private double side1;
	private double side2;
	Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	void calculateArea() {
		double area = side1 * side2;
		System.out.println("Area of Rectangle: " + area);
	}
}