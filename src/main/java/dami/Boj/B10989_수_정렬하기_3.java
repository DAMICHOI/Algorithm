package dami.Boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B10989_수_정렬하기_3 {
	public static void main(String[] args) throws IOException {
		/*
		// 메모리 초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		while (n-- > 0) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);
		for (int num : list) {
			System.out.println(num);
		}
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[10001];
		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < 10001; i++) {
			while (count[i] > 0) {
				sb.append(i).append('\n');
				count[i]--;
			}
		}

		System.out.println(sb);
	}
}
