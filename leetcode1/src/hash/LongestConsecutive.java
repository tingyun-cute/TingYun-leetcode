package hash;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // 检查是否是连续序列的起点
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) { // 向后查找连续的元素
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak); // 更新最长序列的长度
            }
        }

        return longestStreak;
    }
}

