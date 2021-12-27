package dami.leetcode.explore.arrays101;

import java.util.Arrays;

public class L3_Squares_of_a_Sorted_Array {
	public static void main(String[] args) {
		L3_Squares_of_a_Sorted_Array solution = new L3_Squares_of_a_Sorted_Array();
		System.out.println(solution.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
		System.out.println(solution.sortedSquares(new int[] {-7, -3, 2, 3, 11}));
	}

	private int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);

		return nums;
	}
}
