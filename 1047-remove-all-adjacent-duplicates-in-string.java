class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                char last = stack.peek();
                if (last == c) stack.pop();
                else stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}