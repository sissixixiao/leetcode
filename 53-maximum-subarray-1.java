class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxNum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (maxNum < n) maxNum = n;
            sum += nums[i];
            if (sum < 0) sum = 0;
            if (sum > max) max = sum;
        }
        return max == 0 ? maxNum : max;
    }
}