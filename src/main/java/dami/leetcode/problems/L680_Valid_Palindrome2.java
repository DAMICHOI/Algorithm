package dami.leetcode.problems;

public class L680_Valid_Palindrome2 {
	public static void main(String[] args) {
		L680_Valid_Palindrome2 solution = new L680_Valid_Palindrome2();
		// System.out.println(validPalindrome("aba"));
		System.out.println(validPalindrome("abca"));
		// System.out.println(validPalindrome("abc"));
		// System.out.println(validPalindrome("eeccccbebaeeabebccceea"));

	}

	private static boolean validPalindrome(String s) {
		int l = 0, r = s.length()-1;

		while (l < r) {
			if (s.charAt(l) != s.charAt(r)) {
				return valid(s, l, r-1) || valid(s, l+1, r);
			}
			l++; r--;
		}
		return true;
	}

	private static boolean valid(String s, int l, int r) {
		while (l<r) {
			if (s.charAt(l)!= s.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		return true;
	}

}
