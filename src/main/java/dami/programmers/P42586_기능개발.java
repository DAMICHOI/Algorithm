package dami.programmers;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P42586_기능개발 {
	public static void main(String[] args) {
		P42586_기능개발 solution = new P42586_기능개발();
		for (int n : solution.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})) {
			System.out.print(n + " ");
		}
	}

	private int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		Deque<Integer> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				queue.offer((100 - progresses[i]) / speeds[i]);
			} else {
				queue.offer((100 - progresses[i]) / speeds[i] + 1);
			}
		}

		System.out.println(queue);

		int count = 0;
		int temp = queue.peek();

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			if (temp<cur) {
				list.add(count);
				temp = cur;
				count = 1;
			} else {
				count++;
			}

			if (queue.isEmpty()) {
				list.add(count);
				break;
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
