package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class L78_Subsets {
	public static void main(String[] args) {
		System.out.println(subsets(new int[] {1, 2, 3}));
		System.out.println(subsets(new int[] {0}));
	}

	static List<List<Integer>> output;

	private static List<List<Integer>> subsets(int[] nums) {
		if (nums.length == 0) {
			return new ArrayList<>();
		}

		output = new ArrayList<>();
		backtrack(0, new ArrayList<Integer>(), nums);
		return output;
	}

	private static void backtrack(int index, List<Integer> letter, int[] nums) {

		if (index >= nums.length) {
			output.add(new ArrayList<>(letter));
			return;
		}

		letter.add(nums[index]);
		backtrack(index + 1, letter, nums);
		letter.remove(letter.size() - 1);
		backtrack(index + 1, letter, nums);
	}
}
