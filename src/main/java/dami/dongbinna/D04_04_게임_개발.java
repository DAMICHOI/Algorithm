package dami.dongbinna;

import java.io.*;
import java.util.StringTokenizer;

// 구현 문제
public class D04_04_게임_개발 {
    static int n, m, x, y, direction;
    // 북, 동, 남, 서
    static int[] dx = {-1, 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] graph;
    static int[][] visited;

    public static void main(String[] args) throws IOException{
        setMap();
        visited[x][y] = 1;
        int count = 1;
        int turnTime = 0;

        while (true) {
            turnLeft();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (visited[nx][ny] == 0 && graph[nx][ny] == 0) {
                visited[nx][ny] = 1;
                x = nx;
                y = ny;
                count++;
                turnTime = 0;
            } else {
                turnTime++;
            }

            if (turnTime == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];

                if (graph[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turnTime = 0;
            }
        }
        System.out.println(count);
    }

    public static void setMap() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new int[n][m];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int j=0;
            while (st.hasMoreTokens()) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }
    }

    public static int turnLeft() {
        direction--;
        if (direction == -1) {
            direction = 3;
        }

        return direction;
    }
}
