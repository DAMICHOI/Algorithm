package dami.leetcode.problems;

import java.util.ArrayDeque;

public class L1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
	public static void main(String[] args) {
		L1290_Convert_Binary_Number_in_a_Linked_List_to_Integer solution = new L1290_Convert_Binary_Number_in_a_Linked_List_to_Integer();
		ListNode listNode = new ListNode(1);
		listNode.next = new ListNode(0);
		listNode.next.next = new ListNode(1);
		System.out.println(solution.getDecimalValue(listNode));

		ListNode listNode2 = new ListNode(0);
		System.out.println(solution.getDecimalValue(listNode2));

		ListNode listNode3 = new ListNode(1);
		listNode3.next = new ListNode(0);
		listNode3.next.next = new ListNode(0);
		listNode3.next.next.next = new ListNode(1);
		listNode3.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next = new ListNode(1);
		listNode3.next.next.next.next.next.next.next = new ListNode(1);
		listNode3.next.next.next.next.next.next.next.next = new ListNode(1);
		listNode3.next.next.next.next.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		listNode3.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		System.out.println(solution.getDecimalValue(listNode3));
	}

	// 다른 사람 풀이 Runtime: 0ms, Memory: 36.3MB
	private int getDecimalValue(ListNode head) {
		int decimalValue = 0;
		while (head != null) {
			decimalValue = (decimalValue << 1) + head.val;
			head = head.next;
		}

		return decimalValue;
	}

	// 내 풀이 Runtime: 1ms, Memory: 38.7MB
	/*private int getDecimalValue(ListNode2 head) {
		if (head == null && head.next == null) {
			return 0;
		}
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ListNode2 headCopy = head;
		int decimalValue = 0;

		while (headCopy != null) {
			deque.push(headCopy.val);
			headCopy = headCopy.next;
		}

		int i = 0;
		while (0 < deque.size()) {
			decimalValue += deque.pop() << i;
			i++;
		}

		return decimalValue;
	}*/
}