package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class L46_Permutations {
	public static void main(String[] args) {
		System.out.println(permute(new int[] {1, 2, 3}));
		System.out.println(permute(new int[] {0, 1}));
		System.out.println(permute(new int[] {1}));
	}

	static List<List<Integer>> output;

	private static List<List<Integer>> permute(int[] nums) {
		if (nums.length == 0) {
			return new ArrayList<>();
		}

		output = new ArrayList<>();
		backtrack(0, new ArrayList<Integer>(), nums);

		return output;
	}

	private static void backtrack(int index, ArrayList<Integer> list, int[] nums) {
		if (index == nums.length) {
			output.add(new ArrayList<>(list));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {    // 중복 제거
				continue;
			}
			list.add(nums[i]);
			backtrack(index + 1, list, nums);
			list.remove(list.size() - 1);
		}
	}
}
