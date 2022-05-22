package dami.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class L1_Two_Sum {
	public static void main(String[] args) {
		L1_Two_Sum solution = new L1_Two_Sum();
		System.out.println(solution.twoSum(new int[] {2, 7, 11, 15}, 9));
		System.out.println(solution.twoSum(new int[] {3, 2, 4}, 6));
		System.out.println(solution.twoSum(new int[] {3, 3}, 6));
	}

	// 시간복잡도 O(N^2)
	/*public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == target - nums[j]) {
					System.out.println(i + " " + j);
					return new int[] {i, j};
				}
			}
		}
		return null;
	}*/

	// 시간복잡도 O(N)
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			// 현재 수(nums[i])의 보수가 있는지 확인
			if (map.containsKey(nums[i])) {
				// 있을 경우, 현재 수를 보수로 갖던 수의 index와 현재 index를 반환
				return new int[] {map.get(nums[i]), i};
			}
			// 없을 경우, 현재 수의 보수 값을 key로 하고 현재 수의 index를 value로 하는 데이터 삽입
			map.put(target - nums[i], i);
		}
		return new int[] {};
	}
}
