package dami.leetcode.explore.arrays101;

import java.util.Arrays;

public class L12_Move_Zeroes {
	public static void main(String[] args) {
		L12_Move_Zeroes solution = new L12_Move_Zeroes();
		// solution.moveZeroes(new int[] {1, 3, 12, 0, 0});
		// solution.moveZeroes(new int[] {0});
		solution.moveZeroes(new int[] {0, 1, 0, 3, 12});
	}

	private void moveZeroes(int[] nums) {
		if (nums == null && nums.length <= 1) {
			return;
		}

		int location = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[location];
				nums[location++] = temp;
			}
		}
		// for (int num : nums) {
		// 	System.out.println(num);
		// }
	}
}
