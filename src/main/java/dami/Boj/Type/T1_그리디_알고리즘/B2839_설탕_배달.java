package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.*;

public class B2839_설탕_배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sugarWeight = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(bagMinCount(sugarWeight)));
        bw.flush();
        bw.close();
    }

    public static int bagMinCount(int weight) {
        int minCount = 0;

        while (true) {
            if (weight % 5 == 0) {
                minCount += weight / 5;
                break;
            } else {
                weight -= 3;
                minCount++;
            }

            if (weight < 0) {
                minCount = -1;
                break;
            }
        }

        return minCount;
    }
}
