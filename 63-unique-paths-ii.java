class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[m];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0 && (i == 0 || (i > 0 && dp[i - 1] == 1))) dp[i] = 1;
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (obstacleGrid[i][j] == 1) dp[i] = 0;
                else if (i != 0) dp[i] += dp[i - 1];
            }
        }
        return dp[m - 1];
    }
}