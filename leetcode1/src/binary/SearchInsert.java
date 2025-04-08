package binary;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums[0] > target) {
            return 0;
        }
        if (nums[0] == target) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[j] == target) {
                return j;
            } else if (nums[i] < target && nums[j] > target) {
                return j;
            } else if (nums[i] > target) {
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
