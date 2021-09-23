class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        
        // check row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (set.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.') set.add(board[i][j]);
            }
            set.clear();
        }
        
        // check column
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (set.contains(board[j][i])) {
                    return false;
                }
                if (board[j][i] != '.') set.add(board[j][i]);
            }
            set.clear();
        }
        
        // check 3x3 box
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[0].length; j += 3) {
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        if (set.contains(board[i + r][j + c])) {
                            return false;
                        }
                        if (board[i + r][j + c] != '.') set.add(board[i + r][j + c]);
                    }
                }
                set.clear();
            }
        }
        
        return true;
    }
}