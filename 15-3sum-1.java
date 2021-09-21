class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) twoSum(nums, i, result);
        }
        return result;
    }
    
    public void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int lo = i + 1;
        int hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum == 0) {
                List<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                list.add(nums[lo++]);
                list.add(nums[hi--]);
                result.add(list);
                while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
            } else if (sum < 0) {
                lo++;
            } else {
                hi--;
            }
        }
    }
}