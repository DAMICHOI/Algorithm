package dami.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L76_MinimumWindowSubstring {
	public static void main(String[] args) {
		System.out.println(minWindows("ADOBECODEBANC", "ABC"));
	}

	private static String minWindows(String s, String t) {
		int r = 0, l = 0, tCnt = t.length(), minLen = Integer.MAX_VALUE, minIdx = 0;

		Map<Character, Integer> map = new HashMap<>();
		for (char c : t.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// T.C : O(n)
		while (r < s.length()) {
			char c = s.charAt(r);
			if (map.containsKey(c)) {
				if (map.get(c) > 0) {
					tCnt--;
				}
				map.put(c, map.get(c) - 1);
			}
			r++;

			while (tCnt == 0) {
				if (minLen > r - l) {
					minLen = r - l;
					minIdx = l;
				}

				char lChar = s.charAt(l);
				if (map.containsKey(lChar)) {
					map.put(lChar, map.get(lChar) + 1);
					if (map.get(lChar) > 0) {
						tCnt++;
					}
				}
				l++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minIdx, minIdx + minLen);
	}

}
