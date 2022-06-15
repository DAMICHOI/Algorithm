package dami.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P42576_완주하지_못한_선수 {
	public static void main(String[] args) {
		P42576_완주하지_못한_선수 solution = new P42576_완주하지_못한_선수();
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(solution.notCompletion(participant, completion));

		participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
		completion = new String[] {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution.notCompletion(participant, completion));

		participant = new String[] {"mislav", "stanko", "mislav", "ana"};
		completion = new String[] {"stanko", "ana", "mislav"};
		System.out.println(solution.notCompletion(participant, completion));
	}

	private String notCompletion(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String player : participant) {
			hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hashMap.put(player, hashMap.getOrDefault(player, 0) - 1);
		}

		for (String key : hashMap.keySet()) {
			if (hashMap.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}

	// private String notCompletion(String[] participant, String[] completion) {
	// 	Arrays.sort(participant);
	// 	Arrays.sort(completion);
	// 	int i = 0;
	// 	for (i = 0; i < completion.length; i++) {
	// 		if (!participant[i].equals(completion[i])) {
	// 			return participant[i];
	// 		}
	// 	}
	// 	return participant[i];
	// }

	// 효율성 테스트 시간 초과
	// private String notCompletion(String[] participant, String[] completion) {
	// 	List<String> participantList = new ArrayList<>();
	// 	participantList.addAll(List.of(participant));
	// 	for (String player : completion) {
	// 		if (participantList.contains(player)) {
	// 			int index = participantList.indexOf(player);
	// 			participantList.remove(index);
	// 		}
	// 	}
	// 	return participantList.get(0);
	// }
}
