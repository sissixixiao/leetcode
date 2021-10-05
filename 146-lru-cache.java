class LRUCache {
    // doubly linked list
    
    int cap;
    Map<Integer, Node> map;
    Node head; // oldest
    Node tail; // newest
    
    class Node {
        int key;
        int value;
        Node pre;
        Node next;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    public LRUCache(int capacity) {
        map = new HashMap();
        cap = capacity;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node n = map.get(key);
        if (n == tail) return n.value;
        Node pre = n.pre;
        Node next = n.next;
        if (pre == null) {
            head = next;
        } else {
            pre.next = next;
        }
        if (next != null) next.pre = pre;
        tail.next = n;
        n.pre = tail;
        tail = n;
        return n.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.get(key).value = value;
            get(key);
            return;
        }
        if (map.size() == cap) {
            map.remove(head.key);
            if (cap == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.pre = null;
            }
        }
        Node node = new Node(key, value);
        map.put(key, node);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.pre = tail;
            tail = node;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */