package dami.leetcode.problems;

public class L1512_Number_of_Good_Pairs {
	public static void main(String[] args) {
		L1512_Number_of_Good_Pairs solution = new L1512_Number_of_Good_Pairs();
		System.out.println(solution.numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3}));
		System.out.println(solution.numIdenticalPairs(new int[] {1, 1, 1, 1}));
		System.out.println(solution.numIdenticalPairs(new int[] {1, 2, 3}));
	}

	private int numIdenticalPairs(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					// System.out.println(nums[i] + ":" + i + " " + nums[j] + ":" + j);
					count++;
				}
			}
		}

		return count;
	}
}
