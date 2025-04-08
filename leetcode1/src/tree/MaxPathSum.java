package tree;

import common.TreeNode;

public class MaxPathSum {

    private int maxSum = Integer.MIN_VALUE; // 用于记录最大路径和

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode node) {
        if (node == null) {
            return 0; // 空节点的贡献值为 0
        }
        // 递归计算左子树和右子树的最大贡献值
        int leftGain = Math.max(maxGain(node.left), 0); // 如果贡献值为负，则取 0
        int rightGain = Math.max(maxGain(node.right), 0); // 如果贡献值为负，则取 0
        // 计算当前节点的路径和（当前节点值 + 左子树贡献值 + 右子树贡献值）
        int currentSum = node.val + leftGain + rightGain;
        // 更新全局最大路径和
        maxSum = Math.max(maxSum, currentSum);
        // 返回当前节点的最大贡献值（当前节点值 + 左子树或右子树的最大贡献值）
        return node.val + Math.max(leftGain, rightGain);
    }
}
