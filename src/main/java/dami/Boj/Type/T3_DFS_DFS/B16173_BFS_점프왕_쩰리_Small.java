package dami.Boj.Type.T3_DFS_DFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B16173_BFS_점프왕_쩰리_Small {
    static int n;
    static int[][] graph;
    static boolean[][] visited;
    static Queue<Node2> queue = new LinkedList<Node2>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
//                System.out.println("map["+i+"]["+j+"]="+graph[i][j]);
            }
        }
        visited[0][0] = true;
        queue.add(new Node2(0, 0, graph[0][0]));
        bfs();
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            Node2 node = queue.poll();  // 첫 번째 값을 반환하고 제거
//            System.out.println("node="+node.getX()+","+node.getY()+","+node.getJump());
            int x = node.getX();
            int y = node.getY();
            int jump = node.getJump();
            // 아래로 갈 경우 범위 및 방문 여부 체크
            if (x + jump < n && !visited[x+jump][y]) {
                // 맨 오른쪽 아래로 갈 수 있을 경우 리턴
                if (graph[x+jump][y] == -1) {
                    System.out.println("HaruHaru");
                    return;
                }
                // 아닐 경우 아래로 이동할 인스턴스 정보 큐에 저장
                visited[x+jump][y] = true;
                queue.add(new Node2(x+jump, y, graph[x+jump][y]));
            }

            // 오른쪽으로 갈 경우 범위 및 방문 여부 체크
            if (y + jump < n && !visited[x][y+jump]) {
                // 맨 오른쪽 아래로 갈 수 있을 경우 리턴
                if (graph[x][y+jump] == -1) {
                    System.out.println("HaruHaru");
                    return;
                }
                // 아닐 경우 오른쪽으로 이동할 인스턴스 정보 큐에 저장
                visited[x][y+jump] = true;
                queue.add((new Node2(x, y+jump, graph[x][y+jump])));
            }
        }
        System.out.println("Hing");
    }
}

class Node2 {
    private int x;
    private int y;
    private int jump;

    public Node2(int x, int y, int jump) {
        this.x = x;
        this.y = y;
        this.jump = jump;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getJump() {
        return this.jump;
    }
}