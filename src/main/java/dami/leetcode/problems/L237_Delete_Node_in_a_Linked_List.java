package dami.leetcode.problems;

public class L237_Delete_Node_in_a_Linked_List {
	public static void main(String[] args) {
		L237_Delete_Node_in_a_Linked_List solution = new L237_Delete_Node_in_a_Linked_List();

		ListNode listNode = new ListNode(4);
		listNode.next = new ListNode(5);
		listNode.next.next = new ListNode(1);
		listNode.next.next.next = new ListNode(9);
		solution.deleteNode(listNode);
		System.out.println(listNode.toString());
	}

	private void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
