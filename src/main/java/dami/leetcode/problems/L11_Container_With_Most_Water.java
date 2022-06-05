package dami.leetcode.problems;

public class L11_Container_With_Most_Water {
	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));    // result : 49
		System.out.println(maxArea(new int[] {1, 1}));    // result : 1
	}

	private static int maxArea(int[] height) {
		int l = 0, r = height.length - 1;
		int result = 0;

		while (l < r) {
			result = Math.max(result, (r - l) * Math.min(height[l], height[r]));

			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}
		return result;
	}
}
