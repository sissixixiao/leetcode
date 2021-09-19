class Solution {
    String result;
    int maxLength;
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        if (s.length() == 1) return s;
        for (int i = 0; i < s.length(); i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
        }
        return result;
    }
    
    private void checkPalindrome(String s, int i1, int i2) {
        while (i1 >= 0 && i2 < s.length()) {
            if (s.charAt(i1) == s.charAt(i2)) {
                if (maxLength < i2 - i1 + 1) {
                    maxLength = i2 - i1 + 1;
                    result = s.substring(i1, i2 + 1);
                }
                i1--;
                i2++;
            } else {
                return;
            }
        }
    }
}