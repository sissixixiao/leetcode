class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        int n = s.length();
        int oneBack = 1;
        int twoBack = 1;
        for (int i = 2; i <= n; i++) {
            int result = 0;
            int vpre = s.charAt(i - 2) - '0';
            int vcur = s.charAt(i - 1) - '0';
            if (vcur == 0) {
                if (vpre == 1 || vpre == 2) result = twoBack;
                else return 0;
            } else {
                int v = Integer.parseInt(s.substring(i - 2, i));
                result = oneBack;
                if (v >= 10 && v <= 26) result += twoBack;
            }
            twoBack = oneBack;
            oneBack = result;
        }
        return oneBack;
    }
}