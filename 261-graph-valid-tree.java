class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (n != edges.length + 1) return false;
        Map<Integer, List<Integer>> map = new HashMap();
        for (int i = 0; i < n; i++) {
            map.put(i, new LinkedList());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList();
        queue.offer(0);
        int count = 0;
        Set<Integer> seen = new HashSet();
        seen.add(0);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;
            for (int nn : map.get(node)) {
                if (!seen.contains(nn)) {
                    queue.offer(nn);
                    seen.add(nn);
                }
            }
        }
        return count == n;
    }
}