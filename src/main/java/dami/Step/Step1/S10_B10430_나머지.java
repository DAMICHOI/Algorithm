package dami.Step.Step1;

import java.util.Scanner;

public class S10_B10430_나머지 {
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
