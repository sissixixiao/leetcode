class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(nums, result, new LinkedList<>());
        return result;
    }
    
    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> cur) {
        if (cur.size() == nums.length) {
            result.add(new LinkedList(cur));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (cur.contains(nums[i])) continue;
                cur.add(nums[i]);
                backtrack(nums, result, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}