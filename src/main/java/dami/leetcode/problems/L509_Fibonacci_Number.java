package dami.leetcode.problems;

public class L509_Fibonacci_Number {
	public static void main(String[] args) {
		System.out.println(fib(0));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
	}

	private static int fib(int n) {
		if (n == 0) {
			return 0;
		}

		int[] fibonacci = new int[n + 1];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		return fibonacci[n];
	}
}


