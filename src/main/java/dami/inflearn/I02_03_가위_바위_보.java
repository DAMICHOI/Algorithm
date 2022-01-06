package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I02_03_가위_바위_보 {
	// 내가 푼 문제 (속도 92ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] b = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (st.hasMoreTokens()) {
			a[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		st = new StringTokenizer(br.readLine(), " ");
		i = 0;
		while (st.hasMoreTokens()) {
			b[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		for (int j = 0; j < n; j++) {
			if (a[j] == b[j]) {
				sb.append("D").append("\n");
			} else if ((a[j] == 2 && b[j] == 1) || (a[j] == 3 && b[j] == 2) || (a[j] == 1 && b[j] == 3)) {
				sb.append("A").append("\n");
			} else {
				sb.append("B").append("\n");
			}
		}

		System.out.println(sb.toString());
	}

	// 강사님 문제 풀이 (속도 134ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_03_가위_바위_보 t = new I02_03_가위_바위_보();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = kb.nextInt();
		}

		for (char x : t.solution(n, a, b).toCharArray()){
			System.out.println(x);
		}
	}

	private String solution(int n, int[] a, int[] b) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				answer += "D";
			else if (a[i] == 1 && b[i] == 3)
				answer += "A";
			else if (a[i] == 2 && b[i] == 1)
				answer += "A";
			else if (a[i] == 3 && b[i] == 2)
				answer += "A";
			else
				answer += "B";
		}
		return answer;
	}*/
}
