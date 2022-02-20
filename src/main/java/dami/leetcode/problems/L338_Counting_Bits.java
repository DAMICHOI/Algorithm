package dami.leetcode.problems;

public class L338_Counting_Bits {
	public static void main(String[] args) {
		L338_Counting_Bits solution = new L338_Counting_Bits();
		for (int num : solution.countBits(2)) {
			System.out.print(num + " ");
		}

		System.out.println();
		for (int num : solution.countBits(5)) {
			System.out.print(num + " ");
		}
	}

	private int[] countBits(int n) {
		int[] ans = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			ans[i] = count(i, ans);
		}
		return ans;
	}

	public static int count(int n, int[] memo) {
		if (n == 1) {
			return n;
		}

		if (memo[n] == 0) {
			if (n % 2 == 0) {
				memo[n] = count((n / 2), memo);
			} else {
				memo[n] = count((int)Math.floor(n / 2), memo) + 1;
			}
		} else {
			if (memo[n] != 0) {
				return memo[n];
			}
		}

		return memo[n];
	}

	/*
	private int[] countBits(int n) {
		if (n == 0) {
			return new int[0];
		}

		int[] ans = new int[n + 1];
		count(1, n, 1, ans);
		return ans;
	}

	private void count(int num, int n, int c, int[] ans) {
		System.out.println(num + " " + c);
		ans[num] = c;

		if ((num << 1) <= n) {
			count((num << 1), n, c, ans);
		}

		if (((num << 1) | 1) <= n) {
			count(((num << 1) | 1), n, c + 1, ans);
		}
	}*/

	/*private int[] countBits(int n) {
		if (n == 0)
			return new int[] {0};

		int[] ans = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " i>>1=" + (i >> 1) + " i&1=" + (i & 1));
			ans[i] = ans[i >> 1] + (i & 1);
		}
		return ans;
	}*/
}
