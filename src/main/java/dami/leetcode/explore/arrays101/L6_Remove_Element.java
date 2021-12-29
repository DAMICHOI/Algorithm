package dami.leetcode.explore.arrays101;

public class L6_Remove_Element {
	public static void main(String[] args) {
		L6_Remove_Element solution = new L6_Remove_Element();
		System.out.println(solution.removeElement(new int[] {3, 2, 2, 3}, 3));
	}

	private int removeElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;

		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				n--;
			} else {
				i++;
			}
		}

		return n;
	}

	/*private int removeElement(int[] nums, int val) {
		int index = 0;
		int i = 0;
		while (i < nums.length) {
			System.out.println(nums[index]);
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
			i++;
		}

		for (int num : nums) {
			System.out.println("index=" + num);
		}
		return index;
	}*/
}
