package dami.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P92334_신고_결과_받기 {
	public static void main(String[] args) {
		P92334_신고_결과_받기 solution = new P92334_신고_결과_받기();

		String[] id_list = new String[] {"muzi", "frodo", "apeach", "neo"};
		String[] report = new String[] {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		for (int num : solution.solution(id_list, report, 2)) {
			System.out.print(num + " ");
		}

		System.out.println();

		id_list = new String[] {"con", "ryan"};
		report = new String[] {"ryan con", "ryan con", "ryan con", "ryan con"};
		for (int num : solution.solution(id_list, report, 3)) {
			System.out.print(num + " ");
		}
	}

	private int[] solution(String[] id_list, String[] report, int k) {

		List<String> temp = Arrays.stream(report).distinct().collect(Collectors.toList());
		System.out.println(temp.toString());

		int[] answer = new int[id_list.length];

		HashMap<String, HashSet<String>> reportMap = new HashMap<>();    // Key: 신고된 ID, Value: 신고한 ID
		Map<String, Integer> mailMap = new HashMap<>();    // Key: 신고된 ID, Value: 신고된 횟수

		// 신고 기록
		for (String users : report) {
			String[] userArr = users.split(" ");
			HashSet<String> reportSet = new HashSet<>();
			if (reportMap.containsKey(userArr[1])) {
				reportSet = reportMap.get(userArr[1]);
			}
			reportSet.add(userArr[0]);
			reportMap.put(userArr[1], reportSet);
		}

		// 메일 받을 수
		for (String reportedUser : reportMap.keySet()) {
			HashSet<String> reportingUser = reportMap.get(reportedUser);
			if (reportingUser.size() >= k) {
				for (String userId : reportingUser) {
					mailMap.put(userId, mailMap.getOrDefault(userId, 0) + 1);
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = mailMap.getOrDefault(id_list[i], 0);
		}

		return answer;
	}
}
