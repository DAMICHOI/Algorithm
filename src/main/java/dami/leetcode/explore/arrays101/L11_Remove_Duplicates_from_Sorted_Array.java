package dami.leetcode.explore.arrays101;

public class L11_Remove_Duplicates_from_Sorted_Array {
	public static void main(String[] args) {
		L11_Remove_Duplicates_from_Sorted_Array solution = new L11_Remove_Duplicates_from_Sorted_Array();
		System.out.println(solution.removeDuplicates(new int[] {1, 1, 2}));
		System.out.println(solution.removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}

	private int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int count = 0;
		int prev = -101;

		for (int i = 0; i < nums.length; i++) {
			if (prev != nums[i]) {
				nums[count] = nums[i];
				count++;
			}
			prev = nums[i];
		}

		return count;
	}
}
