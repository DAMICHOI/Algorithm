package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B2935_소음 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		char operation = br.readLine().charAt(0);
		BigInteger b = new BigInteger(br.readLine());

		if (operation == '+') {
			System.out.println(a.add(b));
		} else if (operation == '*') {
			System.out.println(a.multiply(b));
		}
	}
}
