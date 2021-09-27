class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int vpre = s.charAt(i - 2) - '0';
            int vcur = s.charAt(i - 1) - '0';
            if (vcur == 0) {
                if (vpre == 1 || vpre == 2) dp[i] = dp[i - 2];
                else return 0;
            } else {
                int v = Integer.parseInt(s.substring(i - 2, i));
                dp[i] = dp[i - 1];
                if (v >= 10 && v <= 26) dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}