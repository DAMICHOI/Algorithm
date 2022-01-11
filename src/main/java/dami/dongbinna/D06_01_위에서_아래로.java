package dami.dongbinna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ch.qos.logback.core.util.SystemInfo;

/*
[문제]
하나의 수열에는 다양한 수가 존재한다. 이러한 수는 크기에 상관없이 나열되어 있다. 이 수를 큰 수부터 작은 수의 순서로 정렬해야 한다. 수열을 내림차순으로 정렬하는 프로그램으로 만드시오.

[입력 조건]
- 첫째 줄에 수열에 속해 있는 수의 개수 N이 주어진다. (1 <= N <= 500)
- 둘째 줄부터 N + 1번째 줄까지 N개의 수가 입력된다. 수의 범위는 1 이상 100,000 이하의 자연수이다.

[출력 조건]
- 입력으로 주어진 수열이 내림차순으로 정렬된 결과를 공백으로 구분하여 출력한다. 동일한 수의 순서는 자유롭게 출력해도 괜찮다.

[입력 예시]
3
15
27
12

[출력 예시]
27 15 12
*/
public class D06_01_위에서_아래로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> array = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(array, Collections.reverseOrder());

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	// 내가 푼 문제
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < n; i++) {
			int index = i;

			for (int j = i + 1; j < n; j++) {
				if (array[index] < array[j]) {
					int temp = array[index];
					array[index] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int x : array) {
			System.out.print(x + " ");
		}
	}*/
}
