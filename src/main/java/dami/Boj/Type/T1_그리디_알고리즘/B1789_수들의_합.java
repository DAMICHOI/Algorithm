package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.*;

public class B1789_수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long s = Long.parseLong(br.readLine());
        long sum = 1;
        long number = 1;

        while (sum<s) {
            number++;
            sum += number;
        }

        if (sum>s) {
            number--;
        }

        bw.write(String.valueOf(number));
        bw.flush();
        bw.close();
    }
}
