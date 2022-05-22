package dami.leetcode.problems;

import java.util.Deque;
import java.util.LinkedList;

public class L3_LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		L3_LongestSubstringWithoutRepeatingCharacters solution = new L3_LongestSubstringWithoutRepeatingCharacters();
		System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(solution.lengthOfLongestSubstring("bbbbbb"));
		System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
	}

	private int lengthOfLongestSubstring(String s) {
		if (s.length() < 2) {
			return s.length();
		}

		Deque<Character> queue = new LinkedList<>();
		int maxCount = 0;
		for (char c : s.toCharArray()) {
			while (queue.contains(c)) {
				queue.poll();
			}

			queue.offer(c);
			maxCount = Math.max(maxCount, queue.size());
		}
		System.out.println(queue.toString());
		return maxCount;
	}

	// private int lengthOfLongestSubstring(String s) {
	// 	HashMap<Character, Integer> map = new HashMap<>();
	// 	int maxLength = 0;
	// 	int start = 0;
	// 	for (int i = 0; i < s.length(); i++) {
	// 		char c = s.charAt(i);
	// 		if (map.get(c) != null && map.get(c) >= start) {
	// 			start = map.get(c) + 1;
	// 		}
	//
	// 		map.put(c, i);
	// 		maxLength = Math.max(maxLength, i - start + 1);
	// 	}
	// 	return maxLength;
	// }
}
