// Problem: N-Queens II
// Platform: LeetCode
// Problem Number: 52
// Difficulty: Hard
// Topic: Backtracking

class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        // Fill board with X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);

        return count;
    }

    public boolean isSafe(char[][] board, int row, int col) {

        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void nQueens(char[][] board, int row) {

        // One complete solution found
        if (row == board.length) {
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // Choose
                board[row][j] = 'Q';

                // Explore
                nQueens(board, row + 1);

                // Undo / Backtrack
                board[row][j] = 'X';
            }
        }
    }
}
