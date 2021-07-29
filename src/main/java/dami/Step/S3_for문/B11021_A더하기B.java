package dami.Step.S3_for문;

import java.io.*;
import java.util.StringTokenizer;

public class B11021_A더하기B {
    /*
    * A+B
    * [문제]
    * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    *
    * [출력]
    * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
    * */
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;
        int t = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=1; i<=t; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken());
            bw.write("Case #"+i+": "+ sum + "\n");
        }

        bw.close();
    }
}
