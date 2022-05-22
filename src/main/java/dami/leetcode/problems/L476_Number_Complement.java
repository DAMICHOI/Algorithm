package dami.leetcode.problems;

public class L476_Number_Complement {
	public static void main(String[] args) {
		L476_Number_Complement solution = new L476_Number_Complement();
		System.out.println(solution.findComplement(5));
		System.out.println(solution.findComplement(2));
	}

	private int findComplement(int num) {
		int valid = 0;
		int temp = num;

		// 가장 높은 비트가 1인 자릿수를 찾는다.
		while (temp > 0) {
			temp /= 2;
			valid++;
		}

		// 원본 데이터를 반전하고 마스크를 합산한다.
		return ~num & ((1 << valid) - 1);
	}

	/*private int findComplement(int num) {
		return ~num & ((Integer.highestOneBit(num) << 1) - 1);
	}*/

	/*private int findComplement(int num) {
		int copy = num;
		int mask = 1;

		while (copy > 0) {
			num = num ^ mask;	// XOR
			mask <<= 1;
			copy >>= 1;
		}
		return num;
	}*/
}
