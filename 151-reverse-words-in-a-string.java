class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        int end = i;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            end = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s.substring(i + 1, end + 1) + " ");
        }
        return sb.toString().trim();
    }
}