class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n + 1) * n / 2;
        for (int v : nums) {
            sum -= v;
        }
        return sum;
    }
}