package tree;

import common.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root; // 如果当前节点为空或等于 p 或 q，直接返回当前节点
        }
        // 递归在左子树中查找 p 和 q
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 递归在右子树中查找 p 和 q
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 如果左子树和右子树都找到了 p 和 q，说明当前节点是最近公共祖先
        if (left != null && right != null) {
            return root;
        }
        // 如果只有左子树找到了 p 或 q，返回左子树的结果
        if (left != null) {
            return left;
        }
        // 如果只有右子树找到了 p 或 q，返回右子树的结果
        return right;
    }
}
