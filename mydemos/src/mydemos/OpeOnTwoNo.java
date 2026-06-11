package mydemos;

public class OpeOnTwoNo {
	public static void main (String[] args) {
		int a = 12;
		int b = 15;
		int c = 20;
		additionOfTwoNo( a, b);
		substrationOfTwoNo(a, b);
		multiplicationOfTwoNo(a, b);
		divideOfTwoNo(a, b);
		reminderOfTwoNo(a, b);
		largestNoBetweenTwoNo(a, b);
		largestNoBetweenThreeNo(a, b, c);
		noIsOddOrEven(a);
		noIsNegativeOrPositiveOrZero(a);
		swappingOfTwoNoUsingTemp(a, b);
		swappingOfTwoNoWithoutTemp(a, b);
	}
	private static void additionOfTwoNo(int a, int b) {
		int temp = a + b;
		System.out.println("Addition of two no." + temp);
	}
	private static void substrationOfTwoNo(int a, int b) {
		int temp = a - b;
		System.out.println("Substruction of two no." + temp);
	}
	private static void multiplicationOfTwoNo(int a, int b) {
		int temp = a * b;
		System.out.println("Multiplication of two no." + temp);
	}
	private static void divideOfTwoNo(int a, int b) {
		if (b == 0) return;
		int temp = a / b;
		System.out.println("Dividation of two no." + temp);
	}
	private static void reminderOfTwoNo(int a, int b) {
		int temp = a % b;
		System.out.println("Reminder of two no." + temp);
	}
	private static void largestNoBetweenTwoNo(int a, int b) {
		if(a == b) System.out.println("Both are same nos.");
		else System.out.println(a > b ? a : b + " is largest no.");
	}
	private static void largestNoBetweenThreeNo(int a, int b, int c) {
		if(a == b && b == c) System.out.println("Both are same nos.");
		else System.out.println("Largest no is: " + Math.max(Math.max(a, b), c));
	}
	private static void noIsOddOrEven(int a) {
		System.out.println(a % 2 == 0 ? "Even" : "Odd");
	}
	private static void noIsNegativeOrPositiveOrZero(int a) {
		if(a == 0) System.out.println("Zero");
		else System.out.println(a > 0 ? "Positive" : "Negative");
	}
	
//	Swapping of two no using temp variable
	private static void swappingOfTwoNoUsingTemp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
//	Swapping of two no without temp variable
	private static void swappingOfTwoNoWithoutTemp(int a, int b) {
//		swapping in one line
//		a = a + b - (b = a);
		System.out.println(a + " " + b);
//		swapping using XOR
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " " + b);
//		swapping using '-' operator
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}
}
