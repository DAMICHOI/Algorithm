package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14720_우유_축제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int milkCount = 0;
		int nextMilkType = 0;
		while (st.hasMoreTokens()) {
			int milk = Integer.parseInt(st.nextToken());

			if (milk == nextMilkType && nextMilkType == 0) {
				milkCount++;
				nextMilkType = 1;
				continue;
			}

			if (milk == nextMilkType && nextMilkType == 1) {
				milkCount++;
				nextMilkType = 2;
				continue;
			}
			if (milk == nextMilkType && nextMilkType == 2) {
				milkCount++;
				nextMilkType = 0;
				continue;
			}
		}

		System.out.println(milkCount);
	}
}
