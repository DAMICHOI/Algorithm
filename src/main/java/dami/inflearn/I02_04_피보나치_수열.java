package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class I02_04_피보나치_수열 {
	// 내가 푼 문제 (속도 94ms/메모리 26MB)
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = 1, b = 1;
		sb.append(a).append(" ").append(b).append(" ");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			sb.append(c).append(" ");
			a = b;
			b = c;
		}
		System.out.println(sb.toString());
	}*/

	// 내가 푼 문제2 (속도 87ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] answer = new int[n];
		StringBuilder sb = new StringBuilder();

		answer[0] = 1;
		answer[1] = 1;
		sb.append(answer[0]).append(" ").append(answer[1]).append(" ");
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i-2]+answer[i-1];
			sb.append(answer[i]).append(" ");
		}
		System.out.println(sb.toString());
	}

	// 강사님 문제 풀이 (속도 121ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_04_피보나치_수열 t = new I02_04_피보나치_수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for (int x : t.solution(n)) {
			System.out.print(x + " ");
		}
	}

	private int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}
		return answer;
	}*/
}
