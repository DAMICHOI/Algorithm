package dami.leetcode.problems;

public class L98_Validate_Binary_Search_Tree {
	public static void main(String[] args) {
		L98_Validate_Binary_Search_Tree solution = new L98_Validate_Binary_Search_Tree();

		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);

		System.out.println(solution.isValidBST(root));

		root = new TreeNode(5);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(3);
		root.right.right = new TreeNode(6);

		System.out.println(solution.isValidBST(root));
	}

	private boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(TreeNode node, Integer min, Integer max) {
		if (node == null)
			return true;

		if (min != null && node.val <= min)
			return false;
		if (max != null && node.val >= max)
			return false;

		return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
	}
}
