package dami.dongbinna;

public class D05_Ex06_인접_행렬_방식_예제 {
	static final int INF = 999999999;
	static int[][] graph = {{0, 7, 5}, {7, 0, INF}, {5, INF, 0}};

	public static void main(String[] args) {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}
