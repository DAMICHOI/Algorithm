package dami.leetcode.problems;

public class L104_Maximum_Depth_of_Binary_Tree {
	public static void main(String[] args) {
		L104_Maximum_Depth_of_Binary_Tree solution = new L104_Maximum_Depth_of_Binary_Tree();

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		System.out.println(solution.maxDepth(root));

		root = new TreeNode(1);
		root.right = new TreeNode(2);

		System.out.println(solution.maxDepth(root));
	}

	private int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
