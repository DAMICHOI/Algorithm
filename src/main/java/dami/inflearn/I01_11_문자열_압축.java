package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I01_11_문자열_압축 {
    /*
    * 11. 문자열 압축
    *
    * 설명
    * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오. 단 반복횟수가 1인 경우 생략합니다.
    *
    * 입력
    * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
    *
    * 출력
    * 첫 줄에 압축된 문자열을 출력한다.
    *
    * 예시 입력 1
    * KKHSSSSSSSE
    *
    * 예시 출력 1
    * K2HS7E
     * */
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(stringZip(s));
    }

    public static String stringZip (String s) {
        String result = "";
        s = s + " "; // 마지막 문자열을 비교하기 위해서 빈 문자 추가
        int count = 1;

        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                result += s.charAt(i);
                if (count > 1)
                    result += String.valueOf(count);
                count = 1;
            }
        }

        return result;
    }
}
