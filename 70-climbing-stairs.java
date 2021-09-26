class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            if (a <= b) a += b;
            else b += a;
        }
        return Math.max(a, b);
    }
}