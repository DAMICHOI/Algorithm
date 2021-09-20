package dami.dongbinna;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
[문제]
N * M 크기의 얼음 틀이 있다. 구멍이 뚫려 있는 부분은 0, 칸막이가 존재하는 부분은 1로 표시된다. 구멍이 뚫려 있는 부분끼리 상, 하, 좌, 우로 붙어 있는 경우 서로 연결되어 있는 것으로 간주한다. 이떄 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수를 구하는 프로그램을 작성하시오. 다음의 4*5 얼음 틀 예시에서는 아이스크림이 총 3개 생성된다.

00110
00011
11111
00000

[입력 조건]
- 첫 번째 줄에 얼음 틀의 세로 길이 N과 가로 길이 M이 주어진다. (1 <= N, M <= 1,000)
- 두 번째 줄부터 N+1 번째 줄까지 얼음 틀의 형태가 주어진다.
- 이때 구멍이 뚫려 있는 부분은 0, 그렇지 않은 부분은 1이다.

[출력 조건]
- 한 번에 만들 수 있는 아이스크림의 개수를 출력한다.
*/
public class D05_01_음료수_열려_먹기 {
    private static int n;
    private static int m;
    private static int graph[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        int result = 0;

        // 2차원 배열에 정보 입력 받기
        for (int i=0; i<n; i++) {
            String[] arr = br.readLine().split("");
            for (int j=0; j<m; j++) {
                graph[i][j] = Integer.parseInt(arr[j]);
            }
        }

        // 모든 노드(위치)에 대하여 음료수 채우기
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (dfs(i, j) == true) {
                    result++;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }

        // 현재 노드를 아직 방문하지 않았다면,
        if (graph[x][y] == 0) {
            graph[x][y] = 1; // 해당 노드 방문 처리
            // 상,하,좌,우의 위치도 모두 재귀적으로 호출
            dfs(x-1, y);    // 상
            dfs(x+1, y);    // 하
            dfs(x,y-1);     // 좌
            dfs(x, y+1);    // 우
            return true;
        }
        return false;
    }
}
