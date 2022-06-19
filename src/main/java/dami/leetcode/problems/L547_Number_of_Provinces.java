package dami.leetcode.problems;

public class L547_Number_of_Provinces {
	public static void main(String[] args) {
		int[][] isConnected = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		System.out.println(findCircleNum(isConnected));    // result: 2

		isConnected = new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		System.out.println(findCircleNum(isConnected));    // result: 3
	}

	private static int findCircleNum(int[][] isConnected) {
		int provinces = 0;
		boolean[] visited = new boolean[isConnected.length];

		for (int i = 0; i < isConnected.length; i++) {
			if (visited[i]) {
				continue;
			}

			provinces++;
			dfs(i, isConnected, visited);
		}
		return provinces;
	}

	private static void dfs(int from, int[][] isConnected, boolean[] visited) {
		if (visited[from]) {
			return;
		}
		visited[from] = true;

		for (int i = 0; i < isConnected[from].length; i++) {
			if (from != i && visited[i] == false && isConnected[from][i] == 1) {
				dfs(i, isConnected, visited);
			}
		}
	}
}
