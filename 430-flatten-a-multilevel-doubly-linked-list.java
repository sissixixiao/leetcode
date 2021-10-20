/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node fakeHead = new Node(0, null, head, null);
        flattenHelper(fakeHead, head);
        fakeHead.next.prev = null;
        return fakeHead.next;
    }
    
    // return tail
    private Node flattenHelper(Node prev, Node cur) {
        if (cur == null) return prev;
        prev.next = cur;
        cur.prev = prev;
        Node next = cur.next;
        Node tail = flattenHelper(cur, cur.child);
        cur.child = null;
        return flattenHelper(tail, next);
    }
}