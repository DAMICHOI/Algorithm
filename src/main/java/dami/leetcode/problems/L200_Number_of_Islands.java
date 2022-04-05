package dami.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

public class L200_Number_of_Islands {
	public static void main(String[] args) {
		System.out.println(numIslandsBFS(new char[][] {
			{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '0'}
		}));
		System.out.println(numIslandsBFS(new char[][] {
			{'1', '1', '0', '0', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '1', '0', '0'},
			{'0', '0', '0', '1', '1'}
		}));

		System.out.println();
		System.out.println(numIslandsRecursive(new char[][] {
			{'1', '1', '1', '1', '0'},
			{'1', '1', '0', '1', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '0', '0', '0'}
		}));
		System.out.println(numIslandsRecursive(new char[][] {
			{'1', '1', '0', '0', '0'},
			{'1', '1', '0', '0', '0'},
			{'0', '0', '1', '0', '0'},
			{'0', '0', '0', '1', '1'}
		}));
	}

	static int[] dx = new int[] {1, 0, -1, 0};
	static int[] dy = new int[] {0, 1, 0, -1};

	// O(2nm) = O(nm)
	private static int numIslandsBFS(char[][] grid) {
		int result = 0;

		// O(nm)
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					result++;

					Queue<int[]> q = new LinkedList<>();
					q.add(new int[] {i, j});
					grid[i][j] = '0';    // 이미 방문한 섬은 의미가 없으므로 '0'으로 변경

					// O(nm)
					while (!q.isEmpty()) {
						int[] cur = q.poll();
						int y = cur[0];
						int x = cur[1];

						for (int d = 0; d < 4; d++) {
							int ny = y + dy[d];
							int nx = x + dx[d];
							if (ny < 0 || nx < 0 || ny == grid.length || nx == grid[y].length || grid[ny][nx] == '0') {
								continue;
							}

							q.add(new int[] {ny, nx});
							grid[ny][nx] = '0';
						}
					}
				}
			}
		}
		return result;
	}

	// O(2nm) = O(nm)
	public static int numIslandsRecursive(char[][] grid) {
		int result = 0;

		// O(nm)
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					result++;
					// O(nm)
					remove(grid, i, j);
				}
			}
		}

		return result;
	}

	// O(nm)
	private static void remove(char[][] grid, int y, int x) {
		if (x < 0 || y < 0 || y == grid.length || x == grid[y].length || grid[y][x] == '0') {
			return;
		}
		grid[y][x] = '0';
		remove(grid, y, x + 1);
		remove(grid, y + 1, x);
		remove(grid, y, x - 1);
		remove(grid, y - 1, x);
	}
}
