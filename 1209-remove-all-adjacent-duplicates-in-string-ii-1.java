class Solution {
    class Node {
        char c;
        int count;
        Node(char cc, int n) {
            c = cc;
            count = n;
        }
    }
    
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(new Node(c, 1));
            } else {
                Node last = stack.peek();
                if (last.c == c) {
                    if (last.count == k - 1) {
                        int count = 0;
                        while (count++ != k - 1) stack.pop();
                    } else {
                        stack.push(new Node(c, stack.peek().count + 1));
                    }
                } else {
                    stack.push(new Node(c, 1));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop().c);
        }
        return sb.toString();
    }
}