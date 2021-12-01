package dami.dongbinna;

import java.io.*;
import java.util.StringTokenizer;

// 구현 문제
public class D04_01_상하좌우 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = 1, y = 1;
        while (st.hasMoreTokens()) {
            String input = st.nextToken();

            if (input.equals("L") && x > 1) {
                x--;
            } else if (input.equals("R") && x < N) {
                x++;
            } else if (input.equals("U") && y > 1) {
                y--;
            } else if (input.equals("D") && y < N){
                y++;
            }
        }
        bw.write(y + " " + x);
        bw.close();
    }
}
