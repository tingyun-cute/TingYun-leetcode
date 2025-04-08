package tree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallest {

    public List<Integer> res = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        Arrays.sort(res.toArray(), (a, b) -> (int) a - (int) b);
        return res.get(k - 1);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
    }
}
