class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Find all unique triplets - deal with dups
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        // traverse the first num
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int lo = i + 1;
            int hi = nums.length - 1;
            // two sum for the last two
            while (lo < hi) {
                if (nums[i] + nums[lo] + nums[hi] == 0) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[lo]);
                    list.add(nums[hi]);
                    result.add(list);
                    while (lo < hi && nums[lo] == list.get(1)) lo++;
                    while (lo < hi && nums[hi] == list.get(2)) hi--;
                } else if (nums[i] + nums[lo] + nums[hi] < 0) lo++;
                else hi--;
            }
        }
        return result;
    }
}