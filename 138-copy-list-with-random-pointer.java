/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap();
        Node n = head;
        Node pre = null;
        while (n != null) {
            Node nn = new Node(n.val);
            map.put(n, nn);
            if (pre != null) pre.next = nn;
            pre = nn;
            n = n.next;
        }
        n = head;
        while (n != null) {
            map.get(n).random = map.get(n.random);
            n = n.next;
        }
        return map.get(head);
    }
}