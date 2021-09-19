class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows == 0) return "";
        if (numRows == 1) return s;
        // total row number
        int n = numRows * 2 - 2;
        // current row number
        int row = 0;
        int index = 0;
        int rindex = 0;
        StringBuilder sb = new StringBuilder();
        while (row < numRows) {
            index = row;
            rindex = n - row;
            while (index < s.length()) {
                sb.append(s.charAt(index));
                index += n;
                if (row > 0 && row < numRows - 1 && rindex < s.length()) {
                    sb.append(s.charAt(rindex));
                    rindex += n;
                }
            }
            row++;
        }
        return sb.toString();
    }
}