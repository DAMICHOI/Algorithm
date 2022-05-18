package dami.Boj.Type.T4_자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B11286_절댓값_힙 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 우선 순위는 절대값이 작은 순 -> 숫자가 작은 순으로 제거해야 하기 때문에 PriorityQueue를 사용해
		// compare를 오버라이딩하여 Queue에서 올바른 순서로 나올 수 있게 만들어준다.
		Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) > Math.abs(o2)) {	// 절대값 기준으로 앞 값이 더 크다면 자리를 바꿔준다.
					return Math.abs(o1)-Math.abs(o2);
					// return 1;
				} else if (Math.abs(o1) == Math.abs(o2)) {	// 절대값 기준으로 두 값이 같다면 음수를 앞으로 보내준다.
					return o1 - o2;
				} else {
					return -1;
				}
			}
		});

		for (int i = 0; i < n; i++) {
			int next = Integer.parseInt(br.readLine());

			if (next == 0 && queue.size() != 0) {
				System.out.println(queue.poll());
			} else if (next == 0 && queue.size() == 0) {
				System.out.println(0);
			} else {
				queue.add(next);
			}
		}
	}
}
