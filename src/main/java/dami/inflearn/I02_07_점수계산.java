package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class I02_07_점수계산 {
	// 내가 푼 문제 (속도 86ms/메모리 26MB)
	public static void main(String[] args) throws IOException {
		I02_07_점수계산 solution = new I02_07_점수계산();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(solution.getScore(arr));
	}

	private int getScore(int[] arr) {
		int score = arr[0];
		int[] mark = new int[arr.length];
		int count = 0;

		mark[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == 1 && arr[i] == 1) {
				count++;
				mark[i] = arr[i] + count;
			} else {
				count = 0;
				mark[i] = arr[i];
			}

			score += mark[i];
		}

		return score;
	}

	// 내가 푼 문제2 (속도 89ms/메모리 26MB)
	/*public static void main(String[] args) throws IOException {
		I02_07_점수계산 solution = new I02_07_점수계산();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(solution.getScore(arr));
	}

	private int getScore(int[] arr) {
		int score = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				score += count;
			} else {
				count = 0;
			}
		}
		return score;
	}*/

	// 강사님 문제 풀이 (속도 127ms/메모리 28MB)
	/*public static void main(String[] args) {
		I02_07_점수계산 t = new I02_07_점수계산();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		System.out.println(t.solution(n, arr));
	}

	private int solution(int n, int[] arr) {
		int answer = 0, cnt = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i]==1) {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		return answer;
	}*/
}
