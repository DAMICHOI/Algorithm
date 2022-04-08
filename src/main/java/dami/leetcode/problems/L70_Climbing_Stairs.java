package dami.leetcode.problems;

public class L70_Climbing_Stairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(2));
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(7));
	}

	private static int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}

		int[] array = new int[n + 1];
		array[1] = 1;
		array[2] = 2;

		for (int i = 3; i < n + 1; i++) {
			int num = array[i - 1] + array[i - 2];
			array[i] = num;
		}

		return array[n];
	}
}
