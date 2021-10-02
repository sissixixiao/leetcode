class MinStack {
    Stack<Node> stack;

    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int val) {
        if (stack.isEmpty()) stack.push(new Node(val, val));
        else stack.push(new Node(val, Math.min(getMin(), val)));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
    
    class Node {
        int val;
        int min;
        Node(int v, int m) {
            val = v;
            min = m;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */