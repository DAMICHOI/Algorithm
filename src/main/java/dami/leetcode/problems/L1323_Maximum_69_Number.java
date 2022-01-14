package dami.leetcode.problems;

public class L1323_Maximum_69_Number {
	public static void main(String[] args) {
		L1323_Maximum_69_Number solution = new L1323_Maximum_69_Number();
		System.out.println(solution.maximum69Number(9669));
	}

	private int maximum69Number(int num) {
		char[] chars = Integer.toString(num).toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '6') {
				chars[i] = '9';
				break;
			}
		}
		return Integer.parseInt(String.valueOf(chars));
	}
}
