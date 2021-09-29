package dami.dongbinna;

import java.io.*;

// 구현 문제
public class D04_02_시각 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<(N+1) ; i++) {
            for (int j=0; j<60; j++) {
                for (int k=0; k<60; k++) {
                    String str = i + " " + j + " " + k;
                    if (str.indexOf("3") > -1) {
                        count++;
                        System.out.println(str + " / " + str.indexOf("3"));
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
