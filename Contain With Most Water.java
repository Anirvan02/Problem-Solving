class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int curr_area = Math.min(height[left], height[right]) * (right - left);

            if (curr_area > max_area) {
                max_area = curr_area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_area;
    }
}
