package dami.leetcode.problems;

public class L236_Lowest_Common_Ancestor_of_a_Binary_Tree {
	public static void main(String[] args) {
		L236_Lowest_Common_Ancestor_of_a_Binary_Tree solution = new L236_Lowest_Common_Ancestor_of_a_Binary_Tree();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);

		TreeNode p = new TreeNode(5);
		TreeNode q = new TreeNode(1);

		System.out.println(solution.lowestCommonAncestor(root, p, q));
	}

	private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q)
			return root;

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		return left == null ? right : right == null ? left : root;
	}
}
