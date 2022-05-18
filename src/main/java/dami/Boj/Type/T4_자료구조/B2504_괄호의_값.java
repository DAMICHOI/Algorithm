package dami.Boj.Type.T4_자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class B2504_괄호의_값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Deque<Character> stack = new LinkedList<>();
		int result = 0;
		int value = 1;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(') {
				stack.push(c);
				value *= 2;    // ( : 2
			} else if (c == '[') {
				stack.push(c);
				value *= 3;    // ( : 3
			} else {
				if (c == ')') {
					if (stack.isEmpty() || stack.peek() != '(') {
						result = 0;
						break;
					}
					if (str.charAt(i - 1) == '(') {
						result += value;
					}

					stack.pop();
					value /= 2;
				} else if (c == ']') {
					if (stack.isEmpty() || stack.peek() != '[') {
						result = 0;
						break;
					}
					if (str.charAt(i - 1) == '[') {
						result += value;
					}
					stack.pop();
					value /= 3;
				}
			}

			System.out.println(str.charAt(i) + " " + result);
		}

		if (!stack.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}
	}
}
