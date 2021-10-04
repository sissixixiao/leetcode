class Solution {
    boolean[][] table;
    
    public List<List<String>> partition(String s) {
        init(s);
        List<List<String>> result = new LinkedList();
        backtrack(s, 0, result, new LinkedList());
        return result;
    }
    
    private void init(String s) {
        int n = s.length();
        table = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j + 1 > i - 1 || table[j + 1][i - 1]) table[j][i] = true;
                }
            }
        }
    }
    
    private void backtrack(String s, int start, List<List<String>> result, List<String> cur) {
        if (start >= s.length()) result.add(new LinkedList(cur));
        else {
            for (int i = start; i < s.length(); i++) {
                if (table[start][i]) {
                    cur.add(s.substring(start, i + 1));
                    backtrack(s, i + 1, result, cur);
                    cur.remove(cur.size() - 1);
                }
            }
        }
    }
}