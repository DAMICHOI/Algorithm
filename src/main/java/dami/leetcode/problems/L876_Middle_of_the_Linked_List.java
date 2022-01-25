package dami.leetcode.problems;

import java.util.ArrayDeque;

public class L876_Middle_of_the_Linked_List {
	public static void main(String[] args) {
		L876_Middle_of_the_Linked_List solution = new L876_Middle_of_the_Linked_List();

		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		System.out.println(solution.middleNode(listNode).toString());

		listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		listNode.next.next.next.next.next = new ListNode(6);
		System.out.println(solution.middleNode(listNode).toString());

		listNode = new ListNode(1);
		System.out.println(solution.middleNode(listNode).toString());
	}

	private ListNode middleNode(ListNode head) {
		if (head == null && head.next == null) {
			return null;
		}

		ArrayDeque<ListNode> deque = new ArrayDeque<>();
		ListNode headCopy = head;

		while (headCopy != null) {
			deque.push(headCopy);
			headCopy = headCopy.next;
		}

		int count = deque.size() % 2 == 0 ? deque.size() / 2 : deque.size() / 2 + 1;
		ListNode top = null;

		while (count-- > 0) {
			top = deque.pop();
		}

		return top;
	}

	/*private ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}*/

}
