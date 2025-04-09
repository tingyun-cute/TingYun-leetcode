package binary;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 合并两个数组
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        // 对合并后的数组排序
        Arrays.sort(merged);

        // 计算中位数
        int length = merged.length;
        if (length % 2 == 1) {
            // 如果长度为奇数，直接返回中间元素
            return merged[length / 2];
        } else {
            // 如果长度为偶数，返回中间两个元素的平均值
            return (merged[length / 2 - 1] + merged[length / 2]) / 2.0;
        }
    }
}
