class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if (s.equals(t)) return false;
        int i1 = 0;
        int i2 = 0;
        int n1 = s.length();
        int n2 = t.length();
        if (Math.abs(n1 - n2) >= 2) return false;
        boolean changed = false;
        while (i1 < n1 || i2 < n2) {
            if (i1 == n1) {
                changed = true;
                i2++;
            } else if (i2 == n2) {
                changed = true;
                i1++;
            } else if (s.charAt(i1) == t.charAt(i2)) {
                i1++;
                i2++;
            } else {
                if (changed) return false;
                changed = true;
                if (n1 != n2) {
                    if (n1 < n2) {
                        i2++;
                    } else {
                        i1++;
                    }
                } else {
                    i1++;
                    i2++;
                }
            }
        }
        return i1 == n1 && i2 == n2;
    }
}