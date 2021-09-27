class Solution {
    private boolean wordFound;
    
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    backtrack(board, word, 0, i, j, new boolean[m][n]);
                    if (wordFound) return true;
                }
            }
        }
        return false;
    }
    
    private void backtrack(char[][] board, String word, int index, int i, int j, boolean[][] seen) {
        if (index == word.length()) {
            wordFound = true;
        } else if (i >= 0 && i < board.length && j >= 0 && j < board[0].length
            && !seen[i][j] && board[i][j] == word.charAt(index++)) {
            seen[i][j] = true;
            backtrack(board, word, index, i - 1, j, seen);
            backtrack(board, word, index, i, j - 1, seen);
            backtrack(board, word, index, i + 1, j, seen);
            backtrack(board, word, index, i, j + 1, seen);
            seen[i][j] = false;
        }
    }
}