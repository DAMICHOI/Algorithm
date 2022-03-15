package dami.dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D07_Ex01_순차_탐색 {
	public static void main(String[] args) throws IOException {
		D07_Ex01_순차_탐색 solution = new D07_Ex01_순차_탐색();
		System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());	// 원소의 개수
		String target = st.nextToken();	// 찾고자 하는 문자열

		System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		String[] array = new String[n];
		int i = 0;
		while (st.hasMoreTokens()) {
			array[i] = st.nextToken();
			i++;
		}

		// 순차 탐색 수행 결과 출력
		System.out.println(solution.sequentialSearch(n, target, array));

		br.close();
	}

	private int sequentialSearch(int n, String target, String[] array) {
		for (int i = 0; i < n; i++) {		// 각 원소를 하나씩 확인하며
			if (array[i].equals(target)) {	// 현재의 원소가 찾고자 하는 원소와 동일한 경우
				return i + 1;	// 현재의 위치 반환 (인덱스는 0부터 시작하므로 1 더하기)
			}
		}
		return 0;
	}
}
