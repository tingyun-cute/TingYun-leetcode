package tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
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
            res.add(new ArrayList<>());
            for (TreeNode node : cur) {
                res.get(res.size() - 1).add(node.val);
            }
            cur = next;
        }
        return res;
    }
}
