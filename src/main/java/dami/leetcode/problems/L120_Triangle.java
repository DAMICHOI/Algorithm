package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L120_Triangle {
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		triangle.add(new ArrayList<>(Arrays.asList(2)));
		triangle.add(new ArrayList<>(Arrays.asList(3, 4)));
		triangle.add(new ArrayList<>(Arrays.asList(6, 5, 7)));
		triangle.add(new ArrayList<>(Arrays.asList(4, 1, 8, 3)));
		System.out.println(minimumTotal(triangle));

		triangle = new ArrayList<>();
		triangle.add(new ArrayList<>(Arrays.asList(-10)));
		System.out.println(minimumTotal(triangle));

		triangle = new ArrayList<>();
		triangle.add(new ArrayList<>(Arrays.asList(-1)));
		triangle.add(new ArrayList<>(Arrays.asList(2, 3)));
		triangle.add(new ArrayList<>(Arrays.asList(1, -1, -3)));
		System.out.println(minimumTotal(triangle));
	}

	// private static Integer[][] memo;
	//
	// // Top-Down Memoization
	// private static int minimumTotal(List<List<Integer>> triangle) {
	// 	int n = triangle.size();
	// 	memo = new Integer[n][n];
	// 	return dfs(0, 0, triangle);
	// }
	//
	// private static int dfs(int level, int i, List<List<Integer>> triangle) {
	// 	if (memo[level][i] != null) {
	// 		return memo[level][i];
	// 	}
	//
	// 	int path = triangle.get(level).get(i);
	// 	if (level < triangle.size() - 1) {
	// 		path += Math.min(dfs(level + 1, i, triangle), dfs(level + 1, i + 1, triangle));
	// 	}
	//
	// 	return memo[level][i] = path;
	// }

	// Bottom-Up DP
	private static int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();
		int[][] dp = new int[n + 1][n + 1];

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
				System.out.println(i + " " + j + " => "+dp[i][j]);
			}
		}

		return dp[0][0];
	}
}
