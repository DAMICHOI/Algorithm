package dami.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

public class L922_Number_of_Recent_Calls {
	public static void main(String[] args) {
		RecentCounter recentCounter = new RecentCounter();
		System.out.println(recentCounter.ping(1));
		System.out.println(recentCounter.ping(100));
		System.out.println(recentCounter.ping(3001));
		System.out.println(recentCounter.ping(3002));
	}
}

class RecentCounter {
	static Queue<Integer> queue;

	public RecentCounter() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		queue.add(t);
		while (!queue.isEmpty() && queue.size() > 0 && t - queue.peek() > 3000) {
			queue.poll();
		}

		return queue.size();
	}
}
