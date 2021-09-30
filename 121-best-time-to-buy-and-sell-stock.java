class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int n = prices.length;
        int result = 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] < min) min = prices[i];
            else if (result < prices[i] - min) result = prices[i] - min;
        }
        return result;
    }
}