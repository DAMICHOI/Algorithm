package dami.leetcode.problems;

public class L64_Minimum_Path_Sum {
	public static void main(String[] args) {
		System.out.println(minPathSum(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
		System.out.println(minPathSum(new int[][] {{1, 2, 3}, {4, 5, 6}}));
	}

	// private static int minPathSum(int[][] grid) {
	// 	int[][] dp = new int[grid.length][grid[0].length];
	//
	// 	for (int i = 0; i < grid.length; i++) {
	// 		for (int j = 0; j < grid[i].length; j++) {
	// 			if (i == 0 && j == 0) {
	// 				dp[i][j] = grid[i][j];
	// 			} else if (i == 0) {    // row
	// 				dp[i][j] = dp[i][j - 1] + grid[i][j];
	// 			} else if (j == 0) {    // column
	// 				dp[i][j] = dp[i - 1][j] + grid[i][j];
	// 			} else {
	// 				dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
	// 			}
	// 		}
	// 	}
	//
	// 	return dp[grid.length - 1][grid[0].length - 1];
	// }

	private static int minPathSum(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (i == 0 && j == 0) {

				} else if (i == 0) {
					grid[i][j] += grid[i][j - 1];
				} else if (j == 0) {
					grid[i][j] += grid[i - 1][j];
				} else {
					grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
				}
			}

		}
		return grid[grid.length - 1][grid[0].length - 1];
	}
}
