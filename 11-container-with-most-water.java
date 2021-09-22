class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) return 0;
        int max = 0;
        int lo = 0;
        int hi = height.length - 1;
        while (lo < hi) {
            int area = (hi - lo) * Math.min(height[lo], height[hi]);
            max = Math.max(max, area);
            if (height[lo] >= height[hi]) {
                hi--;
            } else lo++;
        }
        return max;
    }
}