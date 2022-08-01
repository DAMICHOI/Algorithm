package dami.leetcode.problems;

public class L1920_Build_Array_from_Permutation {
	public static void main(String[] args) {
		L1920_Build_Array_from_Permutation solution = new L1920_Build_Array_from_Permutation();
		for (int n : solution.buildArray(new int[]{0,2,1,5,3,4})) {
			System.out.print(n+" ");
		}

		System.out.println();

		for (int n : solution.buildArray(new int[]{5,0,1,2,3,4})) {
			System.out.print(n+" ");
		}
	}

	private int[] buildArray(int[] nums) {
		int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			arr[i] = nums[nums[i]];
		}

		return arr;
	}
}
