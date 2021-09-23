class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backtrack(n, n, result, new StringBuilder());
        return result;
    }
    
    private void backtrack(int left, int right, List<String> result, StringBuilder cur) {
        if (left == 0 && right == 0) {
            result.add(cur.toString());
        } else {
            if (left > 0) {
                cur.append('(');
                backtrack(left - 1, right, result, cur);
                cur.deleteCharAt(cur.length() - 1);
            }
            if (left < right && right > 0) {
                cur.append(')');
                backtrack(left, right - 1, result, cur);
                cur.deleteCharAt(cur.length() - 1);
            }
        }
    }
}