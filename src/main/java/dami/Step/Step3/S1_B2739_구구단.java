package dami.Step.Step3;

import java.util.Scanner;

public class S1_B2739_구구단 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1; i<=9; i++) {
           System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
