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
    class ResultType {
        Node head;
        Node tail;
        ResultType(Node h, Node t) {
            head = h;
            tail = t;
        }
    }
    
    public Node flatten(Node head) {
        return flattenHelper(head).head;
    }
    
    private ResultType flattenHelper(Node node) {
        if (node == null) return new ResultType(node, node);
        Node next = node.next;
        if (next == null && node.child == null) return new ResultType(node, node);
        if (next == null) {
            ResultType r = flattenHelper(node.child);
            node.next = r.head;
            r.head.prev = node;
            node.child = null;
            return new ResultType(node, r.tail);
        }
        if (node.child == null) {
            ResultType r = flattenHelper(node.next);
            return new ResultType(node, r.tail);
        }
        ResultType r1 = flattenHelper(node.child);
        node.child = null;
        node.next = r1.head;
        r1.head.prev = node;
        r1.tail.next = next;
        ResultType r2 = flattenHelper(next);
        r2.head.prev = r1.tail;
        r1.tail.next = r2.head;
        return new ResultType(node, r2.tail);
    }
}