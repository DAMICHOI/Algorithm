package dami.Step.Step3;

import java.io.*;

public class S10_B2439_별찍기_2 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String space = "", star = "";
        for (int i=1; i<=N; i++) {
            for (int j=(N-i); j>0; j--) {
                space += " ";
            }
            star += "*";
            bw.write(space + star + "\n");
            space = "";
        }
        bw.close();
    }
}
