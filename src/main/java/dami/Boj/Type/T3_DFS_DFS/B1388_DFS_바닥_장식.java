package dami.Boj.Type.T3_DFS_DFS;

import java.io.*;
import java.util.StringTokenizer;

public class B1388_DFS_바닥_장식 {
    public static int n, m, count;
    public static char[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());   // 세로
        m = Integer.parseInt(st.nextToken());   // 가로
        graph = new char[n][m];
        count = 0;

        for (int i=0; i<n; i++) {
            graph[i] = br.readLine().toCharArray();
            for (int j=0; j<m; j++) {
                if (graph[i][j] == '-') {
                    count++;
                    while (j < m && graph[i][j] == '-') {
                        j++;
                    }
                }
            }
        }

        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {
                if (graph[i][j] == '|') {
                    count++;
                    while (i < n && graph[i][j] == '|') {
                        i++;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
