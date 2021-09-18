package dami.Boj.Type.T2_구현;

import java.io.*;

public class B2558_A더하기B_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(A + B));
        bw.flush();
        bw.close();
    }
}
