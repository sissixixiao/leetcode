class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = 0;
        int sum = nums[0];
        int result = nums.length + 1;
        while (hi < n) {
            if (sum >= target) {
                result = Math.min(result, hi - lo + 1);
                if (lo < n) sum -= nums[lo++];
            } else {
                hi++;
                if (hi < n) sum += nums[hi];
            }
        }
        return result == nums.length + 1 ? 0 : result;
    }
}