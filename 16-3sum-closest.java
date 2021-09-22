class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum == target) return sum;
                if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;
                if (sum > target) hi--;
                else lo++;
            }
        }
        return result;
    }
}