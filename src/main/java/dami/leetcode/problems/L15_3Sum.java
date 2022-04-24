package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_3Sum {
	public static void main(String[] args) {
		List<List<Integer>> result = threeSum(new int[] {-1, 0, 1, 2, -1, -4});
		result.forEach(System.out::println);
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> t = new ArrayList<>();

		if (nums == null || nums.length < 3)
			return t;

		Arrays.sort(nums);    // nlogn이 n^2 보다 빠르기 때문에 써도 괜찮음

		// -2 -1 -1 0 1 1 2 2
		// pivot: -2 -> 2?
		// pivot: -1 -> 1?
		int n = nums.length;

		// O(n^2)
		for (int i = 0; i < n - 2; i++) {
			// nums의 pivot 값이 0보다 크면 더이상 계산할 필요가 없다.
			if (nums[i] > 0)
				break;
			if (i == 0 || nums[i] != nums[i - 1]) {
				int l = i + 1, r = n - 1, target = nums[i];

				while (l < r) {
					if (nums[l] + nums[r] == -target) {
						t.add(Arrays.asList(target, nums[l], nums[r]));

						while (l < r && nums[l] == nums[l + 1]) {
							l++;
						}
						l++;
						while (l < r && nums[r] == nums[r - 1]) {
							r--;
						}
						r--;
					} else if (nums[l] + nums[r] < -target) {
						l++;
					} else {
						r--;
					}
				}
			}
		}

		return t;
	}
}
