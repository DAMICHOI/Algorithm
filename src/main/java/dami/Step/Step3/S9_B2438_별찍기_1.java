package dami.Step.Step3;

import java.io.*;

public class S9_B2438_별찍기_1 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String star = "";

        for (int i=0; i<N; i++) {
            star += "*";
            bw.write(star+"\n");
        }
        bw.close();

        /*
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String result = "";

        for (int i=0; i<N; i++) {
            result += "*";
            System.out.println(result);
        }
         */
    }
}
