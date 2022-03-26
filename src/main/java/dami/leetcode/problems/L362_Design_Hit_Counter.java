package dami.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

public class L362_Design_Hit_Counter {
	public static void main(String[] args) {
		HitCounter counter = new HitCounter();
		counter.hit(1);
		counter.hit(2);
		counter.hit(3);
		System.out.println(counter.getHits(4));
		counter.hit(300);
		System.out.println(counter.getHits(300));
		System.out.println(counter.getHits(301));
		System.out.println(counter.getHits(302));
	}
}

class HitCounter {
	Queue<Integer> queue = new LinkedList<>();

	public void hit(int timestamp) {
		queue.add(timestamp);
	}

	public int getHits(int timestamp) {
		while (!queue.isEmpty() && queue.size() > 0 && timestamp - queue.peek() >= 300) {
			queue.poll();
		}
		return queue.size();
	}
}