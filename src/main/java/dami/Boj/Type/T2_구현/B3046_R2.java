package dami.Boj.Type.T2_구현;

import java.io.*;
import java.util.StringTokenizer;

public class B3046_R2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        /*s = (r1+r2)/2;
        r1+r2 = 2s;
        r2 = 2s-r1;*/
        int r2 = (s * 2) - r1;

        bw.write(String.valueOf(r2));
        bw.flush();
        bw.close();
    }
}
