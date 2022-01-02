package dami.leetcode.explore.arrays101;

public class L9_Vaild_Mountain_Array {
	public static void main(String[] args) {
		L9_Vaild_Mountain_Array solution = new L9_Vaild_Mountain_Array();
		System.out.println(solution.validMountainArray(new int[] {2, 1}));
		System.out.println(solution.validMountainArray(new int[] {3, 5, 5}));
		System.out.println(solution.validMountainArray(new int[] {0, 3, 2, 1}));
		System.out.println(solution.validMountainArray(new int[] {2, 0, 2}));
	}

	private boolean validMountainArray(int[] arr) {
		int i = 0;
		while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}

		if (i == 0 || i == arr.length - 1) {
			return false;
		}

		while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
			i++;
		}

		return i == arr.length - 1;
	}
}
