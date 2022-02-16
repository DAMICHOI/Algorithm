package dami.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class L771_Jewels_and_Stones {
	public static void main(String[] args) {
		L771_Jewels_and_Stones solution = new L771_Jewels_and_Stones();
		System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(solution.numJewelsInStones("z", "ZZ"));
	}

	// Runtime: 1ms, Memory : 42.2MB
	private int numJewelsInStones(String jewels, String stones) {
		int jewelCount = 0;

		for (int i = 0; i < stones.length(); i++) {
			if (jewels.indexOf(stones.charAt(i)) != -1) {
				jewelCount++;
			}
		}
		return jewelCount;
	}

	// HashMap을 이용한 풀이 (Runtime: 4ms, Memory: 42.7MB)
	/*private int numJewelsInStones(String jewels, String stones) {
		Map<Character, Integer> stone = new HashMap<>();
		int jewelCount = 0;

		for (int i = 0; i < stones.length(); i++) {
			stone.put(stones.charAt(i), stone.getOrDefault(stones.charAt(i), 0) + 1);
		}

		for (int i = 0; i < jewels.length(); i++) {
			jewelCount += stone.getOrDefault(jewels.charAt(i), 0);
		}

		return jewelCount;
	}*/

	// 다른 사람 풀이 (Runtime: 1ms, Memory: 41.1MB)
	/*private int numJewelsInStones(String jewels, String stones) {
		char[] stone = stones.toCharArray();
		int jewelCount = 0;

		for (int i = 0; i < stone.length; i++) {
			if (jewels.indexOf(stone[i]) != -1) {
				jewelCount++;
			}
		}
		return jewelCount;
	}*/
}
