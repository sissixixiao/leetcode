class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findKthSmallest(nums, nums.length - k, 0, nums.length - 1);
    }
    
    private int findKthSmallest(int[] nums, int k, int lo, int hi) {
        if (lo >= hi) return nums[lo];
        int index = partition(nums, lo, hi);
        if (index == k) return nums[index];
        if (index > k) return findKthSmallest(nums, k, lo, index - 1);
        return findKthSmallest(nums, k, index + 1, hi);
    }
    
    private int partition(int[] nums, int start, int end) {
        if (start >= end) return start;
        int lo = start;
        int hi = end - 1;
        int pivot = nums[end];
        while (lo <= hi) {
            while (lo <= hi && nums[lo] < pivot) lo++;
            while (lo <= hi && nums[hi] >= pivot) hi--;
            if (lo <= hi) {
                swap(nums, lo, hi);
                lo++;
                hi--;
            }
        }
        swap(nums, lo, end);
        return lo;
    }
    
    private void swap(int[] nums, int lo, int hi) {
        int t = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = t;
    }
}