package dami.leetcode.explore.arrays101;

class L4_Duplicate_Zeros {
	public static void main(String[] args) {
		L4_Duplicate_Zeros solution = new L4_Duplicate_Zeros();
		solution.duplicateZeros(new int[] {1, 0, 2, 3, 0, 4, 5, 0});
		// solution.duplicateZeros(new int[] {0, 0, 0, 0, 0, 0, 0});
	}

	private void duplicateZeros(int[] arr) {
		int zeros = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				zeros++;
		}

		for (int i = n - 1; i >= 0; i--) {
			int curIndex = i + zeros;
			if (curIndex < n) {
				arr[curIndex] = arr[i];
			}

			if (arr[i] == 0) {
				if (curIndex - 1 < n) {
					arr[curIndex - 1] = arr[i];
				}

				zeros--;
			}
		}

		for (int num : arr) {
			System.out.println(num);
		}
	}
}
