class Solution {
    public int minCost(int[][] costs) {
        int n = costs.length;
        int paintRed = costs[0][0];
        int painBlue = costs[0][1];
        int paintGreen = costs[0][2];
        for (int i = 1; i < n; i++) {
            int r = Math.min(painBlue, paintGreen) + costs[i][0];
            int b = Math.min(paintRed, paintGreen) + costs[i][1];
            int g = Math.min(paintRed, painBlue) + costs[i][2];
            paintRed = r;
            painBlue = b;
            paintGreen = g;
        }
        return Math.min(Math.min(paintRed, painBlue), paintGreen);
    }
}