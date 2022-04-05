package dami.leetcode.problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class L617_Merge_Two_Binary_Trees {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(3);
		root1.right = new TreeNode(2);
		root1.left.left = new TreeNode(5);

		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(3);
		root2.left.right = new TreeNode(3);
		root2.right.right = new TreeNode(7);

		TreeNode result = mergeTrees(root1, root2);
		System.out.println(result.toString());
	}

	// 큐를 이용한 BFS
	private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return null;
		} else if (root1 == null) {
			return root2;
		} else if (root2 == null) {
			return root1;
		}

		Deque<TreeNode[]> queue = new LinkedList<>();
		queue.offer(new TreeNode[] {root1, root2});

		while (!queue.isEmpty()) {
			TreeNode[] cur = queue.poll();

			if (cur[1] == null) {
				continue;
			}

			cur[0].val += cur[1].val;

			if (cur[0].left == null) {
				cur[0].left = cur[1].left;
			} else {
				queue.offer(new TreeNode[] {cur[0].left, cur[1].left});
			}

			if (cur[0].right == null) {
				cur[0].right = cur[1].right;
			} else {
				queue.offer(new TreeNode[] {cur[0].right, cur[1].right});
			}
		}
		return root1;
	}

	// 재귀 호출을 이용한 풀이
	// private static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	// 	if (root1 == null && root2 == null) {
	// 		return null;
	// 	} else if (root1 == null) {
	// 		return root2;
	// 	} else if (root2 == null) {
	// 		return root1;
	// 	}
	//
	// 	TreeNode result = new TreeNode(root1.val + root2.val);
	// 	result.left = mergeTrees(root1.left, root2.left);
	// 	result.right = mergeTrees(root1.right, root2.right);
	// 	return result;
	// }
}