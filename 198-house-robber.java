class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int robTwo = 0;
        int robOne = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            int c = Math.max(robOne, robTwo + nums[i - 1]);
            robTwo = robOne;
            robOne = c;
        }
        return robOne;
    }
}