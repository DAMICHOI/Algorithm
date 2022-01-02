package dami.leetcode.explore.arrays101;

import java.util.ArrayList;

public class L7_Remove_Duplicates_from_Sorted_Array {
	public static void main(String[] args) {
		L7_Remove_Duplicates_from_Sorted_Array solution = new L7_Remove_Duplicates_from_Sorted_Array();
		System.out.println(solution.removeDuplicates(new int[] {1, 1, 2}));
		System.out.println(solution.removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}

	private int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int unique = 0;
		int previous = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int current = nums[i];
			if (current != previous) {
				nums[unique] = current;
				unique++;
			}

			previous = current;
		}
		return unique;
	}

	private int removeDuplicates2(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}

		return list.size();
	}
}
