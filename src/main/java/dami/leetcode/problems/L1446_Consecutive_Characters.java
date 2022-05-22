package dami.leetcode.problems;

public class L1446_Consecutive_Characters {
	public static void main(String[] args) {
		L1446_Consecutive_Characters Solution = new L1446_Consecutive_Characters();
		System.out.println(Solution.maxPower("leetcode"));
		System.out.println(Solution.maxPower("abbcccddddeeeeedcba"));
		System.out.println(Solution.maxPower("triplepillooooow"));
		System.out.println(Solution.maxPower("hooraaaaaaaaaaay"));
		System.out.println(Solution.maxPower("tourist"));
		System.out.println(Solution.maxPower("j"));
	}

	private int maxPower(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int count = 0, maxCount = 0;
		char prevC = ' ';

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (prevC == c) {
				count++;
			} else {
				count = 1;
				prevC = c;
			}

			maxCount = Math.max(count, maxCount);
		}

		return maxCount;
	}
}
