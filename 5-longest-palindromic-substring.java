class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        if (s.length() == 1) return s;
        int start = 0;
        int maxl = 0;
        for (int i = 0; i < s.length(); i++) {
            int l1 = checkPalindrome(s, i, i);
            int l2 = checkPalindrome(s, i, i + 1);
            if (l1 > maxl && l1 > l2) {
                start = i - l1 / 2;
                maxl = l1;
            } else if (l2 > maxl && l1 < l2) {
                start = i - l2 / 2 + 1;
                maxl = l2;
            }
        }
        return s.substring(start, start + maxl);
    }
    
    // return max length
    private int checkPalindrome(String s, int i1, int i2) {
        while (i1 >= 0 && i2 < s.length() && s.charAt(i1) == s.charAt(i2)) {
            i1--;
            i2++;
        }
        return i2 - i1 - 1;
    }
}