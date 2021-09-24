class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        backtrack(nums, new boolean[nums.length], result, new LinkedList<>());
        return result;
    }
    
    private void backtrack(int[] nums, boolean[] used, List<List<Integer>> result, List<Integer> cur) {
        if (cur.size() == nums.length) {
            result.add(new LinkedList(cur));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i >= 1 && !used[i - 1] && nums[i] == nums[i - 1])) continue;
                used[i] = true;
                cur.add(nums[i]);
                backtrack(nums, used, result, cur);
                cur.remove(cur.size() - 1);
                used[i] = false;
            }
        }
    }
}