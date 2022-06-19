package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2857_FBI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] fbiNames = new String[5];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			fbiNames[i] = br.readLine();
			if (fbiNames[i].contains("FBI")) {
				sb.append(i + 1).append(" ");
			}
		}

		if (sb.toString().trim().equals("")) {
			System.out.println("HE GOT AWAY!");
		} else {
			System.out.println(sb.toString().trim());
		}
	}
}
