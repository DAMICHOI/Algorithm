package dami.leetcode.problems;

public class ListNode {
	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode2{" +
			"val=" + val +
			", next=" + next +
			'}';
	}
}
