class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;
        for (int k = 0; k < n; ++k) {
            int leftMax = 0;
            for (int i = 0; i <= k - 1; ++i) {
                leftMax = Math.max(leftMax, height[i]);
            }
            int rightMax = 0;
            for (int i = k + 1; i < n; ++i) {
                rightMax = Math.max(rightMax, height[i]);
            }
            int water = Math.min(leftMax, rightMax) - height[k];
            totalWater += (water > 0) ? water : 0;
        }
        return totalWater;
    }
}