package array;

import java.util.Arrays;
import java.util.Collections;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] right = Arrays.copyOfRange(nums, len - k, len);
        int[] left = Arrays.copyOfRange(nums, 0, len - k);
        for (int i = 0; i < right.length; i++) {
            nums[i] = right[i];
        }
        for (int i = 0; i < left.length; i++) {
            nums[i + k] = left[i];
        }
    }
}
