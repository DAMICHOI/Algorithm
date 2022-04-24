package dami.leetcode.problems;

public class L26_Remove_Duplicates_from_Sorted_Array {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[] {1, 1, 2}));
		System.out.println(removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}

	private static int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}
		// System.out.println("inum[0]=" + nums[0] + "  jnum[0]=" + nums[0]);
		for (int i = 1, j = 0; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
			// System.out.println("inum["+i + "]=" + nums[i] + "  jnum[" + j + "]=" + nums[j]);

			if (i == nums.length - 1) {
				return j + 1;
			}
		}
		return 0;
	}
}
