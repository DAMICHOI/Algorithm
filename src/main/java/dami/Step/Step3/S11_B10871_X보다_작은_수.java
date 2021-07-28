package dami.Step.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class S11_B10871_X보다_작은_수 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N, X, A;

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        X = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            A = Integer.parseInt(stringTokenizer.nextToken());

            if (X > A) {
                bw.write(A + " ");
            }

        }

        bw.close();
    }
}
