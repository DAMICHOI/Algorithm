package dami.Boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2609_최대공약수와_최소공배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}

	private static int gcd(int a, int b) {
		int mod = a % b;
		while (mod > 0) {
			a = b;
			b = mod;
			mod = a % b;
		}
		return b;
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
