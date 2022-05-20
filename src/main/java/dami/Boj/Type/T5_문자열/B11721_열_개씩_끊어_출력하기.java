package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11721_열_개씩_끊어_출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		for (int i = 0; i < word.length(); i++) {
			if (i !=0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(word.charAt(i));
		}
	}
}
