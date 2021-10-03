class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber -= 1;
            int n = columnNumber % 26;
            char c = (char) ('A' + n);
            sb.insert(0, c);
            columnNumber /= 26;
        }
        return sb.toString();
    }
}