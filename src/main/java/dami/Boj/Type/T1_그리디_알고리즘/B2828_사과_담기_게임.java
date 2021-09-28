package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.*;
import java.util.StringTokenizer;

public class B2828_사과_담기_게임 {
    static int n, m, j;
    static int distanceMinValue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        j = Integer.parseInt(br.readLine());

        int bucketStart = 0;
        int bucketEnd = m - 1;
        int current = 0;
        for (int i=0; i<j; i++) {
            int location = Integer.parseInt(br.readLine()) -1;

            if (location >= bucketStart && location <= bucketEnd) {
                continue;
            }

            if (location < bucketStart) {
                current = location - bucketStart;
            } else if (location > bucketEnd) {
                current = location - bucketEnd;
            }

            bucketStart += current;
            bucketEnd += current;
            distanceMinValue += Math.abs(current);
        }

        bw.write(String.valueOf(distanceMinValue));
        bw.flush();
        bw.close();
    }
}
