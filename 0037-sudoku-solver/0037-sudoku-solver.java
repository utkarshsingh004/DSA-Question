class Solution {
    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {  // ✅ fixed here
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    private boolean solve(char[][] board, int row, int col) {
        if (row == 9) return true; // ✅ finished solving
        
        if (board[row][col] != '.') {
            if (col != 8) return solve(board, row, col + 1);
            else return solve(board, row + 1, 0);
        } else {
            for (char c = '1'; c <= '9'; c++) {
                if (isValid(board, row, col, c)) {
                    board[row][col] = c;
                    boolean solved;
                    if (col != 8) solved = solve(board, row, col + 1);
                    else solved = solve(board, row + 1, 0);
                    if (solved) return true; // ✅ stop recursion when solved
                    board[row][col] = '.'; // backtrack
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}
