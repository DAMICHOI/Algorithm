package dami.programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class P42587_프린터 {
	public static void main(String[] args) {
		P42587_프린터 solution = new P42587_프린터();
		System.out.println(solution.solution(new int[] {2, 1, 3, 2}, 2));
		System.out.println(solution.solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
	}

	// 우선순위 큐
	private int solution(int[] priorities, int location) {
		int answer = 0;
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++) {
			queue.add(priorities[i]);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == queue.peek()) {
					if (i == location) {
						answer++;
						return answer;
					}
					queue.poll();
					answer++;
				}
			}
		}

		return -1;
	}
}
