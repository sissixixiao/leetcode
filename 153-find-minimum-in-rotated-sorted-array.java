class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];
            if (nums[hi] < nums[mid]) lo = mid;
            else hi = mid;
        }
        return nums[lo] < nums[hi] ? nums[lo] : nums[hi];
    }
}