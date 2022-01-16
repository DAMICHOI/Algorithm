package dami.leetcode.explore.arrays101;

import java.util.ArrayList;
import java.util.List;

public class L13_Sort_Array_By_Parity {
	public static void main(String[] args) {
		L13_Sort_Array_By_Parity solution = new L13_Sort_Array_By_Parity();
		// solution.sortArrayByParity(new int[] {3, 1, 2, 4});
		solution.sortArrayByParity(new int[] {0, 1, 2});
	}

	// Runtime: 1ms / Memory: 39.8MB
	private int[] sortArrayByParity(int[] nums) {
		if (nums.length <= 1) {
			return nums;
		}

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}

		for (int num : nums) {
			System.out.println(num);
		}
		return nums;
	}

	// Runtime: 3ms / Memory: 46.3MB
	/*private int[] sortArrayByParity(int[] nums) {
		if (nums.length <= 1) {
			return nums;
		}

		List<Integer> evens = new ArrayList<>();
		List<Integer> odds = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				evens.add(nums[i]);
			} else {
				odds.add(nums[i]);
			}
		}

		int j = 0;
		for (int even : evens) {
			nums[j] = even;
			j++;
		}

		for (int odd : odds) {
			nums[j] = odd;
			j++;
		}

		return nums;
	}*/
}
