class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList();
        if (nums == null || nums.length == 0) return result;
        int start = 0;
        int i = 0;
        while (i < nums.length - 1) {
            start = i;
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (i == start) result.add(nums[i] + "");
            else result.add(nums[start] + "->" + nums[i]);
            i++;
        }
        if (i == nums.length - 1) result.add(nums[i] + "");
        return result;
    }
}