package tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        while (!cur.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode node : cur) {
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            res.add(cur.get(cur.size() - 1).val);
            cur = next;
        }
        return res;
    }
}
