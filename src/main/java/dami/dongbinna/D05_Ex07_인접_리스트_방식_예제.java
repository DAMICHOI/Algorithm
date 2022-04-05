package dami.dongbinna;

import java.util.ArrayList;

public class D05_Ex07_인접_리스트_방식_예제 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		for (int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>());
		}

		graph.get(0).add(new Node(1, 7));
		graph.get(0).add(new Node(2, 5));

		graph.get(1).add(new Node(0, 7));
		graph.get(2).add(new Node(0, 5));

		for (int i = 0; i < graph.size(); i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				System.out.print(graph.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	static class Node {
		private int index;
		private int distance;

		public Node(int index, int distance) {
			this.index = index;
			this.distance = distance;
		}

		public int getIndex() {
			return this.index;
		}

		public int getDistance() {
			return this.distance;
		}

		@Override
		public String toString() {
			return "{" + index +
				", " + distance +
				'}';
		}
	}
}
