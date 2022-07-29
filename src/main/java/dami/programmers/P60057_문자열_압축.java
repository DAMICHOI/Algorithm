package dami.programmers;

public class P60057_문자열_압축 {
	public static void main(String[] args) {
		P60057_문자열_압축 solution = new P60057_문자열_압축();
		System.out.println(solution.solution("aabbaccc"));    // result: 7
		System.out.println(solution.solution("ababcdcdababcdcd"));    // result: 9
		System.out.println(solution.solution("abcabcdede"));    // result: 8
		System.out.println(solution.solution("abcabcabcabcdededededede"));    // result: 14
		System.out.println(solution.solution("xababcdcdababcdcd"));    // result: 17
	}

	private int solution(String s) {
		int answer = s.length();

		for (int i = 1; i <= s.length() / 2; i++) {
			String target = s.substring(0, i);    // 타겟 문자 패턴
			String currentStr = "";    // 현재 문자열
			int compressCount = 1;    // 압축 카운트
			StringBuilder sb = new StringBuilder();

			for (int start = i; start <= s.length(); start += i) {
				// 비교할 현재 문자열
				if (start + i >= s.length()) {
					currentStr = s.substring(start);
				} else {
					currentStr = s.substring(start, start + i);    // 남은 글자 저장
				}

				if (currentStr.equals(target)) {
					// 문자열이 같으면 압축 카운트 증가
					compressCount++;
				} else if (compressCount == 1) {
					// 다르면 StringBuilder에 문자열을 추가하고 target 패턴 변경
					sb.append(target);
					target = currentStr;
				} else {
					sb.append(compressCount).append(target);
					target = currentStr;
					compressCount = 1;
				}
			}

			// 자르고 마지막에 남는 문자열 추가
			if (i != target.length()) {
				sb.append(target);
			}
			answer = Math.min(answer, sb.toString().length());
		}

		return answer;
	}
}
