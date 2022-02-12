package dami.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class L1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
	public static void main(String[] args) {
		L1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number solution = new L1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number();
		solution.smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3});
		solution.smallerNumbersThanCurrent(new int[] {6, 5, 4, 8});
	}

	private int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					result[i] += 1;
				}
			}
		}

		return result;
	}
}
