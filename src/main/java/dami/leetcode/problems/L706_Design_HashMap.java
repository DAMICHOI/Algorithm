package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class L706_Design_HashMap {
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		// map.put(1, 1);
		// map.put(2, 2);
		// System.out.println(map.get(1));
		// System.out.println(map.get(3));
		// map.put(2, 1);
		// System.out.println(map.get(2));
		// map.remove(2);
		// System.out.println(map.get(2));

		map.remove(14);
		System.out.println(map.get(4));
		map.put(7, 3);
		map.put(11, 1);
		map.put(12, 1);
		System.out.println(map.get(7));
		map.put(1, 19);
		map.put(0, 3);
		map.put(1, 8);
		map.put(2, 6);
	}
}

// (부끄러운) 과거 풀이
/*class MyHashMap {
	int[] map;

	public MyHashMap() {
		map = new int[1000000 + 1];
	}

	public void put(int key, int value) {
		map[key] = value + 1;
	}

	public int get(int key) {
		return map[key] - 1;
	}

	public void remove(int key) {
		map[key] = 0;
	}
}*/

// 현재 풀이
class MyHashMap {
	private LinkedList<Node>[] bucket;
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	static final int DEFAULT_CAPACITY = 16;
	private int capacity;
	private int size;
	private float loadFactor;

	public MyHashMap() {
		init(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
	}

	private void init(int capacity, float loadFactor) {
		this.size = 0;
		this.loadFactor = loadFactor;
		this.capacity = capacity;
		this.bucket = new LinkedList[capacity];
		for (int i = 0; i < capacity; i++) {
			bucket[i] = new LinkedList<>();
		}
	}

	public void put(int key, int value) {
		int hashcode = hashing(key);
		int search = search(hashcode, key);

		if (search == -1) {
			bucket[hashcode].addLast(new Node(key, value));
			size++;
		} else {
			bucket[hashcode].get(search).value = value;
		}

		if (size > bucket.length * loadFactor) {
			reSize();
		}
	}

	public int get(int key) {
		int hashCode = hashing(key);
		int search = search(hashCode, key);

		if (search == -1) {
			return -1;
		} else {
			return bucket[hashCode].get(search).value;
		}
	}

	public void remove(int key) {
		int hashCode = hashing(key);
		int search = search(hashCode, key);

		if (search != -1) {
			bucket[hashCode].remove(search);
		}
	}

	private void reSize() {
		LinkedList<Node>[] oldBucket = bucket;
		init(2 * capacity, loadFactor);
		for (int i = 0; i < oldBucket.length; i++) {
			for (Node node : oldBucket[i]) {
				put(node.key, node.value);
			}
		}
	}

	private int search(int hashcode, int key) {
		int i = 0;
		for (Node node : bucket[hashcode]) {
			if (node.key == key) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	private int hashing(Integer key) {
		return Math.abs(key.hashCode()) % bucket.length;
	}

	private class Node {
		int key;
		int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
}