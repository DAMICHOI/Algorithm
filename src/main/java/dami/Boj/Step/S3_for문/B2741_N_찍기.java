package dami.Boj.Step.S3_for문;

import java.io.*;

public class B2741_N_찍기 {
    /*
    * N 찍기
    * [문제]
    * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
    *
    * [출력]
    * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
    * */
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++) {
            bw.write(i+"\n");
        }

        bw.close();
    }

}
