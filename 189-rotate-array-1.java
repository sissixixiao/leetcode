class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] copy = Arrays.copyOf(nums, n);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[(i - k + n) % n];
        }
    }
}