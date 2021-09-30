class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int layer = triangle.size() - 1;
        int[] dp = new int[triangle.get(layer).size()];
        while (layer >= 0) {
            List<Integer> list = triangle.get(layer);
            for (int i = 0; i < list.size(); i++) {
                if (layer != triangle.size() - 1) dp[i] = list.get(i) + Math.min(dp[i], dp[i + 1]);
                else dp[i] = list.get(i);
            }
            layer--;
        }
        return dp[0];
    }
}