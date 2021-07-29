package dami.Step.S2_if문;

import java.util.Scanner;

public class B1330_두_수_비교하기 {
    /*
    * 두 수 비교하기
    * [문제]
    * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
    *
    * [출력]
    * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
    * A가 B보다 큰 경우에는 '>'를 출력한다.
    * A가 B보다 작은 경우에는 '<'를 출력한다.
    * A와 B가 같은 경우에는 '=='를 출력한다.
    *
    * [제한]
    * -10,000 ≤ A, B ≤ 10,000
    * */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String result = "";

        if (A == B) {
            result = "==";
        } else if (A > B) {
            result = ">";
        } else if (A < B) {
            result = "<";
        }

        System.out.println(result);

    }
}
