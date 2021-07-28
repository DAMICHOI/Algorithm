package dami.Step.Step2;

import java.util.Scanner;

public class S4_B14681_사분면_고르기 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int quadrant = 0;

        if (x>0 && y>0) {
            quadrant = 1;
        } else if (x<0 && y>0) {
            quadrant = 2;
        } else if (x<0 && y<0) {
            quadrant = 3;
        } else {
            quadrant = 4;
        }

        System.out.println(quadrant);
    }
}
