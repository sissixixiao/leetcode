class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        int m = 0;
        int count = 0;
        for (int n : nums) {
            if (count == 0) {
                m = n;
                count = 1;
            } else {
                if (m == n) count++;
                else count--;
            }
        }
        return m;
    }
}