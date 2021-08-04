package dami.inflearn;

import java.util.Scanner;

public class I01_05_특정_문자_뒤집기 {
    /*
    * 5. 특정 문자 뒤집기
    *
    * 설명
    * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
    * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
    *
    * 입력
    * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
    *
    * 출력
    * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
    *
    * 예시 입력 1
    * a#b!GE*T@S
    *
    * 예시 출력 1
    * S#T!EG*b@a
    * */
    public static void main (String[] args) {
        I01_05_특정_문자_뒤집기 main = new I01_05_특정_문자_뒤집기();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(main.reverseWord(input));
    }

    /*
     * if (lt == 특수문자) lt++;
     * else if (rt == 특수문자) rt--;
     * else lt-rt 교환;
     * */
    public String reverseWord(String word) {
        String result = "";
        char[] s = word.toCharArray();
        int lt = 0, rt = word.length()-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        result = String.valueOf(s);
        return result;
    }
}
