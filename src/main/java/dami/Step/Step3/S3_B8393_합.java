package dami.Step.Step3;

import java.util.Scanner;

public class S3_B8393_합 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
