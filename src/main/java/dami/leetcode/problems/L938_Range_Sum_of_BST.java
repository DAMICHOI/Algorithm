package dami.leetcode.problems;

public class L938_Range_Sum_of_BST {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);

		System.out.println(rangeSumBST(root, 7, 15));

		root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(7);
		root.left.right.left = new TreeNode(6);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(18);
		System.out.println(rangeSumBST(root, 6, 10));
	}

	private static int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}

		int sum = 0;
		// 범주 안에 속해 있으면 노드 더하기
		if (low <= root.val && root.val <= high) {
			sum += root.val;
		}

		sum += rangeSumBST(root.left, low, high);    // 노드의 왼쪽 탐색
		sum += rangeSumBST(root.right, low, high);    // 노드의 오른쪽 탐색
		return sum;
	}
}
