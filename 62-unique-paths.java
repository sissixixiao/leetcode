class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[m];
        for (int i = 0; i < m; i++) {
            dp[i] = 1;
        }
        while (n > 1) {
            for (int i = 1; i < m; i++) {
                dp[i] += dp[i - 1];
            }
            n--;
        }
        return dp[m - 1];
    }
}