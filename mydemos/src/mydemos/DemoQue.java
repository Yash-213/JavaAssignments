package mydemos;

public class DemoQue {
	public static void main(String[] args) {
		int a = 12;
		int b = 21;
		Factorial(a);
		multiplicationTable(a);
		sumOfNnaturalNo(a);
		sumOfDigit(a);
		reverseOfNo(a);
		isNoPalindrom(a);
		isPrime(a);
		primeNoInRange(a, b);
		System.out.println(fibonacci(a));
		fibonacciSeries(a);
		armstrongNo(a);
		gcd(a, b);
		lcm(a, b);
		countDigits(a);
		power(a, b);
	}
	private static void Factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) fact *= i;
		System.out.println(fact);
	}
	private static void multiplicationTable(int n) {
		for (int i = 1; i <= 10; i++) System.out.println(i + " " + i * n);
	}
	private static void sumOfNnaturalNo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) sum += i;
		System.out.println(sum);
	}
	private static void sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println(sum);
	}
	private static void reverseOfNo(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		System.out.println(rev);
	}
	private static void isNoPalindrom(int n) {
		int rev = 0;
		int d = n;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		System.out.println(rev == d ? "Palindrom" : "Not Palindrom");
	}
	
	private static void isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				System.out.println(n + " is not prime"); 
				return;
			}
		}
		System.out.println(n + " is prime");
	}
	private static void primeNoInRange(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for (int i = min; i <= max; i++) {
			isPrime(i);
		}
	}
	private static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
	private static void fibonacciSeries(int n) {
		int a = 0, b = 1;
		for (int i = 1; i <= n; ++i) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}
	private static void armstrongNo(int n) {
	    int o = n;
	    int sum = 0;
	    int d = String.valueOf(n).length();
	    while (n > 0) {
	        int digit = n % 10;
	        sum += (int) Math.pow(digit, d);
	        n /= 10;
	    }
	    System.out.println(sum == o ? o + " is an Armstrong number" : o + " is not an Armstrong number");
	}
	private static void gcd(int a, int b) {
	    while (b != 0) {
	        int temp = b;
	        b = a % b;
	        a = temp;
	    }

	    System.out.println("GCD = " + a);
	}
	private static void lcm(int a, int b) {
	    int x = a, y = b;

	    while (y != 0) {
	        int temp = y;
	        y = x % y;
	        x = temp;
	    }

	    int gcd = x;
	    int lcm = (a * b) / gcd;

	    System.out.println("LCM = " + lcm);
	}
	private static void countDigits(int n) {
	    int count = 0;
	    while (n != 0) {
	        count++;
	        n /= 10;
	    }
	    System.out.println("Digits = " + count);
	}
	private static void power(int base, int exponent) {
	    int result = 1;
	    for (int i = 1; i <= exponent; i++) result *= base;
	    System.out.println("Result = " + result);
	}
}
