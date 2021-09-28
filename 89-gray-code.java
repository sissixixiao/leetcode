class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> cur = new LinkedList<>();
        cur.add(0);
        Set<Integer> seen = new HashSet();
        seen.add(0);
        backtrack(n, cur, seen);
        return cur;
    }
    
    private boolean backtrack(int n, List<Integer> cur, Set<Integer> seen) {
        int last = cur.get(cur.size() - 1);
        if (cur.size() == (1 << n)) {
            return isValid(last, 0);
        } else {
            // find off by 1, continue backtrack
            for (int i = 0; i < n; i++) {
                int num = last ^ (1 << i);
                if (seen.contains(num)) continue;
                cur.add(num);
                seen.add(num);
                if (backtrack(n, cur, seen)) return true;
                cur.remove(cur.size() - 1);
                seen.remove(num);
            }
        }
        return false;
    }
    
    private boolean isValid(int n1, int n2) {
        int xor = n1 ^ n2;
        return xor != 0 && (xor & (xor - 1)) == 0;
    }
}