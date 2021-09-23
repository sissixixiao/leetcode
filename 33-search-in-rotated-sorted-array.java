class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            // normal binary search can be merge into this
            if (nums[mid] > nums[lo]) {
                if (nums[mid] > target && nums[lo] <= target) hi = mid;
                else lo = mid;
            } else {
                if (nums[mid] < target && nums[hi] >= target) lo = mid;
                else hi = mid;
            }
        }
        return nums[lo] == target ? lo : nums[hi] == target ? hi : -1;
    }
}