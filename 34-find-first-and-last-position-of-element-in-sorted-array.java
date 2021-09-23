class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int n1 = findBound(nums, target, true);
        if (n1 == -1) return new int[]{-1, -1};
        int n2 = findBound(nums, target, false);
        return new int[]{n1, n2};
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isFirst) {
                if (nums[mid] >= target) hi = mid;
                else lo = mid;
            } else {
                if (nums[mid] <= target) lo = mid;
                else hi = mid;
            }
        }
        if (isFirst) return nums[lo] == target ? lo : nums[hi] == target ? hi : -1;
        else return nums[hi] == target ? hi : nums[lo] == target ? lo : -1;
    }
}