class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int layer = 0;
        while (layer < n / 2) {
            for (int i = layer; i < n - 1 - layer; i++) {
                int t = matrix[layer][i];
                matrix[layer][i] = matrix[n - 1 - i][layer];
                matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
                matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - 1 - layer];
                matrix[i][n - 1 - layer] = t;
            }
            layer++;
        }
    }
}