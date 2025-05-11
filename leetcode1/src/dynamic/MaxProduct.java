package dynamic;

import java.util.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = i; j < nums.length; j++) {
                sum *= nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
