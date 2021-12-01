package dami.Boj.Type.T3_DFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B11448_Ga {
    static int t, n;
    static char[][] graph;
    static int count;
    final static int[][] distance = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            n = Integer.parseInt(br.readLine());
            graph = setGraph(br);
            count = getCount();
            sb.append(count).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        graph[x][y] = 'w';
        int cnt = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < distance.length; i++) {
                int dx = x + distance[i][0];
                int dy = y + distance[i][1];

                if ((0<=dx && dx<n) && (0<=dy && dy<n) && graph[dx][dy] == '-') {
                    queue.offer(new Node(dx, dy));
                    graph[dx][dy] = 'w';
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static char[][] setGraph(BufferedReader br) throws IOException {
        graph = new char[n][n];

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j] = str.charAt(j);
            }
        }

        return graph;
    }

    public static int getCount() {
        count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 'w') {
                    count += bfs(i, j);
                }
            }
        }
        return count;
    }
}

class Node {
    private int x, y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}