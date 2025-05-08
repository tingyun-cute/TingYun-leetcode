package substring;

import java.util.*;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow1(nums, k);
        System.out.println(Arrays.toString(res));
    }

    // 暴力
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        List<Integer> tmp = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int left = i;
            int right = i + k - 1;
            if (right >= len - 1) {
                right = len - 1;
                tmp.add(maxWin(nums, left, right));
                break;
            } else {
                tmp.add(maxWin(nums, left, right));
            }
        }
        int[] res = new int[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    private static int maxWin(int[] nums, int left, int right) {
        int max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    // 递归
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];
        for (int i = k; i < n; ++i) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            ans[i -k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
