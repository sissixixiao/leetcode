class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) return 0;
        int flag = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                flag = -1;
            }
            i++;
        }
        long result = 0;
        while (i <= s.length()) {
            if (flag * result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (flag * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (i == s.length()) break;
            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;
            result = result * 10 + (s.charAt(i++) - '0');
        }
        return (int) (flag * result);
    }
}