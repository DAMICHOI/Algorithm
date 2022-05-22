package dami.leetcode.problems;

import java.util.HashMap;

public class L13_Roman_to_Integer {
	public static void main(String[] args) {
		L13_Roman_to_Integer solution = new L13_Roman_to_Integer();
		System.out.println(solution.romanToInt("III"));
		System.out.println(solution.romanToInt("LVIII"));
		System.out.println(solution.romanToInt("MCMXCIV"));
	}

	private int romanToInt(String s) {
		int result;
		HashMap<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		result = map.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
				result += map.get(s.charAt(i));
			} else {
				result -= map.get(s.charAt(i));
			}
		}

		return result;
	}
}
