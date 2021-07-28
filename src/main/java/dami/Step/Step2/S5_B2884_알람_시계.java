package dami.Step.Step2;

import java.util.Scanner;

public class S5_B2884_알람_시계 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        M -= 45;

        if (M < 0) {
            H -= 1;
            M += 60;
        }

        if (H < 0) {
            H += 24;
        }

        System.out.println(H);
        System.out.println(M);
    }
}
