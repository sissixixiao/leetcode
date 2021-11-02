class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return Arrays.copyOf(intervals, 1);
        Arrays.sort(intervals, (int[] a, int[] b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        int index = 1;
        ArrayList<int[]> list = new ArrayList();
        list.add(intervals[0]);
        while (index < intervals.length) {
            int[] pre = list.get(list.size() - 1);
            if (pre[1] < intervals[index][0]) {
                list.add(intervals[index]);
            } else if (pre[1] == intervals[index][0]) {
                pre[1] = intervals[index][1];
            } else {
                pre[0] = Math.min(pre[0], intervals[index][0]);
                pre[1] = Math.max(pre[1], intervals[index][1]);
            }
            index++;
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}