package binary;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = right / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                int leftIndex = mid;
                int rightIndex = mid;
                while (leftIndex >= 0 && nums[leftIndex] == target) {
                    leftIndex--;
                }
                while (rightIndex <= nums.length - 1 && nums[rightIndex] == target) {
                    rightIndex++;
                }
                return new int[]{leftIndex + 1, rightIndex - 1};
            } else if (nums[mid] < target) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                right = mid - 1;
                mid = (left + right) / 2;
            }
        }
        return new int[]{-1, -1};
    }
}
