package dami.leetcode.explore.arrays101;

public class L14_Remove_Element {
	public static void main(String[] args) {
		L14_Remove_Element solution = new L14_Remove_Element();
		System.out.println(solution.removeElement(new int[] {3, 2, 2, 3}, 3));
		System.out.println(solution.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
	}

	// Runtime: 0ms / Memory Usage: 39.2MB
	private int removeElement(int[] nums, int val) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}

		return count;
	}
}
