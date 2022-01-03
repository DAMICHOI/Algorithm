package dami.leetcode.problems;

public class L997_Find_the_Town_Judge {
	public static void main(String[] args) {
		L997_Find_the_Town_Judge solution = new L997_Find_the_Town_Judge();
		// trust[i] = [a,b] 일때 a가 b를 신뢰한다는 뜻이다.
		System.out.println(solution.findJudge(2, new int[][] {{1, 2}}));
		System.out.println(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}}));
		System.out.println(solution.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 2}}));
	}

	private int findJudge(int n, int[][] trust) {
		int[] count = new int[n + 1];    // 길이가 n+1 인 배열 정의

		for (int i = 0; i < trust.length; i++) {
			count[trust[i][0]]--;    // 주어진 사람이 누군가를 신뢰하면 그 사람의 인덱스를 줄인다.
			count[trust[i][1]]++;    // 신뢰하는 인덱스의 수를 증가시킨다.
			// System.out.println("outdegree=" + count[trust[i][0]] + " indegree=" + count[trust[i][1]]);
		}

		// 마지막으로 count가 n-1인 인덱스가 있는 경우 배열을 확인한다.
		for (int i = 1; i <= n; i++) {
			System.out.println("count[" + i + "]=" + count[i] + " (n-1)=" + (n - 1));
			// 판사는 아무도 믿지 않지만 다른 사람들은 모두 판사를 신뢰할 경우
			if (count[i] == n - 1)
				return i;    // 인덱스 반환
		}

		return -1;
	}
}
