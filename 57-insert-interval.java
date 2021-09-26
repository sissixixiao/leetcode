class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // binary search find insert position
        // merge with neighbors on two directions <-  ->
        // or directly go through the whole array
        
        // corner case
        int[][] result = new int[1][2];
        result[0] = newInterval;
        if (intervals == null || intervals.length == 0) return result;
        
        List<int[]> list = new LinkedList<>();
        boolean inserted = false;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > newInterval[1]) {
                // no overlap
                if (!inserted) {
                    list.add(newInterval);
                    inserted = true;
                }
                list.add(intervals[i]);
            } else if (intervals[i][1] < newInterval[0]) {
                list.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        
        if (!inserted) list.add(newInterval);
        // list to array
        // int[][] ret = new int[list.size()][2];
        // for (int i = 0; i < list.size(); i++) {
        //     ret[i] = list.get(i);
        // }
        return list.toArray(new int[list.size()][]);
    }
}