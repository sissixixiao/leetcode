class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int result = -1;
        int mind = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int a = point[0];
            int b = point[1];
            if (a != x && b != y) continue;
            int d = Math.abs(a - x) + Math.abs(b - y);
            if (d < mind) {
                mind = d;
                result = i;
            }
        }
        return result;
    }
}