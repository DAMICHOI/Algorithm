package dami.Step.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class S8_B11022_APlusB {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int T = Integer.parseInt(br.readLine());
        int A,B,C;

        for (int i=1; i<=T; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            A = Integer.parseInt(stringTokenizer.nextToken());
            B = Integer.parseInt(stringTokenizer.nextToken());
            C = A + B;

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + C + "\n");
        }
        bw.close();
    }
}
