class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int count = 0;
        int[] result = new int[numCourses];
        int index = 0;
        
        Map<Integer, List<Integer>> nbs = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            nbs.put(i, new LinkedList<>());
        }
        
        int[] indegree = new int[numCourses];
        for (int[] p: prerequisites) {
            indegree[p[0]]++;
            nbs.get(p[1]).add(p[0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        while (!queue.isEmpty()) {
            int n = queue.poll();
            count++;
            result[index++] = n;
            for (int nb : nbs.get(n)) {
                indegree[nb]--;
                if (indegree[nb] == 0) {
                    queue.offer(nb);
                }
            }
        }
        if (count != numCourses) return new int[0];
        return result;
    }
}