/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> map = new HashMap();
        Queue<Node> queue = new LinkedList();
        queue.offer(node);
        map.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            for (Node nn : n.neighbors) {
                if (!map.containsKey(nn)) {
                    map.put(nn, new Node(nn.val));
                    queue.offer(nn);
                }
                map.get(n).neighbors.add(map.get(nn));
            }
        }
        return map.get(node);
    }
}