package pointer;

public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            result = Math.max(result, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
