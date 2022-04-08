package dami.leetcode.problems;

public class L746_Min_Cost_Climbing_Stairs {
	public static void main(String[] args) {
		System.out.println(minCostClimbingStairs(new int[] {10, 15, 20}));
		System.out.println(minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}

	private static int minCostClimbingStairs(int[] cost) {
		int[] array = new int[cost.length];

		array[0] = cost[0];
		array[1] = cost[1];

		for (int i = 2; i < cost.length; i++) {
			array[i] = Math.min(array[i - 1], array[i - 2]) + cost[i];
		}
		return Math.min(array[cost.length - 1], array[cost.length - 2]);
	}
}
