package dami.Boj.Step.S5_1차원_배열;

import java.io.*;
import java.util.StringTokenizer;

public class B10818_최소_최대 {
    /*
    * 10818. 최소, 최대
    * [문제]
    * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
    *
    * [출력]
    * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
    *
    * [예제 입력 1]
    * 5
    * 20 10 35 30 7
    *
    * [예제 출력 1]
    * 7 35
    * */

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while (str.hasMoreTokens()) {
            int val = Integer.parseInt(str.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }

        System.out.println(min + " " + max);
    }
}
