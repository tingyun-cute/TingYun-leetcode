package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        helper(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] candidates, int start, int target, List<Integer> tmp, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            tmp.add(candidates[i]);
            helper(candidates, i, target- candidates[i], tmp, res);
            tmp.remove(tmp.size() - 1);
        }
    }
}
