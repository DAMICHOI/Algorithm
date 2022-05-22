package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L1200_Minimum_Absolute_Difference {
	public static void main(String[] args) {
		L1200_Minimum_Absolute_Difference solution = new L1200_Minimum_Absolute_Difference();
		System.out.println(solution.minimumAbsDifference(new int[] {4, 2, 1, 3}));
		System.out.println(solution.minimumAbsDifference(new int[] {1, 3, 6, 10, 15}));
		System.out.println(solution.minimumAbsDifference(new int[] {3, 8, -10, 23, 19, -4, -14, 27}));
	}

	private List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> arrayList = new ArrayList<>();
		int abs = 0;
		int absMin = (int)1e6;

		for (int i = 0; i < arr.length - 1; i++) {
			absMin = Math.min(absMin, arr[i + 1] - arr[i]);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			List<Integer> list = new ArrayList<>();
			abs = Math.abs(arr[i + 1] - arr[i]);
			if (abs == absMin) {
				list.add(arr[i]);
				list.add(arr[i + 1]);
				arrayList.add(list);
			}
		}
		return arrayList;
	}
}
