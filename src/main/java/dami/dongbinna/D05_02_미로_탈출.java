package dami.dongbinna;

import java.io.*;
import java.util.*;

/*
[문제]
동빈이는 N * M 크기의 직사각형 형태의 미로에 갇혀 있다. 미로에는 여러 마리의 괴물이 있어 이를 피해 탈출해야 한다. 동빈이의 위치는 (1, 1)이고 미로의 출구는 (N, M)의 위치에 존재하며 한 번에 한 칸씩 이동할 수 있다. 이때 괴물이 있는 부분은 0으로, 괴물이 없는 부분은 1로 표시되어 있다. 미로는 반드시 탈출할 수 있는 형태로 제시된다. 이때 동빈이가 탈출하기 위해 움직여야 하는 최소 칸의 개수를 구하시오. 칸을 셀 때는 시작 칸과 마지막 칸을 모두 포함해서 계산한다.

[입력 조건]
- 첫째 줄에 두 정수 N, M(4 <= N, M <= 200)이 주어집니다. 다음 N개의 줄에는 각각 M개의 정수(0 혹은 1)로 미로의 정보가 주어진다. 각각의 수들은 공백 없이 붙어서 입력으로 제시된다. 또한 시작 칸과 마지막 칸은 항상 1이다.)

[출력 조건]
- 첫째 줄에 최소 이동 칸의 개수를 출력한다.

[입력 예시]
5 6
101010
111111
000001
111111
111111

[출력 예시]
10
*/
public class D05_02_미로_탈출 {
	private static int n, m;
	private static int[][] graph;

	// 이동할 네 방향 정의 (상, 하, 좌, 우)
	private static final int[] dx = {-1, 1, 0, 0};
	private static final int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// n, m을 공백으로 구분하여 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		graph = new int[n][m];

		// 2차원 리스트의 맵 정보 입력받기
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				graph[i][j] = Integer.parseInt(str[j]);
			}
		}

		// BFS를 수행한 결과 출력
		bw.write(String.valueOf(bfs(0, 0)));
		bw.flush();
		bw.close();
	}

	public static int bfs(int x, int y) {
		// 큐(Queue) 구현을 위해 Queue 라이브러리 사용
		Deque<Node> queue = new ArrayDeque<>();
		queue.offer(new Node(x, y));

		// 큐가 빌 때까지 반복하기
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			x = node.getIndex();
			y = node.getDistance();

			// 현재 위치에서 네 방향으로의 위치 확인
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				// 미로 찾기 공간을 벗어난 경우 무시
				if (nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;

				// 벽인 경우 무시
				if (graph[nx][ny] == 0)
					continue;

				// 해당 노드를 처음 반복하는 경우에만 최단 거리 기록
				if (graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					queue.offer(new Node(nx, ny));
				}
			}
		}

		// 가장 오른쪽 아래까지의 최단 거리 반환
		return graph[n - 1][m - 1];
	}

	static class Node {
		private int index;
		private int distance;

		public Node(int index, int distance) {
			this.index = index;
			this.distance = distance;
		}

		public int getIndex() {
			return this.index;
		}

		public int getDistance() {
			return this.distance;
		}
	}
}

