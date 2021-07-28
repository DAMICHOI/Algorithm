package dami.Step.Step3;

import java.io.*;

public class S5_B2741_N_찍기 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            bw.write(i+"\n");
        }

        bw.close();
    }

}
