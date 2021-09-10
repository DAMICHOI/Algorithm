package dami.Boj.Step.S3_for문;

import java.io.*;

public class B2438_별찍기 {
    /*
    * 별 찍기
    * [문제]
    * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    *
    * [입력]
    * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
    *
    * [출력]
    * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
    * */
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
