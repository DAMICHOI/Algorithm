package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I02_01_큰_수_출력하기 {
	// 내가 푼 문제 (속도 93ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int prev = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		sb.append(prev).append(" ");

		while (st.hasMoreTokens()) {
			int now = Integer.parseInt(st.nextToken());
			if (prev < now) {
				sb.append(now).append(" ");
			}
			prev = now;
		}

		System.out.println(sb.toString());
	}

	// 강사님 문제 풀이 (속도 127ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_01_큰_수_출력하기 t = new I02_01_큰_수_출력하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for (int x : t.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}

		return answer;
	}*/
}
