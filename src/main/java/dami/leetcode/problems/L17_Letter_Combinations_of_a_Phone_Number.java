package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L17_Letter_Combinations_of_a_Phone_Number {
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
		System.out.println(letterCombinations(""));
		System.out.println(letterCombinations("2"));
	}

	private static List<String> letterCombinations(String digits) {
		String[] keypad = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		if (digits.length() == 0) {
			return new ArrayList<>();
		}

		List<String> combination = new ArrayList<>();
		backtrack(combination, digits.toCharArray(), "", keypad);
		return combination;
	}

	private static void backtrack(List<String> combination, char[] digits, String s, String[] keypad) {
		if (s.length() == digits.length) {
			combination.add(s);
			return;
		}

		int index = s.length();
		int digit = digits[index] - '0';

		for (char letter : keypad[digit].toCharArray()) {
			backtrack(combination, digits, s + letter, keypad);
		}
	}

	// static HashMap<Integer, String> keypad = new HashMap<>();
	//
	// private static List<String> letterCombinations(String digits) {
	// 	if (digits == null || digits.length() == 0) {
	// 		return new ArrayList<>();
	// 	}
	//
	// 	List<String> combination = new ArrayList<>();
	//
	// 	makeKeypad();
	// 	backtracking(combination, digits.toCharArray(), "");
	//
	// 	return combination;
	// }
	//
	// private static void backtracking(List<String> combination, char[] digits, String s) {
	// 	if (s.length() == digits.length) {
	// 		combination.add(s);
	// 		return;
	// 	}
	//
	// 	int index = s.length();
	// 	int digit = digits[index] - '0';
	//
	// 	for (char letter : keypad.get(digit).toCharArray()) {
	// 		backtracking(combination, digits, s + letter);
	// 	}
	// }
	//
	// private static void makeKeypad() {
	// 	keypad.put(2, "abc");
	// 	keypad.put(3, "def");
	// 	keypad.put(4, "ghi");
	// 	keypad.put(5, "jkl");
	// 	keypad.put(6, "mno");
	// 	keypad.put(7, "pqrs");
	// 	keypad.put(8, "tuv");
	// 	keypad.put(9, "wxyz");
	// }
}
