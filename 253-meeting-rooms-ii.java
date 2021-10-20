class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 1) return 1;
        // sort
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        // min heap - default
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int[] interval : intervals) {
            if (!pq.isEmpty()) {
                int n = pq.peek();
                if (n <= interval[0]) {
                    pq.poll();
                }
            }
            pq.offer(interval[1]);
        }
        return pq.size();
    }
}