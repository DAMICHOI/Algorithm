package dami.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

public class L2073_Time_Needed_to_Buy_Tickets {
	public static void main(String[] args) {
		L2073_Time_Needed_to_Buy_Tickets solution = new L2073_Time_Needed_to_Buy_Tickets();
		System.out.println(solution.timeRequiredToBuy(new int[] {2, 3, 2}, 2));
		System.out.println(solution.timeRequiredToBuy(new int[] {5, 1, 1, 1}, 0));
	}

	private int timeRequiredToBuy(int[] tickets, int k) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < tickets.length; i++) {
			queue.add(i == k ? -tickets[i] : tickets[i]);
		}

		int countTime = 0;
		while (!queue.isEmpty()) {
			countTime++;

			int front = queue.poll();
			if (front < 0) {
				if (front == -1)
					break;
				else
					queue.add(front + 1);
			} else if (front != 1) {
				queue.add(front - 1);
			}
		}
		return countTime;
	}

	// private int timeRequiredToBuy(int[] tickets, int k) {
	// 	int countTime = 0;
	// 	for (int i = 0; i < tickets.length; i++) {
	// 		if (i <= k) {
	// 			countTime += Math.min(tickets[k], tickets[i]);
	// 		} else {
	// 			countTime += Math.min(tickets[k] - 1, tickets[i]);
	// 		}
	// 	}
	// 	return countTime;
	// }

	// private int timeRequiredToBuy(int[] tickets, int k) {
	// 	int countTime = 0;
	// 	while (true) {
	// 		for (int i = 0; i < tickets.length; i++) {
	// 			if (tickets[i] > 0) {
	// 				tickets[i]--;
	// 				countTime++;
	// 			}
	// 			if (i == k && tickets[i] == 0) {
	// 				return countTime;
	// 			}
	// 		}
	// 	}
	// }
}
