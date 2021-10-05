class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet(wordDict);
        return wordBreak(s, 0, set);
    }
    
    private boolean wordBreak(String s, int start, Set<String> set) {
        if (start == s.length()) return true;
        for (int i = start + 1; i <= s.length(); i++) {
            if (set.contains(s.substring(start, i))) {
                if (wordBreak(s, i, set)) {
                    return true;
                }
            }
        }
        return false;
    }
}