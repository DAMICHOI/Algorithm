package dami.Step.Step4;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*A+B - 4
* [문제]
* 두 정수와 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*
* [입력]
* 입력은 여러 개의 테스트 케이스로 이루어져 있다.
* 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0<A, B<10)
*
* [출력]
* 각 테스트 케이스마다 A+B를 출력한다.
* */
public class S2_B10951_APlusB {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        int A = 0, B = 0;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            sb.append(A+B).append("\n");
        }
        System.out.println(sb);

        /*
        Scanner s = new Scanner(System.in);
        int A=0, B=0;
        while (s.hasNextInt()) {
            A = s.nextInt();
            B = s.nextInt();
            System.out.println(A+B);
        }
        s.close();
        */
    }
}
