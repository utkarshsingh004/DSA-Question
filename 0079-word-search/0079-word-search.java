class Solution {
    private boolean helper(char[][] board, int row, int col, int k, String s) {
        int n = board.length;
        int m = board[0].length;

        // if word completely matched
        if (k == s.length()) return true;

        // boundary + char check
        if (row < 0 || row >= n || col < 0 || col >= m || board[row][col] != s.charAt(k)) 
            return false;

        char temp = board[row][col]; // save original char
        board[row][col] = '.';       // mark visited

        // explore 4 directions
        boolean found = 
            helper(board, row - 1, col, k + 1, s) || 
            helper(board, row + 1, col, k + 1, s) || 
            helper(board, row, col - 1, k + 1, s) || 
            helper(board, row, col + 1, k + 1, s);

        board[row][col] = temp; // backtrack (restore)

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(board, i, j, 0, word)) return true;
                }
            }
        }
        return false;
    }
}
