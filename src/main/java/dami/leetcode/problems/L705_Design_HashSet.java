package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class L705_Design_HashSet {
	public static void main(String[] args) {
		MyHashSet myHashSet = new MyHashSet();
		myHashSet.add(1);
		myHashSet.add(2);
		System.out.println(myHashSet.contains(1));
		System.out.println(myHashSet.contains(3));
		myHashSet.add(2);
		System.out.println(myHashSet.contains(2));
		System.out.println(myHashSet.contains(2));
	}
}

// LinkedList를 활용한 방법. Runtime: 250ms, Memory: 54.3MB
class MyHashSet {
	ListNode listNode;

	public MyHashSet() {
		listNode = new ListNode(-1);
	}

	public void add(int key) {
		ListNode temp = listNode;
		while (temp != null) {
			if (temp.val == key) {
				return;
			}
			temp = temp.next;
		}
		listNode = new ListNode(key, listNode);
	}

	public void remove(int key) {
		if (listNode.val == key) {
			listNode = listNode.next;
		}
		ListNode temp = listNode;
		while (temp != null && temp.next != null) {
			if (temp.next.val == key) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}

	public boolean contains(int key) {
		ListNode temp = listNode;
		while (temp != null) {
			if (temp.val == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
}
/*
class MyHashSet {
	private boolean[] arr;
	public MyHashSet() {
		arr = new boolean[1000001];
	}

	public void add (int key) {
		arr[key] = true;
	}

	public void remove(int key) {
		arr[key] = false;
	}

	public boolean contains(int key) {
		return arr[key];
	}
}
*/
