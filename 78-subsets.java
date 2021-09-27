class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList();
        backtrack(result, new LinkedList(), nums, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> cur, int[] nums, int start) {
        if (start <= nums.length) {
            result.add(new LinkedList(cur));
            for (int i = start; i < nums.length; i++) {
                cur.add(nums[i]);
                backtrack(result, cur, nums, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}