package dami.dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D07_Ex02_재귀_함수로_구현한_이진_탐색 {
	public static void main(String[] args) throws IOException {
		D07_Ex02_재귀_함수로_구현한_이진_탐색 solution = new D07_Ex02_재귀_함수로_구현한_이진_탐색();
		System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());    // 원소의 개수
		int target = Integer.parseInt(st.nextToken());    // 찾고자 하는 문자열

		System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[n];    // 전체 원소
		int i = 0;
		while (st.hasMoreTokens()) {
			array[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		int result = binarySearch(array, target, 0, n - 1);

		if (result == 0) {
			System.out.println("원소가 존재하지 않습니다.");
		} else {
			System.out.println(result + 1);
		}
	}

	private static int binarySearch(int[] array, int target, int start, int end) {
		if (start > end) {
			return 0;
		}

		int mid = (start + end) / 2;

		if (array[mid] == target) {
			return mid;
		} else if (array[mid] > target) {
			return binarySearch(array, target, start, mid - 1);
		} else {
			return binarySearch(array, target, mid + 1, end);
		}
	}
}
