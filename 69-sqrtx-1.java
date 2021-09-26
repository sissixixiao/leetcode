class Solution {
    public int mySqrt(int x) {
        if (x <= 1) return x;
        int lo = 1;
        int hi = x / 2;
        long p = 0;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            p = (long) mid * mid;
            if (p == x) return mid;
            if (p < x) lo = mid;
            else hi = mid;
        }
        return (long) hi * hi <= x ? hi : lo;
    }
}