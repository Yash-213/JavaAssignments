package mydemos;

public class DemoQueOnArray {
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 6, 9};
		largestElement(arr);
		smallestElement(arr);
		sumOfArray(arr);
		averageOfArray(arr);
	}
	private static void largestElement(int[] arr) {
	    int l = arr[0];

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > l) {
	            l = arr[i];
	        }
	    }

	    System.out.println("Largest Element = " + l);
	}
	private static void smallestElement(int[] arr) {
	    int s = arr[0];

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < s) {
	            s = arr[i];
	        }
	    }

	    System.out.println("Smallest Element = " + s);
	}
	private static void sumOfArray(int[] arr) {
	    int sum = 0;

	    for (int num : arr) {
	        sum += num;
	    }

	    System.out.println("Sum = " + sum);
	}
	private static void averageOfArray(int[] arr) {
	    int sum = 0;

	    for (int num : arr) {
	        sum += num;
	    }

	    double avg = (double) sum / arr.length;

	    System.out.println("Average = " + avg);
	}
}
