package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class B17224_APC는_왜_서브태스크_대회가_되었을까 {
	static int n, l, k, sub1, sub2;
	static int score = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String array = br.readLine();
		n = Integer.parseInt(array.split(" ")[0]);
		l = Integer.parseInt(array.split(" ")[1]);
		k = Integer.parseInt(array.split(" ")[2]);

		for (int i = 0; i < n; i++) {
			array = br.readLine();
			sub1 = Integer.parseInt(array.split(" ")[0]);
			sub2 = Integer.parseInt(array.split(" ")[1]);
			list.add(makeScore(sub1, sub2));
		}

		list.sort(Comparator.reverseOrder());
		for (int j = 0; j < k; j++) {
			score += list.get(j);
		}

		bw.write(String.valueOf(score));
		bw.flush();
		bw.close();
	}

	private static int makeScore(int sub1, int sub2) {
		int result = 0;
		if (sub1 <= l) {
			result += 100;
		}
		if (sub2 <= l) {
			result += 40;
		}
		return result;
	}
}
