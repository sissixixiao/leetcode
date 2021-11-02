class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }
        while (index < n) {
            nums[index++] = 0;
        }
    }
}