class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            if (nums[mid] < nums[mid - 1]) hi = mid;
            else lo = mid;
        }
        return nums[lo] >= nums[hi] ? lo : hi;
    }
}