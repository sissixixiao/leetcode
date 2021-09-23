class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        backtracking(candidates, 0, target, result, new LinkedList<>());
        return result;
    }
    
    private void backtracking(int[] candidates, int start, int remaining, List<List<Integer>> result, List<Integer> cur) {
        if (remaining == 0) {
            result.add(new LinkedList<>(cur));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i != start && candidates[i] == candidates[i - 1]) continue;
                if (candidates[i] > remaining) continue;
                cur.add(candidates[i]);
                backtracking(candidates, i, remaining - candidates[i], result, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}