package dami.dongbinna;

import java.util.ArrayDeque;
import java.util.Deque;

public class D05_Ex02_큐_예제 {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();

		// 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(7);
		queue.poll();        // 5 제거
		queue.offer(1);
		queue.offer(4);
		queue.poll();        // 2 제거

		// 먼저 들어온 원소부터 추출
		// 실행 결과 : 3 7 1 4
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}
}
