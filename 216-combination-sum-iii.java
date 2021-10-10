class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList();
        backtrack(result, new LinkedList(), 1, k, n);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> cur, int start, int k, int remaining) {
        if (cur.size() > k || remaining < 0) {
            return;
        } else if (cur.size() == k && remaining == 0) {
            result.add(new LinkedList(cur));
        } else {
            for (int i = start; i <= 9; i++) {
                cur.add(i);
                backtrack(result, cur, i + 1, k, remaining - i);
                cur.remove(cur.size() - 1);
            }
        }
    }
}