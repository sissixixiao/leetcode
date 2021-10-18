public class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.isEmpty()) return s;

        int maxIndex = 0;
        for(int i = s.length() - 1; i >= 0; --i) {
            if (_isPalindrome(s, 0, i)) {
                maxIndex = i;
                break;
            }
        }

        if (maxIndex == s.length() - 1) return s;

        StringBuilder sb = new StringBuilder(s.substring(maxIndex + 1, s.length()));
        return sb.reverse().append(s).toString();
    }

    private boolean _isPalindrome(String s, int l, int r){
        if (s == null || s.isEmpty()) return true;

        while(l <= r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}