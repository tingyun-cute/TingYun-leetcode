package tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            res.add(root.val);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }
        return res;
    }
}
