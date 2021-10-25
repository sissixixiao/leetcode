class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // a1 + a2 - overlap
        // int a = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        // int b = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int a = (ax2 - ax1) * (ay2 - ay1);
        int b = (bx2 - bx1) * (by2 - by1);
        int o = (Math.min(ax2, bx2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1));
        if (Math.min(ax2, bx2) - Math.max(ax1, bx1) <= 0 || Math.min(ay2, by2) - Math.max(ay1, by1) <= 0) return a + b;
        return a + b - o;
    }
}