class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int oneBack = 1;
        int twoBack = 1;
        for (int i = 0; i < s.length(); i++) {
            int result = 0;
            if (s.charAt(i) >= '1' && s.charAt(i) <= '9') result = oneBack;
            if (i >= 1 && s.charAt(i - 1) != '0' && Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) result += twoBack;
            if (result == 0) return 0;
            twoBack = oneBack;
            oneBack = result;
        }
        return oneBack;
    }
}