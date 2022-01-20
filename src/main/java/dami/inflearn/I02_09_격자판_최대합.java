package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I02_09_격자판_최대합 {
	// (속도 91ms/메모리 27MB)
	public static void main(String[] args) throws IOException {
		I02_09_격자판_최대합 t = new I02_09_격자판_최대합();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(t.solution(n, board));
	}

	private int solution(int n, int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum1, sum2;

		for (int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			maxSum = Math.max(maxSum, sum1);
			maxSum = Math.max(maxSum, sum2);
		}

		sum1 = sum2 = 0;

		for (int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n - i - 1];
		}

		maxSum = Math.max(maxSum, sum1);
		maxSum = Math.max(maxSum, sum2);

		return maxSum;
	}

}
