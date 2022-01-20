package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I02_10_봉우리 {
	int[] dx = {-1, 1, 0, 0};
	int[] dy = {0, 0, -1, 1};
	// 이동할 네 방향 정의 (상, 하, 좌, 우)

	// (속도 101ms/메모리 27MB)
	public static void main(String[] args) throws IOException {
		I02_10_봉우리 t = new I02_10_봉우리();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] graph = new int[n][n];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		System.out.println(t.count(n, graph));

	}

	private int count(int n, int[][] arr) {
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
			}
		}

		return count;
	}
}
