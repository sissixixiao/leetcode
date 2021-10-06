class Solution {
    public void reverseWords(char[] s) {
        int n = s.length;
        int lo = 0;
        int hi = 0;
        while (hi < n) {
            while (hi < n && s[hi] != ' ') hi++;
            reverse(s, lo, hi - 1);
            hi++;
            lo = hi;
        }
        reverse(s, 0, n - 1);
    }
    
    private void reverse(char[] s, int lo, int hi) {
        while (lo < hi) {
            char t = s[lo];
            s[lo] = s[hi];
            s[hi] = t;
            lo++;
            hi--;
        }
    }
}