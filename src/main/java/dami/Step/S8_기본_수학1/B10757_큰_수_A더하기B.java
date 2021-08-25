package dami.Step.S8_기본_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B10757_큰_수_A더하기B {
    /*
     * 10757. 큰 수 A+B
     * [문제]
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     *
     * [입력]
     * 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
     *
     * [출력]
     * 첫째 줄에 A+B를 출력한다.
     *
     * [예제 입력 1]
     * 9223372036854775807 9223372036854775808
     *
     * [예제 출력 1]
     * 18446744073709551615
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        /*
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        a = a.add(b);
        System.out.println(a.toString());
        */

        String strA = st.nextToken();
        String strB = st.nextToken();
        int maxLen = Math.max(strA.length(), strB.length());

        int[] a = new int[maxLen+1];
        int[] b = new int[maxLen+1];

        for (int i=strA.length()-1, index=0; i>=0; i--, index++ ) {
            a[index] = strA.charAt(i) - '0';
        }

        for (int i=strB.length()-1, index=0; i>=0; i--, index++) {
            b[index] = strB.charAt(i) - '0';
        }

        for (int i=0; i<maxLen; i++) {
            int value = a[i] + b[i];
            a[i] = value % 10;
            a[i+1] += (value / 10);
        }

        StringBuilder sb = new StringBuilder();
        if (a[maxLen] != 0) {
            sb.append(a[maxLen]);
        }

        for (int i=maxLen-1; i>=0; i--) {
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
