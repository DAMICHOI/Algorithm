package dami.programmers;

public class P12940_최대공약수와_최소공배수 {
	public static void main(String[] args) {
		P12940_최대공약수와_최소공배수 p = new P12940_최대공약수와_최소공배수();
		p.solution(3, 12);
		p.solution(2, 5);
	}

	private int[] solution(int n, int m) {
		int gcd = gcd(n, m);
		int lcm = lcm(n, m, gcd);
		// System.out.println("gcd=" + gcd + " lcm=" + lcm);
		return new int[] {gcd, lcm};
	}

	private int lcm(int n, int m, int gcd) {
		return (n * m) / gcd;
	}

	private int gcd(int n, int m) {
		int mod = n % m;
		while (mod > 0) {
			// System.out.println("n=" + n + " m=" + m + " mod=" + mod);
			n = m;
			m = mod;
			mod = n % m;
		}
		return m;
	}
}
