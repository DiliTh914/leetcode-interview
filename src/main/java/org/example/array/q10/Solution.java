package org.example.array.q10;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /**
     * Q10
     * <a href="https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/769/">...</a>
     *
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     *
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * Note:
     *
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     *
     * eg:
     * Input: board =
     * [["5","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: true
     *
     *
     * Input: board =
     * [["8","3",".",".","7",".",".",".","."]
     * ,["6",".",".","1","9","5",".",".","."]
     * ,[".","9","8",".",".",".",".","6","."]
     * ,["8",".",".",".","6",".",".",".","3"]
     * ,["4",".",".","8",".","3",".",".","1"]
     * ,["7",".",".",".","2",".",".",".","6"]
     * ,[".","6",".",".",".",".","2","8","."]
     * ,[".",".",".","4","1","9",".",".","5"]
     * ,[".",".",".",".","8",".",".","7","9"]]
     * Output: false
     * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8.
     * Since there are two 8's in the top left 3x3 sub-box, it is invalid.
     */
    public boolean isValidSudoku(char[][] board) {

        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();

        Set<Integer> sq1 = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int x = board[i][j];
                if (x!=46) {
                    if (!row.add(x-48)) {
                        return false;
                    }
                }

                int y = board[j][i];
                if (y!=46) {
                    if (!column.add(y-48)) {
                        return false;
                    }
                }

                if (i%3 == 0 && j%3 == 0) {
                    int m = 0;
                    while(m<3) {
                        int n = 0;
                        while (n<3) {
                            int z = board[i + n][j + m];
                            if (z != 46) {
                                if (!sq1.add(z - 48)) {
                                    return false;
                                }
                            }
                            n++;
                        }
                        m++;
                    }
                }
                sq1.clear();
            }
            row.clear();
            column.clear();

        }

        return true;
    }
}
