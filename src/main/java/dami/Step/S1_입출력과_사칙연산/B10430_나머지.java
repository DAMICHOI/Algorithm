package dami.Step.S1_입출력과_사칙연산;

import java.util.Scanner;

public class B10430_나머지 {
    /*
    * 10430. 나머지
    * [문제]
    * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
    * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
    * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
    *
    * [입력]
    * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
    *
    * [출력]
    * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
    * */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
