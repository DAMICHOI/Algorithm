package dami.leetcode.explore.arrays101;

import java.nio.charset.StandardCharsets;

public class L2_Find_Numbers_with_Even_Number_of_Digits {
	public static void main(String[] args) {
		L2_Find_Numbers_with_Even_Number_of_Digits solution = new L2_Find_Numbers_with_Even_Number_of_Digits();
		System.out.println(solution.findNumbers(new int[] {12, 345, 2, 6, 7896}));
		System.out.println(solution.findNumbers(new int[] {555, 901, 482, 1771}));
	}

	private int findNumbers(int[] nums) {
		int evenCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int len = 0;
			while (nums[i] > 0) {
				nums[i] /= 10;
				len++;
			}
			if (len % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}
}
