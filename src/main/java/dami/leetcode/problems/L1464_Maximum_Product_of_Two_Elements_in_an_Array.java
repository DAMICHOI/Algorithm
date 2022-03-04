package dami.leetcode.problems;

public class L1464_Maximum_Product_of_Two_Elements_in_an_Array {
	public static void main(String[] args) {
		// System.out.println(maxProduct(new int[] {3, 4, 5, 2}));
		// System.out.println(maxProduct(new int[] {1, 5, 4, 5}));
		System.out.println(maxProduct(new int[] {3, 7}));
	}

	/*static int maxProduct(int[] nums) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
			}
		}
		return max;
	}*/

	static int maxProduct(int[] nums) {
		if (nums.length <= 1) {
			return -1;
		}

		if (nums.length == 2) {
			return (nums[1] - 1) * (nums[0] - 1);
		}

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > max1) {
				max2 = max1;
				max1 = num;
			} else if (num > max2) {
				max2 = num;
			}
		}

		return (max1 - 1) * (max2 - 1);
	}
}
