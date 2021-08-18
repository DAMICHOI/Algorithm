package dami.Step.S7_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157_단어_공부 {
    /*
     * 1157. 단어 공부
     * [문제]
     * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
     *
     * [입력]
     * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
     *
     * [출력]
     * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
     *
     * [예제 입력 1]
     * Mississipi
     *
     * [예제 출력 1]
     * ?
     *
     * [예제 입력 2]
     * zZa
     *
     * [예제 출력 2]
     * Z
     *
     * [예제 입력 3]
     * z
     *
     * [예제 출력 3]
     * Z
     *
     * [예제 입력 4]
     * baaa
     *
     * [예제 출력 4]
     * A
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alphabet = br.readLine();

        System.out.println(print(alphabet.toUpperCase()));
    }

    public static char print(String alphabet) {
        char result = '?';
        int[] arr = new int[26];
        int max = -1;

        for (int i=0; i<alphabet.length(); i++) {
            if (65 <= alphabet.charAt(i) && alphabet.charAt(i) <= 90) {
                arr[alphabet.charAt(i) - 65]++;
            }
        }

        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char)(i+'A');
            } else if (arr[i] == max) {
                result = '?';
            }
        }

        return result;
    }
}
