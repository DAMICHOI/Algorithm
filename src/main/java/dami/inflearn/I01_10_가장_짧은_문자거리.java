package dami.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class I01_10_가장_짧은_문자거리 {
    /*
    * 10. 가장 짧은 문자거리
    *
    * 설명
    * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소 거리를 출력하는 프로그램을 작성하세요.
    *
    * 입력
    * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    * 문자열의 길이는 100을 넘지 않는다.
    *
    * 출력
    * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
    *
    * 예시 입력 1
    * teachermode e
    *
    * 예시 출력 1
    * 1 0 1 2 1 0 1 2 2 1 0
    * */
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        String str = st.nextToken();
        char target = st.nextToken().charAt(0);

        int[] distance = getDistance(str, target);
        for (int i : distance) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

    public static int[] getDistance (String str, char target) {
        int[] distance = new int[str.length()];
        int count = 1000;   // 문자열의 길이보다 크게 넣기

        // 왼쪽 먼저 탐색
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == target) {
                count = 0;
                distance[i] = count;
            } else {
                count ++;
                distance[i] = count;
            }
        }

        // 반대로 오른쪽부터 탐색
        count = 1000;   // count 초기화
        for (int j=str.length()-1; j>=0; j--) {
            if (str.charAt(j) == target) {
                count = 0;
            } else {
                count++;
                distance[j] = Math.min(distance[j], count); // 기존에 들어간 값보다 작은 값으로 교체체
           }
        }

        return distance;
    }
}
