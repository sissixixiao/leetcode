class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        PriorityQueue<Long> pq = new PriorityQueue();
        pq.offer(1L);
        while (n-- > 1) {
            long v = pq.poll();
            if (!pq.contains(2 * v)) pq.offer(2 * v);
            if (!pq.contains(3 * v)) pq.offer(3 * v);
            if (!pq.contains(5 * v)) pq.offer(5 * v);
        }
        return (int) pq.poll().longValue();
    }
}