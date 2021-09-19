class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0) return "";
        if (numRows == 1) return s;
        int n = numRows * 2 - 2;
        StringBuilder[] sbs = new StringBuilder[n];
        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }
        
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            index %= n;
            if (index <= n / 2) {
                sbs[index].append(s.charAt(i));
            } else {
                sbs[n - index].append(s.charAt(i));
            }
            index++;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            result.append(sb);
        }
        return result.toString();
    }
}