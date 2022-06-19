package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11586_지영_공주님의_마법_거울 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] mirror = new String[n];
		for (int i = 0; i < n; i++) {
			mirror[i] = br.readLine();
		}
		int k = Integer.parseInt(br.readLine());

		if (k == 1) {
			for (String s : mirror) {
				System.out.println(s);
			}
		} else if (k == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(mirror[i].charAt(j));
				}
				System.out.println();
			}
		} else if (k == 3) {
			for (int i = n - 1; i >= 0; i--) {
				System.out.println(mirror[i]);
			}
		}
	}
}
