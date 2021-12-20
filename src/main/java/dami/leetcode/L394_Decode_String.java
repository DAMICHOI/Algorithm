package dami.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class L394_Decode_String {
	public static void main(String[] args) {
		L394_Decode_String solution = new L394_Decode_String();
		System.out.println(solution.decodeString("3[a]2[bc]"));
		System.out.println(solution.decodeString("3[a2[c]]"));
		System.out.println(solution.decodeString("2[abc]3[cd]ef"));
		System.out.println(solution.decodeString("abc3[cd]xyz"));
	}

	public String decodeString(String s) {
		/*int repeat = 0;
		StringBuilder output = new StringBuilder();
		Stack<StringBuilder> curs = new Stack<>();
		Stack<Integer> repeats = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);

			if (Character.isDigit(temp)) {
				repeat = repeat * 10 + Character.getNumericValue(temp);
			} else if (temp == '[') {
				curs.push(output);
				repeats.push(repeat);
				repeat = 0;
				output = new StringBuilder();
			} else if (temp == ']') {
				repeat = repeats.pop();
				StringBuilder toAdd = output;
				output = curs.pop();
				while (repeat > 0) {
					output.append(toAdd);
					repeat--;
				}
			} else {
				output.append(temp);
			}
		}

		return output.toString();*/

		Deque<Integer> countStack = new ArrayDeque();
		Deque<StringBuilder> resStack = new ArrayDeque();
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				count = count * 10 + (c - '0');
			} else if (Character.isAlphabetic(c)) {
				sb.append(c);
			} else if (c == '[') {
				countStack.push(count);
				resStack.push(sb);
				sb = new StringBuilder();
				count = 0;
			} else if (c == ']') {
				StringBuilder prefix = resStack.pop();
				int k = countStack.pop();
				while (k > 0) {
					prefix.append(sb);
					k--;
				}
				sb = prefix;
			}
		}

		return sb.toString();
	}
}
