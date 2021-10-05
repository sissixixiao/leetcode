class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        int result = 0;
        for (String s : tokens) {
            if (!"+-*/".contains(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                int n1 = stack.pop();
                int n2 = stack.pop();
                if (s.equals("+")) stack.push(n2 + n1);
                else if (s.equals("-")) stack.push(n2 - n1);
                else if (s.equals("*")) stack.push(n2 * n1);
                else if (s.equals("/")) stack.push(n2 / n1);
            }
        }
        return stack.pop();
    }
}