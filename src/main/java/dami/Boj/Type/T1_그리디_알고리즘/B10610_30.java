package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10610_30 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int[] arr = new int[n.length()];
		int arrTotalCount = 0;

		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.charAt(i) - '0';
			arrTotalCount += arr[i];
		}
		System.out.println(arrTotalCount);

		Arrays.sort(arr);
		if ((arrTotalCount % 3 == 0) && arr[0] == 0) {
			for (int i = n.length() - 1; i > -1; i--) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.println(-1);
		}
	}
}
