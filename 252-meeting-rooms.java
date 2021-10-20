class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length <= 1) return true;
        // sort then compare adjcent meetings
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int i = 1;
        while(i < intervals.length) {
            if (intervals[i - 1][1] > intervals[i][0]) return false;
            i++;
        }
        return true;
    }
}