package tree;

import common.TreeNode;

public class PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        // 从当前节点开始的路径数量 + 从左子树开始的路径数量 + 从右子树开始的路径数量
        return countPaths(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int countPaths(TreeNode node, long targetSum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val == targetSum) {
            count++; // 当前节点值等于目标值，路径数量加 1
        }
        // 递归计算左子树和右子树的路径数量
        count += countPaths(node.left, targetSum - node.val);
        count += countPaths(node.right, targetSum - node.val);
        return count;
    }
}
