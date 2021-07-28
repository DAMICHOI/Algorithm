package dami.Step.Step1;

import java.util.Scanner;

public class S11_B2588_곱셈 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        String convertString = second + "";
        String arr[] = convertString.split("");

        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(first * Integer.parseInt(arr[i]));
        }

        System.out.println(first * second);
    }
}