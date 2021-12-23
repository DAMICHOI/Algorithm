package dami.leetcode;

public class L14_Longest_Common_Prefix {
	public static void main(String[] args) {
		L14_Longest_Common_Prefix solution = new L14_Longest_Common_Prefix();
		System.out.println(solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
		System.out.println(solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
	}

	private String longestCommonPrefix(String[] strs) {
		String prefix = "";

		if (strs.length == 0) {
			return prefix;
		} else {
			prefix = strs[0];
		}

		for (String str : strs) {
			int minLength = Math.min(prefix.length(), str.length());
			prefix = prefix.substring(0, minLength);
			for (int i = 0; i < minLength; i++) {
				if (prefix.charAt(i) != str.charAt(i)) {
					prefix = prefix.substring(0, i);
					break;
				}
			}
		}

		return prefix;
	}
}
