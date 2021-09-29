class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length();
        int n = s2.length();
        int l = s3.length();
        if (m == 0 && n == 0 && l == 0) return true;
        if (m + n != l) return false;
        boolean[] dp = new boolean[n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) dp[0] = true;
                else if (i > 0 && dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) dp[j] = true;
                else if (j > 0 && dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1)) dp[j] = true;
                else dp[j] = false;
            }
        }
        return dp[n];
    }
}