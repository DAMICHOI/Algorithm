package dami.leetcode.problems;

import java.util.ArrayDeque;

public class L206_Reverse_Linked_List {
	public static void main(String[] args) {
		L206_Reverse_Linked_List solution = new L206_Reverse_Linked_List();

		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(2);
		listNode.next.next = new ListNode(3);
		listNode.next.next.next = new ListNode(4);
		listNode.next.next.next.next = new ListNode(5);
		System.out.println(solution.reverseList(listNode));

		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(2);
		System.out.println(solution.reverseList(listNode2));

		ListNode listNode3 = new ListNode();
		System.out.println(solution.reverseList(listNode3));
	}

	// Recursive - Runtime : 0ms, Memory: 39.2MB
	ListNode root = null;
	private ListNode reverseList(ListNode head) {
		reverseListRecursive(head, null);
		return root;
	}

	private void reverseListRecursive(ListNode head, ListNode prev) {
		if (head == null) {
			return;
		}

		root = head;
		reverseListRecursive(head.next, head);
		head.next = prev;
	}

	// 시간복잡도 : O(N), Runtime: 0ms/ Memory: 40.1MB
	/*private ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}

		return prev;
	}*/
}
