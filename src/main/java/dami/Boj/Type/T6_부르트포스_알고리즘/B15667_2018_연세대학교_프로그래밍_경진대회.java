package dami.Boj.Type.T6_부르트포스_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15667_2018_연세대학교_프로그래밍_경진대회 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = 0;

		for (int i = 0; i < 10101; i++) {
			if (n == (1 + i + (i * i))) {
				k = i;
				break;
			}
		}
		System.out.println(k);
	}
}
