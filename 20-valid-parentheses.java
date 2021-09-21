class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length() % 2 == 1) return false;
        char[] stack = new char[s.length()];
        int len = 0;
        for (char c : s.toCharArray()) {
            if (len == 0 || c == '(' || c == '[' || c == '{') {
                stack[len++] = c;
            } else {
                if (c == ')') {
                    if (stack[len - 1] == '(') len--;
                    else return false;
                }
                if (c == ']') {
                    if (stack[len - 1] == '[') len--;
                    else return false;
                }
                if (c == '}') {
                    if (stack[len - 1] == '{') len--;
                    else return false;
                }
                
            }
        }
        return len == 0;
    }
}