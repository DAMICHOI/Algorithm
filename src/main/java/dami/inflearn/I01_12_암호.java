package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class I01_12_암호 {
	// 내가 푼 문제 (속도 96ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		input = input.replaceAll("\\*", "0").replaceAll("#", "1");

		while (n > 0) {
			String num = input.substring(0, 7);
			int number = 0;
			int squared = 1;
			for (int i = 6; i >= 0; i--) {
				number += (Integer.parseInt(String.valueOf(num.charAt(i))) * squared);
				squared *= 2;
			}
			sb.append((char)number);
			input = input.substring(7);
			n--;
		}

		System.out.println(sb.toString());
	}

	// 강사님 문제 풀이 (속도 114ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_01_큰_수_출력하기 t = new I02_01_큰_수_출력하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(t.solution(n, str));
	}

	private String solution(int n, String s) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			String temp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(temp, 2);
			answer += (char)num;
			s = s.substring(7);
		}
		return answer;
	}*/
}
