package dami.Boj.Step.S1_입출력과_사칙연산;

import java.util.Scanner;

public class B1001_A빼기B {
    /*
    * 1001. A-B
    * [문제]
    * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    *
    * [출력]
    * 첫째 줄에 A-B를 출력한다.
    * */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(first - second);
    }
}
