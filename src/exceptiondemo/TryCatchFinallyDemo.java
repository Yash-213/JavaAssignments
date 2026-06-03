package exceptiondemo;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		try {
			int a = 23;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Devide by Zero");
		} catch (ClassCastException e) {
			System.out.println("first cast");
		} catch (Exception e) {
			System.out.println("Your a Exception");
		}
		finally {
			System.out.println("it is bullshit");
		}
	}
}
