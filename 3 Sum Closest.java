class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE / 2;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(sum - target);
                    int diff2 = Math.abs(closestSum - target);
                    if (diff < diff2) {
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
