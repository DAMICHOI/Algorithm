package dami.leetcode.problems;

public class L1025_Divisor_Game {
	public static void main(String[] args) {
		System.out.println(division(2));
		System.out.println(division(3));
	}

	// private static boolean division(int n) {
	// 	if (n == 1) {
	// 		return false;
	// 	}
	//
	// 	boolean[] res = new boolean[n + 1];
	// 	res[1] = false;
	// 	res[2] = true;
	// 	for (int i = 3; i <= n; i++) {
	// 		res[i] = false;
	//
	// 		int j = 1;
	// 		if (i % j == 0 && !res[i - j]) {
	// 			res[i] = true;
	// 		}
	// 	}
	// 	return res[n];
	// }

	private static boolean division(int n) {
		return n % 2 == 0;
	}
}
