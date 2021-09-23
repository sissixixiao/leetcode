class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: overflow.
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // The key observation to make is that the problems are occurring because there are more negative signed 32-bit integers than there are positive signed 32-bit integers. 
        
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        int flag = 1;
        if (dividend > 0) {
            dividend *= -1;
            flag *= -1;
        }
        if (divisor > 0) {
            divisor *= -1;
            flag *= -1;
        }
        int result = 0;
        while (dividend <= divisor) {
            dividend -= divisor;
            result++;
        }
        return result * flag;
    }
}