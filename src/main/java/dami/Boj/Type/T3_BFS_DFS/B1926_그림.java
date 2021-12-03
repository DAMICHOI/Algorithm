package dami.Boj.Type.T3_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1926_그림 {
	static int n, m;
	static int[][] board;
	static boolean[][] visited;
	static int[] dx;
	static int[] dy;
	static Queue<Node> queue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		visited = new boolean[n][m];
		queue = new LinkedList<>();

		dx = new int[] {1, 0, -1, 0};
		dy = new int[] {0, 1, 0, -1};

		// board 세팅
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// bfs 시작
		int count = 0, area = 0, max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 0이거나 방문한 적이 있으면 생략
				if (board[i][j] == 0 || visited[i][j]) {
					continue;
				}

				count++; // 1이고, 방문을 하지 않았으므로 시작점이 되니까 +1
				queue.offer(new Node(i, j));    // queue에 좌표를 넣어준다.
				visited[i][j] = true;    // 방문 처리
				area = 0;    // 0이면 그림이 끊겼으므로 area = 0;

				while (!queue.isEmpty()) {
					Node node = queue.poll();
					area++;    // 넓이 +1
					for (int k = 0; k < 4; k++) {
						int nX = node.getX() + dx[k];
						int nY = node.getY() + dy[k];
						if (nX < 0 || nX >= n || nY < 0 || nY >= m) {
							continue;
						}
						if (board[nX][nY] == 1 && !visited[nX][nY]) {
							queue.offer(new Node(nX, nY));
							visited[nX][nY] = true;
						}
					}
				}

				if (area > max) {
					max = area;
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}

	public static class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}
}