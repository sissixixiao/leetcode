class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() != 0) return -1;
        if (needle == null || needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean hasResult = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    hasResult = false;
                    break;
                }
            }
            if (hasResult) return i;
        }
        return -1;
    }
}