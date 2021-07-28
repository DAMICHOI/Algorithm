package dami.Step.Step2;

import java.util.Scanner;

public class S1_B1330_두_수_비교하기 {
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
