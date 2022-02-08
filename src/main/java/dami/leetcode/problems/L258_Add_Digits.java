package dami.leetcode.problems;

public class L258_Add_Digits {
	public static void main(String[] args) {
		L258_Add_Digits solution = new L258_Add_Digits();
		System.out.println(solution.addDigits(38));
		System.out.println(solution.addDigits(0));
	}

	private int addDigits(int num) {
		int result = 0;

		while (num > 0) {
			result += num % 10;
			num /= 10;

			if (num == 0 && result > 9) {
				num = result;
				result = 0;
			}
		}

		return result;
	}
}
