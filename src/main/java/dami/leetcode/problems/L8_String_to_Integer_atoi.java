package dami.leetcode.problems;

class L8_String_to_Integer_atoi {
	public static void main(String[] args) {
		L8_String_to_Integer_atoi solution = new L8_String_to_Integer_atoi();
		System.out.println(solution.myAtoi("42"));
		System.out.println(solution.myAtoi("   -42"));
		System.out.println(solution.myAtoi("4193 with words"));
		System.out.println(solution.myAtoi("words and 987"));
		System.out.println(solution.myAtoi("-91283472332"));
		System.out.println(solution.myAtoi("   +0 123"));

	}

	private int myAtoi(String s) {
		int sign = 1;
		long number = 0L;

		s = s.trim();

		if (s.length() == 0) {
			return 0;
		}

		if (s.charAt(0) == '-') {
			sign = -1;
		}

		int i = (s.charAt(0) == '-' || s.charAt(0) == '+') ? 1 : 0;

		while (s.length() > i) {
			if (!Character.isDigit(s.charAt(i))) {
				break;
			}

			number = number * 10 + s.charAt(i) - '0';

			if (sign == -1 && sign * number < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}

			if (sign == 1 && sign * number > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}

			i++;
		}

		return (int)(sign * number);
	}
}
