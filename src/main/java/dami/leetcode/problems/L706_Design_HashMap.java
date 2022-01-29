package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class L706_Design_HashMap {
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		map.put(1, 1);
		map.put(2, 2);
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		map.put(2, 1);
		System.out.println(map.get(2));
		map.remove(2);
		System.out.println(map.get(2));

	}
}

class MyHashMap {
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
}

class ListNodeMap {
	int key;
	int value;
	ListNodeMap next;

	public ListNodeMap() {
	}

	public ListNodeMap(int key, int value, ListNodeMap next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
}
