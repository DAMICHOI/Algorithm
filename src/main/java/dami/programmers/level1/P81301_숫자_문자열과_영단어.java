package dami.programmers.level1;

import java.util.HashMap;

public class P81301_숫자_문자열과_영단어 {
	public static void main(String[] args) {
		P81301_숫자_문자열과_영단어 p = new P81301_숫자_문자열과_영단어();
		System.out.println(p.solution("one4seveneight"));
		System.out.println(p.solution("23four5six7"));
		System.out.println(p.solution("2three45sixseven"));
		System.out.println(p.solution("123"));
	}

	private int solution(String s) {
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < word.length; i++) {
			s = s.replaceAll(word[i], number[i]);
		}

		return Integer.parseInt(s);
	}
}
