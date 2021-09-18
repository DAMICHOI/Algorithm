package dami.Boj.Type.T2_구현;

import java.io.*;
import java.util.StringTokenizer;

public class B2914_저작권 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int countA = Integer.parseInt(st.nextToken());
        int average = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(countA * (average-1) + 1));
        bw.flush();
        bw.close();
    }
}
