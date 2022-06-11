package dami.leetcode.problems;

public class L1143_Longest_Common_Subsequence {
	public static void main(String[] args) {
		System.out.println(longestCommonSubsequence("abcde", "ace"));
		System.out.println(longestCommonSubsequence("abc", "abc"));
		System.out.println(longestCommonSubsequence("abc", "def"));
	}

	private static int longestCommonSubsequence(String text1, String text2) {
		// . a b c d e
		// a 1 1 1 1 1
		// c 1 1 2 2 2
		// e 2 2 2 2 3
		int[][] dp = new int[text1.length() + 1][text2.length() + 1];
		for (int i = 0; i < text1.length(); i++) {
			for (int j = 0; j < text2.length(); j++) {
				if (text1.charAt(i) == text2.charAt(j)) {
					dp[i + 1][j + 1] = 1 + dp[i][j];
				} else {
					dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
				}
			}
		}

		return dp[text1.length()][text2.length()];

		// if (text1.length() < text2.length()) {
		// 	longestCommonSubsequence(text2, text1);
		// }
		//
		// int[] dp = new int[text2.length() + 1];
		// for (int i = 0; i < text1.length(); ++i) {
		// 	for (int j = 0, x = 0, y = 0; j < text2.length(); j++) {
		// 		y = x;
		// 		x = dp[j + 1];
		// 		if (text1.charAt(i) == text2.charAt(j)) {
		// 			dp[j + 1] = y + 1;
		// 		} else {
		// 			Math.max(dp[j], x);
		// 		}
		// 	}
		// }
		//
		// return dp[text2.length()];

	}
}
