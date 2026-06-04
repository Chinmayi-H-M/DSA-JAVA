// Problem: Valid Sudoku
// Platform: LeetCode
// Difficulty: Medium
// Topic: Matrix

class Solution {

    // Time Complexity: O(81) ≈ O(1)
    // Space Complexity: O(1)

    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                // Skip empty cells
                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0';

                // Determine 3x3 box index
                int box = (i / 3) * 3 + (j / 3);

                // Duplicate found
                if (rows[i][num] ||
                    cols[j][num] ||
                    boxes[box][num]) {

                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
}

/*
Approach:
1. Track numbers seen in each row.
2. Track numbers seen in each column.
3. Track numbers seen in each 3x3 box.
4. If a number appears again in the same row,
   column, or box, return false.
5. Otherwise return true.
*/
