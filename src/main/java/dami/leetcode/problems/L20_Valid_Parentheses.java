package dami.leetcode.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class L20_Valid_Parentheses {
	public static void main(String[] args) {
		L20_Valid_Parentheses solution = new L20_Valid_Parentheses();
		System.out.println(solution.isValid("()"));
	}

	private boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '{') {
				stack.push('}');
			} else if (c == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.peekFirst() != c) {
				return false;
			} else {
				stack.pop();
			}
		}

		return stack.isEmpty();
	}
}
