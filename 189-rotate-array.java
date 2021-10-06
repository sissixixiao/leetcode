class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rotate(nums, 0, n - k - 1);
        rotate(nums, n - k, n - 1);
        rotate(nums, 0, n - 1);
    }
    
    private void rotate(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int t = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = t;
            lo++;
            hi--;
        }
    }
}