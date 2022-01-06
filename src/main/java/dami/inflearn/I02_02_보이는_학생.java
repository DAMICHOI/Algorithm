package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I02_02_보이는_학생 {
	// 내가 푼 문제 (속도 179ms/메모리 36MB)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 1;
		int prev = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			int now = Integer.parseInt(st.nextToken());
			if (prev < now) {
				prev = now;
				count++;
			}
		}

		System.out.println(count);
	}

	// 강사님 문제 풀이 (속도 577ms/메모리 52MB)
	/*public static void main(String[] args) {
		I02_02_보이는_학생 t = new I02_02_보이는_학생();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(t.solution(n, arr));
	}

	private int solution(int n, int[] arr) {
		int answer = 1, max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}

		return answer;
	}*/
}
