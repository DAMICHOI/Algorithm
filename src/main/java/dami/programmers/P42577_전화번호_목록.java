package dami.programmers;

import java.util.HashMap;
import java.util.Map;

public class P42577_전화번호_목록 {
	public static void main(String[] args) {
		P42577_전화번호_목록 solution = new P42577_전화번호_목록();
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution.isPrefix(phone_book));

		phone_book = new String[] {"123", "456", "789"};
		System.out.println(solution.isPrefix(phone_book));

		phone_book = new String[] {"12", "123", "1235", "567", "88"};
		System.out.println(solution.isPrefix(phone_book));
	}

	private boolean isPrefix(String[] phone_book) {
		boolean answer = true;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book[i].length(); j++) {
				if (map.containsKey(phone_book[i].substring(0, j))) {
					answer = false;
					break;
				}
			}
		}

		return answer;
	}
}
