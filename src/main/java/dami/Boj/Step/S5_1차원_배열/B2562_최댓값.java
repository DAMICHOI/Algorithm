package dami.Boj.Step.S5_1차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562_최댓값 {
    /*
    * 2562. 최댓값
    * [문제]
    * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    * 예를 들어, 서로 다른 9개의 자연수
    * 3, 29, 38, 12, 57, 74, 40, 85, 61
    * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
    *
    * [입력]
    * 첫째 줄부터 아홉 번째줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.
    *
    * [출력]
    * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
    *
    * [예제 입력 1]
    * 3
    * 29
    * 38
    * 12
    * 57
    * 74
    * 40
    * 85
    * 61
    *
    * [예제 출력 1]
    * 85
    * 8
    * */

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max = 0, index = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int j=0; j<arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }

        System.out.println(max + "\n" + (index + 1));
    }

}
