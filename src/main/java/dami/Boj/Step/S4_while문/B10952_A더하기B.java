package dami.Boj.Step.S4_while문;

import java.io.*;
import java.util.StringTokenizer;

public class B10952_A더하기B {
    /*
    * A+B
    * [문제]
    * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    *
    * [입력]
    * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
    * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    * 입력의 마지막에는 0 두 개가 들어온다.
    *
    * [출력]
    * 각 테스트 케이스마다 A+B를 출력한다.
    * */
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int A, B;

        while (true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            sb.append(A+B).append("\n");
        }

        System.out.println(sb);
    }
}
