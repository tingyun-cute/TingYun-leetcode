package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        helper(result, new ArrayList<>(), nums);
        return result;

    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(result, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
