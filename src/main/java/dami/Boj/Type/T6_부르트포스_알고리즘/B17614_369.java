package dami.Boj.Type.T6_부르트포스_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17614_369 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int clap = 0;
		for (int i = 1; i <= n; i++) {
			int temp = i;
			while (temp > 0) {
				clap = (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) ? clap+1 : clap;
				temp /= 10;
			}
		}
		System.out.println(clap);
	}
}
