package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B6321_IBM_빼기_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			System.out.printf("String #%d\n", i + 1);
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'Z') {
					System.out.print("A");
				} else {
					System.out.print((char)(s.charAt(j) + 1));
				}
			}

			if (i != n - 1) {
				System.out.println();
				System.out.println();
			}
		}

	}
}
