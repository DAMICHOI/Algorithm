package dami.leetcode.problems;

public class L322_Coin_Change {
	public static void main(String[] args) {
		System.out.println(coinChange(new int[] {1, 2, 5}, 11));
		System.out.println(coinChange(new int[] {2}, 3));
		System.out.println(coinChange(new int[] {1}, 0));
	}

	// Buttom Up 방식
	private static int coinChange(int[] coins, int amount) {
		if (amount == 0) {
			return 0;
		}

		if (coins == null || coins.length == 0 || amount < 0) {
			return -1;
		}

		int[] dp = new int[amount + 1];
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
		}

		for (int coin : coins) {
			for (int i = coin; i < dp.length; i++) {
				if (dp[i - coin] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
				}
			}
		}

		return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
	}
}
