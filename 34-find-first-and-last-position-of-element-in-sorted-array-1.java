class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int n1 = findFirst(nums, target);
        if (n1 == -1) return new int[]{-1, -1};
        int n2 = findLast(nums, target);
        return new int[]{n1, n2};
    }
    
    private int findFirst(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) hi = mid;
            else lo = mid;
        }
        return nums[lo] == target ? lo : nums[hi] == target ? hi : -1;
    }
    
    private int findLast(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid;
            else hi = mid;
        }
        return nums[hi] == target ? hi : nums[lo] == target ? lo : -1;
    }
}