package dami.leetcode.explore.arrays101;

import java.util.Arrays;

public class L5_Merge_Sorted_Array {
	public static void main(String[] args) {
		L5_Merge_Sorted_Array solution = new L5_Merge_Sorted_Array();
		solution.merge(new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3);
		solution.merge(new int[] {1}, 1, new int[] {}, 0);
		solution.merge(new int[] {0}, 0, new int[] {1}, 1);
	}

	private void merge(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		int i = m - 1;
		int j = n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] < nums2[j]) {
				nums1[index--] = nums2[j--];
			} else {
				nums1[index--] = nums1[i--];
			}
		}

		while (j >= 0) {
			nums1[index--] = nums2[j--];
		}

		for (int num : nums1) {
			System.out.println(num);
		}
	}
}
