package dami.Boj.Type;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		// Collections.sort / reverse
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] arr = br.readLine().split("");

		List<Integer> list = new ArrayList<>();
		for (String str : arr) {
			list.add(Integer.parseInt(str));
		}

		Collections.sort(list);
		Collections.reverse(list);

		for (int a : list) {
			sb.append(a);
		}

		System.out.println(Integer.parseInt(sb.toString()));*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
