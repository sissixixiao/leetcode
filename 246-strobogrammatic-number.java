class Solution {
    public boolean isStrobogrammatic(String num) {
        int lo = 0;
        int hi = num.length() - 1;
        while (lo <= hi) {
            if (!isPair(num.charAt(lo++), num.charAt(hi--))) return false;
        }
        return true;
    }
    
    private boolean isPair(char a, char b) {
        if (a == '6' && b == '9') return true;
        if (a == '9' && b == '6') return true;
        if (a == '0' && b == '0') return true;
        if (a == '1' && b == '1') return true;
        if (a == '8' && b == '8') return true;
        return false;
    }
}