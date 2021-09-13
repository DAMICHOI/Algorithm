package dami.dongbinna;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
숫자 카드 게임
[문제]
숫자 카드 게임은 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한장을 뽑는 게임이다.
단, 게임의 룰을 지키며 카드를 뽑아야 하고 룰은 다음과 같다.

1. 숫자가 쓰인 카드들이 N X M 형태로 놓여 있다. 이 때 N은 행의 개수를 의미하며, M은 열의 개수를 의미한다.
2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
3. 그 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.

예를 들어 3 X 3 형태로 카드들이 다음과 같이 놓여 있다고 가정하자.

여기서 카드를 골라낼 행을 고를 때 첫 번째 혹은 두 번째 행을 선택하는 경우, 최종적으로 뽑는 카드는 1이다. 하지만 세 번째 행을 선택하는 경우 최종적으로 뽑는 카드는 2이다. 따라서 이 예제에서는 세 번째 행을 선택하여 숫자 2가 쓰여진 카드를 뽑는 것이 정답이다.
카드들이 N X M 형태로 놓여 있을 때, 게임의 룰에 맞게 카드를 뽑는 프로그램을 만드시오.

[입력 조건]
- 첫째 줄에 숫자 카드들이 놓인 행의 개수 N과 열의 개수 M이 공백을 기준으로 하여 각각 자연수로 주어진다. (1 <= N, M <= 100)
- 둘째 줄부터 N개의 줄에 걸쳐 각 카드에 적힌 숫자가 주어진다. 각 숫자는 1 이상 10,000 이하의 자연수이다.

[출력 조건]
- 첫째 줄에 게임의 룰에 맞게 선택한 카드에 적힌 숫자를 출력한다.

[입력 예시 1]
3 3
3 1 2
4 1 4
2 2 2

[출력 예시 1]
2

[입력 예시 2]
2 4
7 3 1 8
3 3 3 4

* [출력 예시 2]
3
*/
public class D03_03_숫자_카드_게임 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            String[] num = st.nextToken().toString().split(" ");
            for (int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(num[j]);
            }
        }

        int[] minNum = compareMinValue(arr);
        int maxNum = compareMaxValue(minNum);

        bw.write(String.valueOf(maxNum));
        bw.close();
    }

    static int[] compareMinValue (int[][] array) {
        int[] result = new int[array.length];

        for (int i=0; i<array.length; i++) {
            Arrays.sort(array[i]);
            result[i] = array[i][0];
        }
        return result;
    }

    static int compareMaxValue (int[] array) {
        int result = 0;

        Arrays.sort(array);
        result = array[array.length-1];

        return result;
    }
}
