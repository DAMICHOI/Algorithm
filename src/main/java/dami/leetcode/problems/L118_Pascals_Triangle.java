package dami.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class L118_Pascals_Triangle {
	public static void main(String[] args) {
		L118_Pascals_Triangle solution = new L118_Pascals_Triangle();
		System.out.println(solution.generate(5));
		System.out.println(solution.generate(1));
	}

	private List<List<Integer>> generate(int numRows) {
		List<List<Integer>> allRows = new ArrayList<>();
		List<Integer> row = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {
			row.add(0,1);
			for (int j = 1; j < row.size()-1; j++) {
				row.set(j, row.get(j)+row.get(j+1));
			}
			allRows.add(new ArrayList<>(row));
		}
		return allRows;
	}

	// private List<List<Integer>> generate(int numRows) {
	// 	List<List<Integer>> lists = new ArrayList<>();
	// 	List<Integer> list = new ArrayList<>();
	// 	list.add(1);
	// 	lists.add(list);
	// 	if (numRows == 1) {
	// 		return lists;
	// 	}
	//
	// 	list = new ArrayList<>();
	// 	list.add(1);
	// 	list.add(1);
	// 	lists.add(list);
	//
	// 	dp(2, numRows, list, lists);
	// 	return lists;
	// }
	//
	// private void dp(int i, int numRows, List<Integer> list, List<List<Integer>> lists) {
	// 	if (i == numRows) {
	// 		return;
	// 	}
	// 	List<Integer> temp = new ArrayList<>();
	// 	temp.add(1);
	//
	// 	for (int j = 1; j < list.size(); j++) {
	// 		temp.add(list.get(j - 1) + list.get(j));
	// 	}
	// 	temp.add(1);
	// 	lists.add(temp);
	//
	// 	dp(++i, numRows, temp, lists);
	// }
}
