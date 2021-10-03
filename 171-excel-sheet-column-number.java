class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = (columnTitle.charAt(i) - 'A' + 1) + result * 26;
        }
        return result;
    }
}