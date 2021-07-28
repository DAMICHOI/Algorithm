package dami.Step.Step3;

import java.io.*;
import java.util.StringTokenizer;

public class S7_B11021_APlusB {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int t = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=1; i<=t; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken());
            bw.write("Case #"+i+": "+ sum + "\n");
        }

        bw.close();
    }
}
