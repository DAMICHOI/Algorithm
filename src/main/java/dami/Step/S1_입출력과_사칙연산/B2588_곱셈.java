package dami.Step.S1_입출력과_사칙연산;

import java.util.Scanner;

public class B2588_곱셈 {
    /*
    * 2588. 곱셈
    * [문제]
    * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
    * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
    *
    *           4 7 2 . . . . . . (1)
    *         X 3 8 5 . . . . . . (2)
    * ---------------
    *         2 3 6 0 . . . . . . (3)
    *       3 7 7 6   . . . . . . (4)
    *     1 4 1 6     . . . . . . (5)
    * ---------------
    *     1 8 1 7 2 0 . . . . . . (6)
    *
    * [입력]
    * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
    *
    * [출력]
    * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
    * */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        String convertString = second + "";
        String arr[] = convertString.split("");

        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(first * Integer.parseInt(arr[i]));
        }

        System.out.println(first * second);
    }
}