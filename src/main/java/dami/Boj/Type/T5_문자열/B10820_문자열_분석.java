package dami.Boj.Type.T5_문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10820_문자열_분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int upperCount = 0, lowerCount = 0, numCount = 0, spaceCount = 0;
		while ((str = br.readLine()) != null) {
			upperCount = 0;
			lowerCount = 0;
			numCount = 0;
			spaceCount = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					spaceCount++;
				} else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
					numCount++;
				} else if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
					upperCount++;
				} else {
					lowerCount++;
				}
			}
			System.out.println(lowerCount + " " + upperCount + " " + numCount + " " + spaceCount);
		}
		br.close();
	}
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int upperCount = 0, lowerCount = 0, numCount = 0, spaceCount = 0;
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) - 0 == 32) {
					spaceCount++;
				} else if (str.charAt(i) - 0 >= 48 && str.charAt(i) - 0 <= 57) {
					numCount++;
				} else if (str.charAt(i) - 0 >= 97 && str.charAt(i) - 0 <= 122) {
					lowerCount++;
				} else if (str.charAt(i) - 0 >= 65 && str.charAt(i) - 0 <= 90) {
					upperCount++;
				}
			}
			System.out.println(lowerCount + " " + upperCount + " " + numCount + " " + spaceCount);
			upperCount = 0;
			lowerCount = 0;
			numCount = 0;
			spaceCount = 0;
		}

		br.close();
	}*/
}
