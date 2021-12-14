package dami.Boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B2751_수_정렬하기2 {
	public static void main(String[] args) throws IOException {
		// 시간 초과
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(array);
		for (int number : array) {
			System.out.println(number);
		}*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);

		for (int number : list) {
			sb.append(number).append('\n');
		}
		System.out.println(sb);
	}
}
