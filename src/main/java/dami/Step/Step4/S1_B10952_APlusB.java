package dami.Step.Step4;

import java.io.*;
import java.util.StringTokenizer;

public class S1_B10952_APlusB {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int A, B;

        while (true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            sb.append(A+B).append("\n");
        }

        System.out.println(sb);
    }
}
