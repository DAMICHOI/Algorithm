package dami.Boj.Type.T2_구현;

import java.io.*;
import java.util.StringTokenizer;

public class B2475_검증수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int number = 0;

        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            number += i * i;
        }
        number %= 10;

        bw.write(String.valueOf(number));
        bw.flush();
        bw.close();
    }
}
