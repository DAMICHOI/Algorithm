package dami.leetcode.problems;

public class L9_Palindrome_Number {
	public static void main(String[] args) {
		L9_Palindrome_Number solution = new L9_Palindrome_Number();
		System.out.println(solution.isPalindrome(121));
		System.out.println(solution.isPalindrome(-121));
		System.out.println(solution.isPalindrome(10));
		System.out.println(solution.isPalindrome(-101));
	}

	/*public boolean isPalindrome(int x) {
		boolean result = false;
		String str = String.valueOf(x);
		int middle = str.length() / 2;
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();

		for (int i = 0; i <= middle - 1; i++) {
			left.append(str.charAt(i));
		}

		for (int i = str.length() - 1; i >= str.length() - middle; i--) {
			right.append(str.charAt(i));
		}

		if (left.toString().equals(right.toString())) {
			result = true;
		}

		return result;
	}*/

	public boolean isPalindrome(int x) {
		int reversed = 0;
		int temp = x;
		while (temp > 0) {
			reversed = reversed * 10 + temp % 10;
			temp /= 10;
		}

		return x == reversed;
	}
}
