class MyStack {
    Queue<Integer> q1 = new LinkedList();
    Queue<Integer> q2 = new LinkedList();
    boolean isQ1Active;
    int last;

    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
        isQ1Active = true;
    }
    
    public void push(int x) {
        if (isQ1Active) q1.offer(x);
        else q2.offer(x);
        last = x;
    }
    
    public int pop() {
        int result = 0;
        if (isQ1Active) {
            result = pop(q1, q2);
        } else {
            result = pop(q2, q1);
        }
        isQ1Active = !isQ1Active;
        return result;
    }
    
    private int pop(Queue<Integer> q1, Queue<Integer> q2) {
        if (q1.size() == 1) return q1.poll();
        while (q1.size() > 2) {
            q2.offer(q1.poll());
        }
        last = q1.poll();
        q2.offer(last);
        return q1.poll();
    }
    
    public int top() {
        return last;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */