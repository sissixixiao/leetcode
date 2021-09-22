class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        if (nums == null || nums.length == 0) return result;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int lo = j + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[j] + nums[lo] + nums[hi];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[lo++], nums[hi--]));
                        while (lo < hi && nums[lo] == nums[lo - 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi + 1]) hi--;
                    } else if (sum < target) lo++;
                    else hi--;
                }
            }
        }
        return result;
    }
}