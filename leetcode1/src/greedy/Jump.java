package greedy;

public class Jump {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            // 更新当前能跳到的最远位置
            farthest = Math.max(farthest, i + nums[i]);

            // 到达当前跳跃的边界，需要跳一步
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // 如果已经可以跳到最后，提前结束循环
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
