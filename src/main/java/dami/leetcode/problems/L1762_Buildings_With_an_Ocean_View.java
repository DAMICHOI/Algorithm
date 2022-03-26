package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class L1762_Buildings_With_an_Ocean_View {
	public static void main(String[] args) {
		L1762_Buildings_With_an_Ocean_View solution = new L1762_Buildings_With_an_Ocean_View();
		for (int number : solution.findOceanViewBuildings(new int[] {4, 2, 3, 1})) {
			System.out.print(number);
		}

		System.out.println();
		for (int number : solution.findOceanViewBuildings(new int[] {4, 3, 2, 1})) {
			System.out.print(number);
		}

		System.out.println();
		for (int number : solution.findOceanViewBuildings(new int[] {1, 3, 2, 4})) {
			System.out.print(number);
		}

		System.out.println();
		for (int number : solution.findOceanViewBuildings(new int[] {2, 2, 2, 2})) {
			System.out.print(number);
		}
	}

	public int[] findOceanViewBuildings(int[] heights) {
		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		int index, maxHeight;

		for (int height : heights) {
			stack.push(height);
		}

		index = stack.size() - 1;
		list.add(index);

		maxHeight = stack.pop();

		while (index > 0) {
			index--;
			int temp = stack.pop();
			if (maxHeight < temp) {
				maxHeight = temp;
				list.add(index);
			}
		}

		Collections.sort(list);
		return list.stream().mapToInt(i -> i).toArray();
	}
}
