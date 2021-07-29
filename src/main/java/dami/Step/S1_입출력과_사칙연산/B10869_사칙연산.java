package dami.Step.S1_입출력과_사칙연산;

import java.util.Scanner;

public class B10869_사칙연산 {
    /*
    * 10869. 사칙연산
    * [문제]
    * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
    *
    * [입력]
    * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
    *
    * [출력]
    * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
    * */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println((int) first / second);
        System.out.println(first % second);
    }
}
