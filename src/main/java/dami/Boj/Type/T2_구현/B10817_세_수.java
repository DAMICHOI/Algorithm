package dami.Boj.Type.T2_구현;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10817_세_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numberArr = new int[st.countTokens()];
        int i =0;
        while (st.hasMoreTokens()) {
            numberArr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(numberArr);

        bw.write(String.valueOf(numberArr[1]));
        bw.flush();
        bw.close();
    }
}
