class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && isPair(stack.peek(), c)) stack.pop();
            else stack.push(c);
        }
        return stack.isEmpty();
    }
    
    private boolean isPair(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        if (c1 == '[' && c2 == ']') return true;
        if (c1 == '{' && c2 == '}') return true;
        return false;
    }
}