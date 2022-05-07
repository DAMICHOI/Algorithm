package dami.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class L146_LRU_Cache {
	public static void main(String[] args) {
		LRUCache obj = new LRUCache(2);
		obj.put(1, 1);
		obj.put(2, 2);
		System.out.println(obj.get(1));
		obj.put(3, 3);
		System.out.println(obj.get(2));
		obj.put(4, 4);
		System.out.println(obj.get(1));
		System.out.println(obj.get(3));
		System.out.println(obj.get(4));
	}
}

class LRUCache {
	private Map<Integer, Node> cache;
	private Node head, tail;
	private int capacity;
	private int size;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.cache = new HashMap<>();
		this.head = new Node(0, 0);
		this.tail = new Node(0, 0);
		this.head.next = tail;
		this.tail.prev = head;
	}

	public int get(int key) {
		Node node = cache.get(key);
		if (node == null) {
			return -1;
		} else {
			remove(node);
			add(node);
			return node.value;
		}
	}

	public void put(int key, int value) {
		Node node = cache.get(key);
		if (node == null) {
			node = new Node(key, value);
			cache.put(key, node);
			add(node);
			++size;
		} else {
			node.value = value;
			remove(node);
			add(node);
		}

		if (size > capacity) {
			Node deleteNode = tail.prev;
			remove(deleteNode);
			cache.remove(deleteNode.key);
			--size;
		}
	}

	private void remove(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	private void add(Node node) {
		node.next = head.next;
		node.next.prev = node;
		node.prev = head;
		head.next = node;
	}

	private class Node {
		int key;
		int value;
		Node prev, next;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Node{" +
				"key=" + key +
				", value=" + value +
				", next=" + next +
				'}';
		}
	}
}
