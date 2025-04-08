package binary;

public class FindMin {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // 最小值在右半部分
                left = mid + 1;
            } else {
                // 最小值在左半部分或当前mid
                right = mid;
            }
        }

        return nums[left];
    }
}
