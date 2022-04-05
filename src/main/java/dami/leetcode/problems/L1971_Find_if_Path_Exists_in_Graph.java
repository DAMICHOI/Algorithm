package dami.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class L1971_Find_if_Path_Exists_in_Graph {
	public static void main(String[] args) {
		L1971_Find_if_Path_Exists_in_Graph solution = new L1971_Find_if_Path_Exists_in_Graph();
		System.out.println(solution.validPathBFS(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2));
	}

	private boolean validPathBFS(int n, int[][] edges, int source, int destination) {
		Map<Integer, Set<Integer>> graph = new HashMap<>();
		Set<Integer> visited = new HashSet<>();

		// O(e)
		for (int[] edge : edges) {
			graph.putIfAbsent(edge[0], new HashSet<>());
			graph.putIfAbsent(edge[1], new HashSet<>());

			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);
		}

		// O(n+2e) -> O(n+e)
		Queue<Integer> queue = new LinkedList<>();
		queue.add(source);
		visited.add(source);

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			if (cur == destination) {
				return true;
			}

			// O(2e)
			for (int next : graph.get(cur)) {
				if (!visited.contains(next)) {
					queue.add(next);
					visited.add(next);
				}
			}
		}
		return false;
	}

	// disjoint set union
	// 입력: n = 3, edges = [[0, 1], [1, 2], [2, 3]], source = 0, destination = 2
	// n = 3
	static int[] parent;

	public static boolean validPathDisjoint(int n, int[][] edges, int source, int destination) {
		parent = new int[n];

		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}

		// n = 5
		// parent = {0, 1, 2, 3, 4}

		for (int[] edge : edges) {
			union(edge[0], edge[1]);
		}

		return findParent(source) == findParent(destination);
	}

	private static void union(int s, int d) {
		int ps = findParent(s);
		int pd = findParent(d);
		parent[ps] = pd;
	}

	private static int findParent(int p) {
		int par = p;
		while (par != parent[par]) {
			par = parent[par];
		}

		parent[p] = par;
		return par;
	}

}
