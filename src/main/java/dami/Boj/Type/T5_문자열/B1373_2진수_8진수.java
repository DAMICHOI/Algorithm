package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1373_2진수_8진수 {
	// 메모리: 21684KB, 시간: 324ms , 코드길이: 812B
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String binary = br.readLine();
		int temp = 0, remain = binary.length() % 3;
		StringBuilder sb = new StringBuilder();

		if (remain == 1) {
			sb.append(binary.charAt(0) - '0');
		} else if (remain == 2) {
			temp += (binary.charAt(0) - '0') * 2;
			temp += binary.charAt(1) - '0';
			sb.append(temp);
		}

		for (int i = remain; i < binary.length(); i += 3) {
			temp = 0;
			temp += (binary.charAt(i) - '0') * 4;
			temp += (binary.charAt(i + 1) - '0') * 2;
			temp += (binary.charAt(i + 2) - '0');

			sb.append(temp);
		}

		System.out.println(sb);
	}*/

	// 메모리: 21684KB, 시간: 2120ms , 코드길이: 352B
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(new BigInteger(br.readLine(),2).toString(8));
	}*/

	// 메모리: 23596KB, 시간: 312ms , 코드길이: 583B
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int len;

		for (len = str.length(); len % 3 > 0; len++) {
			str = "0" + str;
		}

		for (int i = 0; i < len; i += 3) {
			sb.append((str.charAt(i) - '0') * 4 + (str.charAt(i + 1) - '0') * 2 + (str.charAt(i + 2) - '0'));
		}

		System.out.println(sb);
	}
}
