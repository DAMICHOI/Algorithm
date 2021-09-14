package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.*;

/*
11034. 캥거루 세마리2
[문제]
캥거루 세 마리가 사막에서 놀고 있다. 사막에는 수직선이 하나 있고, 캥거루는 서로 다른 한 좌표 위에 있다.
한 번 움직일 때, 바깥쪽의 두 캥거루 중 한 마리가 다른 두 캥거루 사이의 정수 좌표로 점프한다. 한 좌표 위에 있는 캥거루가 두 마리 이상일 수는 없다.
캥거루는 최대 몇 번 움직일 수 있을까?

[입력]
여러개의 테스트 케이스로 이루어져 있으며, 세 캥거루의 초기 위치 A, B, C가 주어진다. (0 < A < B < C < 100)

[출력]
각 테스트에 대해 캥거루가 최대 몇 번 움직일 수 있는지 출력한다.

[예제 입력 1]
2 3 5
3 5 9

[예제 출력 1]
1
3
*/
public class B11034_캥거루_세마리2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = br.readLine()) != null) {
            int A = Integer.parseInt(str.split(" ")[0]);
            int B = Integer.parseInt(str.split(" ")[1]);
            int C = Integer.parseInt(str.split(" ")[2]);
            System.out.println(maxMoveCount(A, B, C));
        }
    }

    public static int maxMoveCount(int A, int B, int C) {
        int maxMove = 0;

        if ((B-A-1) > (C-B-1)) {
            maxMove = B-A-1;
        } else {
            maxMove = C-B-1;
        }

        return maxMove;
    }
}
