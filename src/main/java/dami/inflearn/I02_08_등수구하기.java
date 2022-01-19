package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I02_08_등수구하기 {
	// (속도 94ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		I02_08_등수구하기 t = new I02_08_등수구하기();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int x : t.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

	private int[] solution(int n, int[] arr) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			int cnt = 1;
			for (int j = 0; j < n; j++) {
				if (arr[j] > arr[i]) {
					cnt++;
				}
				answer[i] = cnt;
			}
		}

		return answer;
	}
}
