package dami.Step.Step2;

import java.util.Scanner;

public class S2_B9498_시험_성적 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = "";

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}
