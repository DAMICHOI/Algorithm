package dami.Boj.Step.S8_기본_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292_벌집 {
    /*
     * 2292. 벌집
     * [문제]
     * 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
     *
     * [입력]
     * 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
     *
     * [출력]
     * 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
     *
     * [예제 입력 1]
     * 13
     *
     * [예제 출력 1]
     * 3
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 번호(N) - 벌집 개수 - 최소루트의 방 방문수
        // 1 - 1 - 1
        // 2~7 - 6 - 2
        // 8~19 - 12 - 3
        // 20~37 - 18 - 4
        // 38~61 - 24  - 5
        int N = Integer.parseInt(br.readLine());

        int count = 1; // 최소 루트
        int range = 2; // 최소 방문 수

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range += (6*count);
                count++;
            }
            System.out.print(count);
        }
    }
}
