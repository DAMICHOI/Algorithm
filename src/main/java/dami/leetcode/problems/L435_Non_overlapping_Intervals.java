package dami.leetcode.problems;

import java.util.Arrays;

public class L435_Non_overlapping_Intervals {
	public static void main(String[] args) {
		System.out.println(eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}));    // result : 1
		// System.out.println(eraseOverlapIntervals(new int[][] {{1, 2}, {1, 2}, {1, 2}}));    // result : 2
		// System.out.println(eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}}));    // result : 0
	}

	private static int eraseOverlapIntervals(int[][] intervals) {
		if (intervals == null || intervals.length <= 1)
			return 0;
		// Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

		Arrays.sort(intervals, (a, b) -> {
			System.out.println(a[1] +" "+ b[1]);
			return a[1]-b[1];
		});

		int[] cur = intervals[0];
		int cnt = 1;
		for (int i = 1; i < intervals.length; i++) {
			if (cur[1] <= intervals[i][0]) {
				cnt++;
				cur = intervals[i];
			}
		}
		return intervals.length - cnt;
	}
}
