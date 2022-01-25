package dami.leetcode.problems;

public class L28_Implement_strStr {
	public static void main(String[] args) {
		L28_Implement_strStr solution = new L28_Implement_strStr();
		System.out.println(solution.strStr("hello", "ll"));
		System.out.println(solution.strStr("aaaaa", "bba"));
		System.out.println(solution.strStr("", ""));
	}

	// Brute Force - TC: O(M * N), SC: O(1)
	// M = Length of haystack string. N = length of needle string.
	// runtime: 1349ms, memory usage: 39.3MB
	private int strStr(String haystack, String needle) {
		int haystackLen = haystack.length();
		int needleLen = needle.length();

		if (needleLen == 0) {
			return 0;
		}
		if (haystackLen < needleLen) {
			return -1;
		}

		for (int i = 0; i <= haystackLen - needleLen; i++) {
			int j = 0;
			while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;
			}
			if (j == needleLen) {
				return i;
			}
		}
		return -1;
	}

	// KMP Algorith - TC: O(M + N). O(N) to create lookup table. O(M) to find the needle in haystack.
	// SC: O(N). This is required to save the lookup table.
	// M = Length of haystack string. N = length of needle string.
	// runtime: 8ms, memory usage: 38.8MB
	/*private int strStr(String haystack, String needle) {
		if (haystack.equals("")) {
			if (needle.equals("")) {
				return 0;
			} else {
				return -1;
			}
		}
		if (needle.equals("")) {
			return 0;
		}

		int[] array = kpmLookUp(needle);	// needle의 길이 저장
		int i = 0, j = 0;


		while (i < needle.length() && j < haystack.length()) {
			if (needle.charAt(i) == haystack.charAt(j) && i == needle.length() - 1) {
				return j - i;
			} else if (needle.charAt(i) == haystack.charAt(j)) {
				i++;
				j++;
			} else {
				if (i != 0) {
					i = array[i - 1];
				} else {
					j++;
				}
			}
		}

		return -1;
	}

	private int[] kpmLookUp(String needle) {
		int i = 0;
		int j = 1;

		int[] table = new int[needle.length()];
		table[0] = 0;

		while (j < needle.length()) {
			if (needle.charAt(i) == needle.charAt(j)) {
				i++;
				table[j] = i;
				j++;
			} else if (i == 0) {
				table[j] = 0;
				j++;
			} else {
				i = table[i - 1];
			}
		}

		return table;
	}*/
}
