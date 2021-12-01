package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15881_Pen_Pineapple_Apple_Pen {
	static int n, count;
	static char[] thing;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		thing = br.readLine().toCharArray();
		count = 0;

		for (int i = 0; i < n - 3; i++) {
			if (thing[i] == 'p' && thing[i + 1] == 'P' && thing[i + 2] == 'A' && thing[i + 3] == 'p') {
				count++;
				i += 3;
			}
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
