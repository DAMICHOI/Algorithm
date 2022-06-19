package dami.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class L207_Course_Schedule {
	public static void main(String[] args) {
		System.out.println(canFinish(2, new int[][] {{1, 0}}));    // result : true
		System.out.println(canFinish(2, new int[][] {{1, 0}, {0, 1}}));    // result : false
	}

	private static boolean canFinish(int numCourses, int[][] prerequisites) {
		int[] indegree = new int[numCourses];
		Map<Integer, Set<Integer>> map = new HashMap<>();

		for (int[] pre : prerequisites) {
			indegree[pre[0]]++;
			map.putIfAbsent(pre[1], new HashSet<>());
			map.get(pre[1]).add(pre[0]);
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				q.add(i);
			}
		}

		int count = 0;
		while (!q.isEmpty()) {
			int cur = q.poll();
			count++;

			if (map.containsKey(cur)) {
				for (int next : map.get(cur)) {
					indegree[next]--;
					if (indegree[next] == 0) {
						q.add(next);
					}
				}
			}
		}
		return count == numCourses;
	}
}
