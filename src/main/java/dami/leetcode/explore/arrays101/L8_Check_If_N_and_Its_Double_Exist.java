package dami.leetcode.explore.arrays101;

public class L8_Check_If_N_and_Its_Double_Exist {
	public static void main(String[] args) {
		L8_Check_If_N_and_Its_Double_Exist solution = new L8_Check_If_N_and_Its_Double_Exist();
		System.out.println(solution.checkIfExist(new int[] {7, 1, 14, 11}));
		System.out.println(solution.checkIfExist(new int[] {3, 1, 7, 11}));
		System.out.println(solution.checkIfExist(new int[] {-2, 0, 10, -19, 4, 6, -8}));
	}

	private boolean checkIfExist(int[] arr) {
		if (arr.length < 2) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j] * 2) {
					return true;
				}
			}
		}

		return false;
	}
}
