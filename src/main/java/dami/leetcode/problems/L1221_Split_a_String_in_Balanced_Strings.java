package dami.leetcode.problems;

public class L1221_Split_a_String_in_Balanced_Strings {
	public static void main(String[] args) {
		L1221_Split_a_String_in_Balanced_Strings solution = new L1221_Split_a_String_in_Balanced_Strings();
		System.out.println(solution.balancedStringSplit("RLRRLLRLRL"));
		System.out.println(solution.balancedStringSplit("RLLLLRRRLR"));
		System.out.println(solution.balancedStringSplit("LLLLRRRR"));
	}

	// 내 풀이 (Runtime : 0ms, Memory : 36.7MB)
	private int balancedStringSplit(String s) {
		int l = 0, r = 0, count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				r++;
			} else {
				l++;
			}

			if (r == l) {
				count++;
			}
		}

		return count;
	}

	// 내 풀이 2 (Runtime : 1ms, Memory : 38.4MB)
	/*private int balancedStringSplit(String s) {
		int pointer = 0, count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				pointer++;
			} else {
				pointer--;
			}

			if (pointer == 0) {
				count++;
			}
		}
		return count;
	}*/

	// 다른 사람 풀이 (Runtime : 1ms, Memory : 38.7MB)
	/*private int balancedStringSplit(String s) {
		int pointer = 1, counter = 0;

		if (s.charAt(0) == 'R') {
			pointer = -1;
		}

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				pointer++;
			} else {
				pointer--;
			}

			if (pointer == 0) {
				counter++;
			}
		}

		return counter;
	}*/
}
