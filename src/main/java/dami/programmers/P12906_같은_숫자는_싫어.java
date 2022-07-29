package dami.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P12906_같은_숫자는_싫어 {
	public static void main(String[] args) {
		P12906_같은_숫자는_싫어 solution = new P12906_같은_숫자는_싫어();
		for (int n : solution.solution(new int[] {1, 1, 3, 3, 0, 1, 1})) {
			System.out.print(n + " ");
		}
	}

	private int[] solution(int[] arr) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);

		for (int i = 1, j = 0; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				list.add(arr[i]);
			}
		}

		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
