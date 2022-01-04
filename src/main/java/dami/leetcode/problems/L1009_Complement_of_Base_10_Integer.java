package dami.leetcode.problems;

public class L1009_Complement_of_Base_10_Integer {
	public static void main(String[] args) {
		L1009_Complement_of_Base_10_Integer solution = new L1009_Complement_of_Base_10_Integer();
		System.out.println(solution.bitwiseComplement(5));
		System.out.println(solution.bitwiseComplement(7));
		System.out.println(solution.bitwiseComplement(10));
		System.out.println(solution.bitwiseComplement(0));
	}

	private int bitwiseComplement(int n) {
		if (n == 0) {
			return 1;
		}
		int flip = 0;

		while (flip < n) {
			System.out.println(flip + "<<1=" + (flip << 1));
			flip = (flip << 1) | 1;	// 마스크 비트에 1 추가
			System.out.println("flip<<1|1=" + flip);
		}
		System.out.println("n^flip=" + (n ^ flip));
		return n ^ flip;
	}

	private int bitwiseComplement2(int n) {
		if (n == 0) {
			return 1;
		}

		int copy = n;
		int mask = 1;

		while (copy > 0) {
			n = n ^ mask;    // XOR
			mask <<= 1;
			copy >>= 1;
			System.out.println(n + " " + mask + " " + copy);
		}
		return n;
	}
}
