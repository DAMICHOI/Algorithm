package dami.dongbinna;

import java.io.*;

public class D03_01_거스름돈 {
    /*
     * 거스름돈
     * [문제]
     * 당신은 음식점의 계산을 도와주는 점원이다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원 짜리의 동전이 무한히 존재한다고 가정한다. 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러줘야 할 동전의 최소 개수를 구하라. 단, 거슬러 줘야할 돈 N은 항상 10의 배수이다.
     *
     * [입력]
     * 첫째 줄에 N(10의 배수)이 주어진다.
     *
     * [출력]
     * 첫째 줄에 거슬러 줘야할 돈의 최소 개수 C를 출력한다.
     *
     * [입력 예]
     * 1260
     * */
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] coinType = {500, 100, 50, 10};
        int count = 0;

//        System.out.println("처음 받은 금액 : " + N + " 원");
        for (int coin : coinType) {
            count += (N/coin);
            N %= coin;
//            System.out.println(coin + "원 "+ count + " 개를 사용하고 남은 차액 : " + N + " 원");
        }

//        System.out.println("거스름돈의 최소 개수는 " + count + "개 입니다.");
        bw.write(String.valueOf(count));
        bw.close();
    }
}
