class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int lo = 0;
        int hi = nums.length - 1;
        int result = -1;
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum >= k) hi--;
            else {
                result = Math.max(result, sum);
                lo++;
            }
        }
        return result;
    }
}