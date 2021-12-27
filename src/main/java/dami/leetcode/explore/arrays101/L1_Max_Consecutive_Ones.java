package dami.leetcode.explore.arrays101;

public class L1_Max_Consecutive_Ones {
	public static void main(String[] args) {
		L1_Max_Consecutive_Ones solution = new L1_Max_Consecutive_Ones();
		System.out.println(solution.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
		System.out.println(solution.findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1}));
		System.out.println(solution.findMaxConsecutiveOnes(new int[] {1}));
		System.out.println(solution.findMaxConsecutiveOnes(new int[] {0}));
		System.out.println(solution.findMaxConsecutiveOnes(new int[] {0, 0}));
	}

	private int findMaxConsecutiveOnes(int[] nums) {
		int maxCount = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				if (maxCount < count) {
					maxCount = count;
				}
			} else {
				count = 0;
			}

		}
		return maxCount;
	}
}
