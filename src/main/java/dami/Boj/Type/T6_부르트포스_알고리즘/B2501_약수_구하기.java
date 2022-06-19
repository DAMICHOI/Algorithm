package dami.Boj.Type.T6_부르트포스_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2501_약수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;

		for (int i = 1, j = 0; i < n + 1; i++) {
			if (n % i == 0) {
				j++;
			}

			if (j == k) {
				result = i;
				break;
			}
		}

		System.out.println(result);
	}
}
