class Solution {
    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4) return new LinkedList();
        List<String> result = new LinkedList();
        backtrack(s, result, new LinkedList(), 0);
        return result;
    }
    
    private void backtrack(String s, List<String> result, List<String> cur, int start) {
        if (cur.size() > 4) return;
        if (start == s.length() && cur.size() == 4) {
            StringBuilder sb = new StringBuilder();
            for (String str : cur) {
                sb.append(str);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length() - 1);
            result.add(sb.toString());
        } else {
            for (int i = 1; i <= 3; i++) {
                if (start + i > s.length()) continue;
                if (s.charAt(start) == '0' && i >= 2) continue;
                String ss = s.substring(start, start + i);
                if (Integer.parseInt(ss) > 255) continue;
                cur.add(ss);
                backtrack(s, result, cur, start + i);
                cur.remove(cur.size() - 1);
            }
        }
    }
}