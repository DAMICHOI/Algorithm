package dami.leetcode.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class L143_Recorder_List {
	public static void main(String[] args) {
		L143_Recorder_List solution = new L143_Recorder_List();

		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		solution.reorderList(listNode);

		System.out.println(listNode.toString());
	}

	private void reorderList(ListNode head) {
		if (head == null || head.next == null)
			return;

		Deque<ListNode> deque = new ArrayDeque<>();
		ListNode head2 = head;

		while (head2 != null) {
			deque.push(head2);
			head2 = head2.next;
		}

		int count = (deque.size() - 1) / 2;
		head2 = head;

		while (count-- > 0) {
			ListNode top = deque.pop();
			ListNode temp = head2.next;
			head2.next = top;
			top.next = temp;
			head2 = temp;
		}
		deque.pop().next = null;

	}
}