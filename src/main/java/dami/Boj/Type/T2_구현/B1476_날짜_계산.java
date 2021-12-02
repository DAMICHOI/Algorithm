package dami.Boj.Type.T2_구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1476_날짜_계산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int E = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		int M = Integer.parseInt(arr[2]);

		int e = 1, s = 1, m = 1;
		int year = 1;

		while (true) {
			if (e > 15) {
				e = 1;
			}

			if (s > 28) {
				s = 1;
			}

			if (m > 19) {
				m = 1;
			}
			if (e == E && s == S && m == M) {
				break;
			}

			e++;
			s++;
			m++;
			year++;
		}

		System.out.println(year);
	}
}
