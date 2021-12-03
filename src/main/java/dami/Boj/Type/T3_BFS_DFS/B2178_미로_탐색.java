package dami.Boj.Type.T3_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178_미로_탐색 {
	static int n, m;
	static int[][] board;
	static boolean[][] visited;
	static Queue<Node> queue;
	static int[] dx = new int[] {1, 0, -1, 0};
	static int[] dy = new int[] {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		board = new int[n][m];
		visited = new boolean[n][m];

		// board 세팅
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = str.charAt(j) - '0';
			}
		}

		visited[0][0] = true;
		bfs(0, 0);

		System.out.println(board[n - 1][m - 1]);
	}

	private static void bfs(int x, int y) {
		queue = new LinkedList<>();
		queue.offer(new Node(x, y));

		while (!queue.isEmpty()) {
			Node node = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nextX = node.getX() + dx[i];
				int nextY = node.getY() + dy[i];

				// 다음 좌표가 범위를 넘어갈 때 건너뛰기
				if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
					continue;
				}

				// 이미 방문했으면 건너뛰기
				if (visited[nextX][nextY] == true || board[nextX][nextY] == 0) {
					continue;
				}

				// 다음에 방문할 좌표를 큐에 넣는다.
				queue.offer(new Node(nextX, nextY));
				// 배열안에 다음 방문할 곳은 현재 방문했던 점보다 1칸 더 가야하므로 +1
				board[nextX][nextY] = board[node.getX()][node.getY()] + 1;
				// 다음 좌표는 방문했음으로 표시
				visited[nextX][nextY] = true;
			}
		}
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
