package greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurrence = new int[26]; // 存储每个字符最后出现的位置
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastOccurrence[s.charAt(i) - 'a']); // 更新当前区间的右边界

            if (i == end) { // 当前区间结束
                result.add(end - start + 1);
                start = i + 1; // 开始下一个新区间
            }
        }

        return result;
    }
}
