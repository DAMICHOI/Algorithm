package dami.Boj.Type.T2_구현;

import java.io.*;

public class B1550_16진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hexaToDecimal = Integer.parseInt(br.readLine(), 16);

        bw.write(String.valueOf(hexaToDecimal));
        bw.flush();
        bw.close();
    }
}
