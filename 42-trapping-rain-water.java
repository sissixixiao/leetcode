class Solution {
    public int trap(int[] height) {
        if (height == null || height.length <= 1) return 0;
        int n = height.length;
        int lo = 0;
        int hi = n - 1;
        int lmax = 0;
        int rmax = 0;
        int result = 0;
        while (lo < hi) {
            if (height[lo] <= height[hi]) {
                if (lmax > height[lo]) {
                    result += lmax - height[lo];
                } else {
                    lmax = height[lo];
                }
                lo++;
            } else {
                if (rmax > height[hi]) {
                    result += rmax - height[hi];
                } else {
                    rmax = height[hi];
                }
                hi--;
            }
        }
        return result;
    }
}