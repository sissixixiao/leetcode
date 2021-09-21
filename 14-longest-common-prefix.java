class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }
    
    private String longestCommonPrefix(String[] strs, int lo, int hi) {
        if (lo == hi) return strs[lo];
        int mid = lo + (hi - lo) / 2;
        String r1 = longestCommonPrefix(strs, lo, mid);
        String r2 = longestCommonPrefix(strs, mid + 1, hi);
        return commonPrefix(r1, r2);
    }
    
    private String commonPrefix(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return s1.substring(0, i);
        }
        return s1.substring(0, min);
    }
}