package dami.Boj.Type.T6_부르트포스_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9094_수학적_호기심 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int a = 1; a < n; a++) {
				for (int b = a + 1; b < n; b++) {
					if (((a * a) + (b * b) + m) % (a * b) == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}
}
