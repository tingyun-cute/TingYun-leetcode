package tree;

import common.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int i = maxDepth(root.left);
        int j = maxDepth(root.right);
        return Math.max(i, j) + 1;
    }
}
