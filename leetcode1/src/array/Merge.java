package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        // 按照起始点排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();
        int[] left = intervals[0];
        result.add(left);

        for (int i = 1; i < intervals.length; i++) {
            int[] right = intervals[i];
            if (left[1] >= right[0]) {
                // 有重叠，合并
                left[1] = Math.max(left[1], right[1]);
            } else {
                // 无重叠，新增
                result.add(right);
                left = right;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
