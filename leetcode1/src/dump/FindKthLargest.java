package dump;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) ->  o1 - o2 > 0 ? -1 : 1);
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        while (k > 0) {
            k--;
            if (k == 0) {
                return queue.poll();
            }
            queue.poll();
        }
        return 0;
    }

    public int findKthLargest1(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
