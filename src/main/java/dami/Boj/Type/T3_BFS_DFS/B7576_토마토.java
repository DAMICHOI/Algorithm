package dami.Boj.Type.T3_BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B7576_토마토 {
    static int m, n;
    static int[][] box;
    static Queue<Node> queue;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];
        queue = new LinkedList<Node>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());

                // 토마토가 익었을 경우 큐에 넣는다.
                if (box[i][j] == 1) {
                    queue.offer(new Node(i, j));
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        int result = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            Node node = queue.poll();

            int x = node.getX();
            int y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                // 범위 내에서
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    // 토마토가 안익었을 경우
                    if (box[nextX][nextY] == 0) {
                        // 익은 토마토 추가
                        queue.offer(new Node(nextX, nextY));
                        // 익은 날짜를 얻기 위해 그 전 값에 1 추가
                        box[nextX][nextY] = box[x][y] + 1;
                    }
                }
            }
        }

        // 최대 날짜 구하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }

                result = Math.max(result, box[i][j]);
            }
        }

        // 토마토가 모두 익은 상태일 경우
        if (result == 1) {
            return 0;
        } else {
            // 걸린 일수는 결과값에서 1을 빼줘야 한다.
            return result - 1;
        }
    }

    public static class Node {
        int x;
        int y;

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
