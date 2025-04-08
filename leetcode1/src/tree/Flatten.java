package tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Flatten {

    List<Integer> res = new ArrayList<>();
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        innerFlatten(root);
        for (int i = 1; i < res.size(); i++) {
            root.right = new TreeNode(res.get(i));
            root.left = null;
            root = root.right;
        }
    }

    public void innerFlatten(TreeNode root) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        flatten(root.left);
        flatten(root.right);
    }
}
