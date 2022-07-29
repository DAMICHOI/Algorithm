package dami.programmers;

import java.util.HashSet;

public class P1845_포켓몬 {
	public static void main(String[] args) {
		P1845_포켓몬 solution = new P1845_포켓몬();
		System.out.println(solution.solution(new int[] {3, 1, 2, 3}));
	}

	private int solution(int[] nums) {
		int answer;
		int count = nums.length / 2;
		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			hashSet.add(nums[i]);
		}

		if (count < hashSet.size())
			answer = count;
		else
			answer = hashSet.size();
		return answer;
	}
}
