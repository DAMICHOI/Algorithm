package dami.Step.Step1;

import java.util.Scanner;

public class S9_B10869_사칙연산 {
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
