package dami.leetcode;

public class L231_Power_of_Two {
	public static void main(String[] args) {
		L231_Power_of_Two solution = new L231_Power_of_Two();
		System.out.println(solution.isPowerOfTwo(1));
		System.out.println(solution.isPowerOfTwo(16));
		System.out.println(solution.isPowerOfTwo(3));
	}

	private boolean isPowerOfTwo(int n) {
		/*if (n < 1)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			System.out.println(n);
			n >>= 1;
		}
		return true;*/

		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			System.out.println(n);
			n /= 2;
		}
		return true;
	}
}
