package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808_알파벳_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] alphabets = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alphabets[s.charAt(i) - 'a']++;
		}

		for (int n : alphabets) {
			System.out.print(n + " ");
		}
	}
}
