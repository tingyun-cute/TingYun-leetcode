package substring;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        int res1 = subarraySum(nums1, 2);
        System.out.println(res1);

        int[] nums2 = {1,2,3};
        int res2 = subarraySum(nums2, 3);
        System.out.println(res2);
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // 初始化前缀和为0出现一次
        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            // 检查是否存在前缀和为currentSum - k
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            // 更新当前前缀和的出现次数
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

}
