package dami.leetcode.problems;

import java.util.Arrays;

public class L88_Merge_Sorted_Array {
	public static void main(String[] args) {
		int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[] {2, 5, 6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));

		nums1 = new int[] {1};
		nums2 = new int[] {};
		merge(nums1, 1, nums2, 0);
		System.out.println(Arrays.toString(nums1));

		nums1 = new int[] {0};
		nums2 = new int[] {1};
		merge(nums1, 0, nums2, 1);
		System.out.println(Arrays.toString(nums1));

		nums1 = new int[] {2, 5, 6, 7, 0, 0};
		nums2 = new int[] {1, 8};
		merge(nums1, 4, nums2, 2);
		System.out.println(Arrays.toString(nums1));
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int idx = m + n - 1;
		int i = m - 1;
		int j = n - 1;

		// O(n + m)
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[idx--] = nums1[i--];
			} else {
				nums1[idx--] = nums2[j--];
			}
		}

		while (j >= 0) {
			nums1[idx--] = nums2[j--];
		}
	}
}
