package dami.leetcode.problems;

public class L567_Permutation_in_String {
	public static void main(String[] args) {
		L567_Permutation_in_String solution = new L567_Permutation_in_String();
		System.out.println(solution.checkInclusion("ab", "eidbaooo"));
		System.out.println(solution.checkInclusion("ab", "eidboaoo"));
		System.out.println(solution.checkInclusion("ab", "ab"));
	}

	private boolean checkInclusion(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2)
			return false;

		int[] count = new int[26];
		for (int i = 0; i < len1; i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		if (allZero(count))
			return true;

		for (int i = len1; i < len2; i++) {
			count[s2.charAt(i) - 'a']--;
			count[s2.charAt(i - len1) - 'a']++;
			if (allZero(count))
				return true;
		}

		return false;
	}

	private boolean allZero(int[] count) {
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0)
				return false;
		}
		return true;
	}

}
