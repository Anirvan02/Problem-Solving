class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    two[0] = i;
                    two[1] = j;
                    return two;
                }
            }
        }
        return new int[]{};
    }
}
