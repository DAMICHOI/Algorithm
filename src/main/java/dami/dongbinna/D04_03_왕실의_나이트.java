package dami.dongbinna;

import java.io.*;

// 구현 문제
public class D04_03_왕실의_나이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] moves = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {1, 2}, {2, 1}, {-1, 2}, {-2, 1}};
        String[] input = br.readLine().split("");
        int row = Integer.parseInt(input[1]);
        int column = input[0].charAt(0) - 'a' + 1;
        int result = 0;

        for (int[] move : moves) {
            int next_row = row + move[0];
            int next_column = column + move[1];

            if (next_row >= 1 && next_row <= 8 && next_column >= 1 && next_column <= 8) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
