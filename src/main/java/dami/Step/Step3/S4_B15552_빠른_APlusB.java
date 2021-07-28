package dami.Step.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class S4_B15552_빠른_APlusB {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            bw.write(Integer.parseInt(stringTokenizer.nextToken())+Integer.parseInt(stringTokenizer.nextToken())+"\n");
        }

        bw.close();
    }
}
