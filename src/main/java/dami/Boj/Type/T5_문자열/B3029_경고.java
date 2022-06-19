package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3029_경고 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nowTime = br.readLine();
		String throwTime = br.readLine();

		if (nowTime.equals(throwTime)) {
			System.out.println("24:00:00");
			return;
		}

		int h = Integer.parseInt(throwTime.split(":")[0]) - Integer.parseInt(nowTime.split(":")[0]);
		int m = Integer.parseInt(throwTime.split(":")[1]) - Integer.parseInt(nowTime.split(":")[1]);
		int s = Integer.parseInt(throwTime.split(":")[2]) - Integer.parseInt(nowTime.split(":")[2]);

		if (s < 0) {
			s += 60;
			--m;
		}

		if (m < 0) {
			m += 60;
			--h;
		}

		if (h < 0) {
			h += 24;
		}

		System.out.printf("%02d:%02d:%02d", h, m, s);
	}
}
