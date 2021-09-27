class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(result, new LinkedList<>(), n, k, 1);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> cur, int n, int k, int start) {
        if (cur.size() == k) {
            result.add(new LinkedList(cur));
        } else {
            for (int i = start; i <= n; i++) {
                cur.add(i);
                backtrack(result, cur, n, k, i + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}